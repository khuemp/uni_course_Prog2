package ast.expressions;

public class NegExpression extends UnaryExpression {

    public NegExpression(Expression operand) {
        super(operand, Operator.NEG);
    }

    @Override
    public int eval() {
        return -this.operand.eval();
    }


}
