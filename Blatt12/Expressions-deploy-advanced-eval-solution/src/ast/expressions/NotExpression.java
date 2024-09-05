package ast.expressions;

import ast.visitors.Visitor;

public class NotExpression extends UnaryExpression {

    public NotExpression(Expression operand) {
        super(operand, Operator.BNEG);
    }

    @Override
    public int eval() {
        return operand.eval() != 0 ? 0 : 1;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof NotExpression) {
            return this.operand == ((NotExpression) o).operand;
        }
        return false;
    }

}
