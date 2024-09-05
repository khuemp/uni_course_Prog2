package ast.expressions;

public class AndExpression extends BooleanExpression {

    public AndExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.AND);
    }

    @Override
    public int eval() {
        return lhs.eval() != 0 && rhs.eval() != 0 ? 1 : 0;
    }

}
