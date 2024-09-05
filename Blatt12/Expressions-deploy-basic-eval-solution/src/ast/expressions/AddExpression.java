package ast.expressions;

public class AddExpression extends BinaryExpression {

    public AddExpression(Expression lhs, Expression rhs) {
        super(lhs, rhs, Operator.ADD);
    }

    @Override
    public int eval() {
        return this.lhs.eval() + this.rhs.eval();
    }

}
