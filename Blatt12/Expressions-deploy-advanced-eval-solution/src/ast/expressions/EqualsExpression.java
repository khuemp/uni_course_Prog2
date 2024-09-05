package ast.expressions;

import ast.visitors.Visitor;

public class EqualsExpression extends BooleanExpression {

    public EqualsExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.EQUALS);
    }

    @Override
    public int eval() {
        return lhs.eval() == rhs.eval() ? 1 : 0;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
