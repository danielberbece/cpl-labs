import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;


public class Test {

    public static void main(String[] args) throws IOException {
        var input = CharStreams.fromFileName("program.txt");

        var lexer = new CPLangLexer(input);
        var tokenStream = new CommonTokenStream(lexer);

        /*
        tokenStream.fill();
        List<Token> tokens = tokenStream.getTokens();
        for (var token : tokens) {
            var text = token.getText();
            var type = CPLangLexer.VOCABULARY.getSymbolicName(token.getType());

            System.out.println(text + " : " + type);
        }
        */

        var parser = new CPLangParser(tokenStream);
        var tree = parser.prog();
        System.out.println(tree.toStringTree(parser));

        // Visitor-ul de mai jos parcurge arborele de derivare și construiește
        // un arbore de sintaxă abstractă (AST).
        var astConstructionVisitor = new CPLangParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitId(CPLangParser.IdContext ctx) {
                return new ASTId(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitInt(CPLangParser.IntContext ctx) {
                return new ASTInt(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitFloat(CPLangParser.FloatContext ctx) {
                return new ASTFloat(ctx.FLOAT().getSymbol());
            }

            @Override
            public ASTNode visitBool(CPLangParser.BoolContext ctx) {
                return new ASTBool(ctx.BOOL().getSymbol());
            }

            @Override
            public ASTNode visitPlusMinus(CPLangParser.PlusMinusContext ctx) {
                return new ASTPlusMinus((ASTExpression) visit(ctx.left), ctx.op, (ASTExpression)visit(ctx.right));
            }

            @Override
            public ASTNode visitMultDiv(CPLangParser.MultDivContext ctx) {
                return new ASTMulDiv((ASTExpression)visit(ctx.left), ctx.op, (ASTExpression)visit(ctx.right));
            }

            @Override
            public ASTNode visitUnaryMinus(CPLangParser.UnaryMinusContext ctx) {
                return new ASTUnaryMinus(ctx.MINUS().getSymbol(), (ASTExpression) visit(ctx.e));
            }

            @Override
            public ASTNode visitIf(CPLangParser.IfContext ctx) {
                return new ASTIf((ASTExpression)visit(ctx.cond),
                              (ASTExpression)visit(ctx.thenBranch),
                              (ASTExpression)visit(ctx.elseBranch),
                              ctx.start);
            }

            @Override
            public ASTNode visitParen(CPLangParser.ParenContext ctx) {
                return visit(ctx.e);
            }

            @Override
            public ASTNode visitAssign(CPLangParser.AssignContext ctx) {
                return new ASTAssign(ctx.name, ctx.ASSIGN().getSymbol(), (ASTExpression)visit(ctx.e));
            }

            @Override
            public ASTNode visitVarDef(CPLangParser.VarDefContext ctx) {
                if (ctx.init == null) {
                    return new ASTVarDef (ctx.name, ctx.TYPE().getSymbol(), null);
                } else {
                    return new ASTVarDef (ctx.name, ctx.TYPE().getSymbol(), (ASTExpression)visit(ctx.init));
                }
            }

            @Override
            public ASTNode visitProg(CPLangParser.ProgContext ctx) {
                ArrayList<ASTDef> defs = new ArrayList<>();
                ArrayList<ASTExpression> exprs = new ArrayList<>();
                for (CPLangParser.DefinitionContext def: ctx.definition()) {
                    defs.add((ASTDef) visit(def));
                }
                for (CPLangParser.ExprContext expr: ctx.expr()) {
                    exprs.add((ASTExpression)visit(expr));
                }
                return new ASTProg(defs, exprs);
            }

            // TODO3: Completati cu alte metode pentru a trece din arborele
            // generat automat in reprezentarea AST-ului dorit

        };

        // ast este AST-ul proaspăt construit pe baza arborelui de derivare.
        var ast = astConstructionVisitor.visit(tree);

        // Acest visitor parcurge AST-ul generat mai sus.
        // ATENȚIE! Avem de-a face cu două categorii de visitori:
        // (1) Cei pentru arborele de derivare, care extind
        //     CPLangParserBaseVisitor<T> și
        // (2) Cei pentru AST, care extind ASTVisitor<T>.
        // Aveți grijă să nu îi confundați!
        var printVisitor = new ASTVisitor<Void>() {
            int indent = 0;

            @Override
            public Void visit(ASTId id) {
                printIndent("ID " + id.token.getText());
                return null;
            }

            @Override
            public Void visit(ASTInt intt) {
                printIndent("INT " + intt.token.getText());
                return null;
            }

            @Override
            public Void visit(ASTIf iff) {
                printIndent("IF");
                indent++;
                iff.cond.accept(this);
                iff.thenBranch.accept(this);
                iff.elseBranch.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(ASTFloat floatt) {
                return null;
            }

            @Override
            public Void visit(ASTBool bool) {
                return null;
            }

            @Override
            public Void visit(ASTPlusMinus add) {
                return null;
            }

            @Override
            public Void visit(ASTMulDiv mulDiv) {
                return null;
            }

            @Override
            public Void visit(ASTUnaryMinus unaryMinus) {
                return null;
            }

            @Override
            public Void visit(ASTAssign assign) {
                printIndent("ASSIGN: " + assign.id.getText());
                indent++;
                assign.expr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(ASTVarDef varDef) {
                printIndent("var defined: " + varDef.id.getText());
                return null;
            }

            @Override
            public Void visit(ASTProg prog) {
                printIndent("prog");
                indent++;
                for (ASTDef def: prog.definitions) {
                    def.accept(this);
                }

                for (ASTExpression e: prog.expressions) {
                    e.accept(this);
                }
                indent--;
                return null;
            }

            // TODO4: Afisati fiecare nod astfel incat nivelul pe care acesta
            // se afla in AST sa fie reprezentat de numarul de tab-uri.
            // Folositi functia de mai jos 'printIndent' si incrementati /
            // decrementati corespunzator numarul de tab-uri

            void printIndent(String str) {
                for (int i = 0; i < indent; i++)
                    System.out.print("\t");
                System.out.println(str);
            }
        };

        // TODO5: Creati un program CPLang care sa cuprinda cat mai multe
        // constructii definite in laboratorul de astazi. Scrieti codul CPLang
        // intr-un fisier txt si modificati fisierul de input de la inceputul
        // metodei 'main'

        System.out.println("The AST is");
        ast.accept(printVisitor);
    }


}
