package ast.expressions;

import ast.visitors.Visitor;

public class AddExpression extends BinaryExpression {

    public AddExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.ADD);
    }

    @Override
    public int eval() {
        return this.lhs.eval() + this.rhs.eval();
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
