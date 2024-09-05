package ast.expressions;

/**
 * Diese Klasse repräsentiert eine Konstante in einer Formel.
 */
public class ConstExpression implements Expression {

    private int value;

    public ConstExpression(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * Überprüft auf Gleichheit mit einem anderen Objekt. Dieses Objekt ist gleich einem anderen genau dann, wenn: - Das
     * andere Object auch eine Expression ist - Die andere Expression zum gleichen Wert auswertet wie diese
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Expression) {
            return this.eval() == ((Expression) other).eval();
        }
        return false;
    }

    /**
     * Liefert die String repräsentation der Konstante
     */
    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    /**
     * Gibt den Wert der Konstante zurück
     *
     * @return Wert der Konstante
     */
    @Override
    public int eval() {
        return this.value;
    }

    @Override
    public void print() {
        System.out.print(this.toString());
    }

}