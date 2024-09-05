package ast.expressions;

import ast.visitors.Visitor;

public class DivExpression extends BinaryExpression {

    public DivExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.DIV);
    }

    @Override
    public int eval() {
        return this.lhs.eval() / this.rhs.eval();
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
