public interface ASTVisitor<T> {
    T visit(ASTId id);
    T visit(ASTInt intt);
    T visit(ASTIf iff);
    T visit(ASTFloat floatt);
    T visit(ASTBool bool);
    T visit(ASTPlusMinus plusMinus);
    T visit(ASTMulDiv mulDiv);
    T visit(ASTUnaryMinus unaryMinus);
    T visit(ASTAssign assign);
    T visit(ASTVarDef varDef);
    T visit(ASTProg prog);
    // TODO2: Adăugați metode pentru fiecare clasă definită anterior
}
