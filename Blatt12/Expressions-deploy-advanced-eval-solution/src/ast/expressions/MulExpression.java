package ast.expressions;

import ast.visitors.Visitor;

public class MulExpression extends BinaryExpression {

    public MulExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.MUL);
    }

    @Override
    public int eval() {
        return this.lhs.eval() * this.rhs.eval();
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
