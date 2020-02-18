parser grammar CPLangParser;

/* Fișierele generate de analizorul lexical trebuie situate în același director
 * cu analizorul sintactic.
 */
options {
    tokenVocab = CPLangLexer;
}

/* Regulă de start a parser-ului */
/* În CPLang, un program este format din definiții și expresii,
 * ce vor fi detaliate mai jos.
 */
prog
    :   ((definition | expr) SEMI)* EOF
    ;
   
/* TODO1 Adaugă regula pentru definițiile de variabile
/* Există definiții pentru variabile (opțional cu inițializare):
 * -> type name (= expr)?
 * și definiții pentru funcții:
 * -> type name (type name_formal1, type name_formal2, ..) { expr }.
 */

definition_without_assign: TYPE ID  #vardef
    ;
definition: definition_without_assign (ASSIGN expr)?      #varassign
    | TYPE ID LPAREN (definition_without_assign (COMMA definition_without_assign)*)? RPAREN LBRACE expr RBRACE   #methoddef
	;
	
/* Expresie.
 * O expresie poate fi:
 * -> apel de funcție;
 * -> operator unar: -(expr)
 *		-x+y se va evalua la (-x) + y, nu la -(x + 1) !!!
 * -> operație aritmetică: *, / , +, -;
 *		-> operație relațională: <, <=, ==
 *		!!!Operatorii relaționali au prioritate mai mică decât cei
 *		aritmetici;
 * -> instructiunea if;
 * -> atribuire de variabilă;
 * -> expresie parantezată.
 * 
 * În absența numelor din dreapta, precedate de # (if, id și int), în listenerii
 * și visitorii generați automat, ar fi definit doar contextul ExprContext, cu
 * informații amestecate pentru toate cele trei alternative. Însă, în prezența
 * celor trei etichete, care diferențiază alternativele, vor fi generate și
 * cele trei contexte particulare, IfContext, IdContext și IntContext, cu
 * informații specifice fiecărei alternative.
 * 
 * Pentru fiecare dintre regulile lexicale sau sintactice referite într-o regulă
 * sintactică, obiectul Context va conține o funcție cu numele regulii. Spre
 * exemplu, obiectul IntContext include o metodă, INT(), care va întoarce
 * nodul aferent din arborele de derivare. Însă, având în vedere că alternativa
 * if conține referiri multiple la regula expr, obiectul IfContext va conține
 * o metodă expr(), care, în loc să întoarcă un singur nod din arbore, va
 * întoarce o listă ordonată cu cele trei noduri menționate, aferente condiției,
 * ramurii THEN și ramurii ELSE. De asemenea, există și o variantă
 * supraîncărcată a metodei, expr(int index), care întoarce nodul de la poziția
 * index, între 0 și 2.
 *  
 * În cazul în care referirea la un nod prin poziția sa este insuficient de
 * expresivă, se pot adăuga etichete pentru fiecare referire în parte, ca în
 * cazul cond, thenBranch și elseBranch. În consecință, obiectul IfContext va
 * conține și câmpurile cond, thenBranch și elseBranch, având tipurile nodurilor
 * din arbore.
 * 
 * TODO1: Completează gramatica pentru regulile de mai sus.
 * Nu uita si de restul literalilor.
 */
expr
    :   ID LPAREN (expr (COMMA expr)*)? RPAREN                                      # methodcall
    |	IF cond=expr THEN thenBranch=expr ELSE elseBranch=expr FI	# if
    |   expr PLUS expr  #add
    |   expr MULT expr #multiply
    |   expr MINUS expr #subtract
    |   expr DIV expr #divide
    |   ID ASSIGN expr #assign
    |   LPAREN expr RPAREN #parant
    |   MINUS expr #minusunar
    |   expr EQUAL expr #eq
    |   expr LT expr #lessthen
    |   expr LE expr #lessequal
    |	ID                                                          # id
    |	INT                                                         # int
    |   BOOL    #bool
    |   FLOAT   #float
    ;
