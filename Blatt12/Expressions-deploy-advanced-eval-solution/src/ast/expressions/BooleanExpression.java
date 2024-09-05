package ast.expressions;

public abstract class BooleanExpression extends BinaryExpression {

    BooleanExpression(Expression lhs, Expression rhs, Operator operator) {
        super(lhs, rhs, operator);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BooleanExpression) {
            return this.lhs.equals(((BooleanExpression) o).lhs) && this.rhs.equals(((BooleanExpression) o).rhs) &&
                   this.operator == ((BooleanExpression) o).operator;
        }
        return false;
    }

}
