import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

// Rădăcina ierarhiei de clase reprezentând nodurile arborelui de sintaxă
// abstractă (AST). Singura metodă permite primirea unui visitor.
public abstract class ASTNode {
    public <T> T accept(ASTVisitor<T> visitor) {
        return null;
    }
}

class ASTProg extends ASTNode {
    ArrayList<ASTDef> definitions;
    ArrayList<ASTExpression> expressions;

    ASTProg(List<ASTDef> defs, List<ASTExpression> exprs) {
        expressions = new ArrayList<>(exprs);
        definitions = new ArrayList<>(defs);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

abstract class ASTDef extends ASTNode {
    Token token;

    ASTDef(Token token) {
        this.token = token;
    }
}

// Orice expresie.
abstract class ASTExpression extends ASTNode {
    // Reținem un token descriptiv al expresiei, pentru a putea afișa ulterior
    // informații legate de linia și coloana eventualelor erori semantice.
    Token token;

    ASTExpression(Token token) {
        this.token = token;
    }
}

// Identificatori
class ASTId extends ASTExpression {
    ASTId(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTVarDef extends ASTDef {
    Token id;
    ASTExpression expr;

    ASTVarDef(Token id, Token type, ASTExpression expr) {
        super(type);
        this.id = id;
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
// Literali întregi
class ASTInt extends ASTExpression {
    ASTInt(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTFloat extends ASTExpression {
    ASTFloat(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTBool extends ASTExpression {
    ASTBool(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// Construcția if.
class ASTIf extends ASTExpression {
    // Sunt necesare trei câmpuri pentru cele trei componente ale expresiei.
    ASTExpression cond;
    ASTExpression thenBranch;
    ASTExpression elseBranch;

    ASTIf(ASTExpression cond,
          ASTExpression thenBranch,
          ASTExpression elseBranch,
          Token start) {
        super(start);
        this.cond = cond;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTPlusMinus extends ASTExpression {
    ASTExpression left;
    ASTExpression right;

    ASTPlusMinus(ASTExpression left,
                 Token op,
                 ASTExpression right) {
        super(op);
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTMulDiv extends ASTExpression {
    ASTExpression left;
    ASTExpression right;

    ASTMulDiv(ASTExpression left, Token op, ASTExpression right) {
        super(op);
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTUnaryMinus extends  ASTExpression {
    ASTExpression expr;
    ASTUnaryMinus(Token min, ASTExpression expr) {
        super(min);
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ASTAssign extends ASTExpression {
    ASTExpression expr;
    Token id;
    ASTAssign(Token id, Token assign, ASTExpression expr) {
        super(assign);
        this.id = id;
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// TODO1: Definiți restul claselor de care ați avea nevoie. Asigurați-vă
// că moșteniți mereu nodul de bază ASTNode
