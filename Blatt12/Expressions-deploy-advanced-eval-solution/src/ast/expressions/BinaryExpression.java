package ast.expressions;

/**
 * Diese abstrakte Klasse repräsentiert binäre Ausdrücke
 * <p>
 * lhs = linker Operand, rhs = rechter Operand
 */
public abstract class BinaryExpression implements Expression {

    Expression lhs, rhs;
    Operator operator;

    BinaryExpression(Expression lhs, Expression rhs, Operator operator) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.operator = operator;
    }

    public Expression getLhs() {
        return lhs;
    }

    public Expression getRhs() {
        return rhs;
    }

    public Operator getOperator() {
        return operator;
    }

    /**
     * Diese Methode soll zwei beliebige Ausdrücke bezüglich ihres evaluierten Wertes vergleichen. Beachte, dass diese
     * Methode von allen Unterklassen genutzt werden kann.
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Expression) {
            return this.eval() == ((Expression) other).eval();
        }
        return false;
    }

    /**
     * Diese Methode soll den vollständigen Ausdruck als String zurückliefern. Beachte, dass diese Methode von allen
     * Unterklassen genutzt werden kann.
     * <p>
     * Hinweise: benutzte die toString() Methode des Enum Operator
     */
    @Override
    public String toString() {
        return "(" + this.lhs.toString() + " " + operator.toString() + " " + this.rhs.toString() + ")";
    }

    /**
     * Diese Methode soll den vollständigen Ausdruck auf der Kommandozeile ausgeben. Beachte, dass diese Methode von
     * allen Unterklassen genutzt werden kann.
     */
    public void print() {
        System.out.print(this.toString());
    }

}
