package ast.expressions;

/**
 * Diese abstrakte Klasse repräsentiert unäre Ausdrücke
 */
public abstract class UnaryExpression implements Expression {

    Expression operand;
    private Operator operator;

    UnaryExpression(Expression operand, Operator operator) {
        this.operand = operand;
        this.operator = operator;
    }

    public Expression getOperand() {
        return operand;
    }

    public Operator getOperator() {
        return operator;
    }

    /**
     * Diese Methode soll den vollständigen Ausdruck auf der Kommandozeile ausgeben.
     * Sie kann von allen Unterklassen genutzt werden.
     */
    public void print() {
        System.out.print(this.toString());
    }

    /**
     * Diese Methode soll zwei unäre Ausdrücke bezüglich ihres evaluierten Wertes
     * vergleichen. Sie kann von allen Unterklassen genutzt werden.
     */
    @Override
    public boolean equals(Object other) {
        // DONE: implement me
        if (other instanceof Expression) {
            return this.eval() == ((Expression) other).eval();
        }
        return false;
    }

    /**
     * Diese Methode soll den vollständigen Ausdruck als String zurückliefern. Sie
     * kann von allen Unterklassen genutzt werden.
     */
    @Override
    public String toString() {
        // DONE: implement me
        return "(" + this.operator.toString() + this.operand.toString() + ")";
    }

}
