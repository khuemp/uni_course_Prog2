package ast.expressions;

public class SubExpression extends BinaryExpression {

    public SubExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.SUB);
    }

    @Override
    public int eval() {
        return this.lhs.eval() - this.rhs.eval();
    }

}
