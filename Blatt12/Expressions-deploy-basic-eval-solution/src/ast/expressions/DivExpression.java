package ast.expressions;

public class DivExpression extends BinaryExpression {

    public DivExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.DIV);
    }

    @Override
    public int eval() {
        return this.lhs.eval() / this.rhs.eval();
    }

}
