package ast.expressions;

public class NotExpression extends UnaryExpression {

    public NotExpression(Expression operand) {
        super(operand, Operator.BNEG);
    }

    @Override
    public int eval() {
        return operand.eval() != 0 ? 0 : 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof NotExpression) {
            return this.operand == ((NotExpression) o).operand;
        }
        return false;
    }

}
