package ast.expressions;

public class EqualsExpression extends BooleanExpression {

    public EqualsExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.EQUALS);
    }

    @Override
    public int eval() {
        return lhs.eval() == rhs.eval() ? 1 : 0;
    }

}
