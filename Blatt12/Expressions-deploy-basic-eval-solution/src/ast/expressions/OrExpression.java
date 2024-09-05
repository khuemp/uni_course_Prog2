package ast.expressions;

public class OrExpression extends BooleanExpression {

    public OrExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.OR);
    }

    @Override
    public int eval() {
        return lhs.eval() != 0 || rhs.eval() != 0 ? 1 : 0;
    }

}
