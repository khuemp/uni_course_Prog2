package ast.expressions;

import ast.visitors.Visitor;

public class XorExpression extends BooleanExpression {

    public XorExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.XOR);
    }

    @Override
    public int eval() {
        return new OrExpression(new AndExpression(new NotExpression(lhs), rhs),
                                new AndExpression(lhs, new NotExpression(rhs))).eval();
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
