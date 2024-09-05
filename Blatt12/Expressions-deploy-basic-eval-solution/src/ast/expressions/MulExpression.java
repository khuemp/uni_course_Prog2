package ast.expressions;

public class MulExpression extends BinaryExpression {

    public MulExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.MUL);
    }

    @Override
    public int eval() {
        return this.lhs.eval() * this.rhs.eval();
    }

}
