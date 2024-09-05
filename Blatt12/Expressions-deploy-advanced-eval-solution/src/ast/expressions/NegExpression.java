package ast.expressions;

import ast.visitors.Visitor;

public class NegExpression extends UnaryExpression {

    public NegExpression(Expression operand) {
        super(operand, Operator.NEG);
    }

    @Override
    public int eval() {
        return -this.operand.eval();
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
