package ast.expressions;

/**
 * Diese Aufzählung stellt die nötigen Operatoren zur Verfügung
 */
public enum Operator {
    ADD("+"), MUL("*"), SUB("-"), DIV("/"), NEG("~");
    private String repr;

    Operator(String repr) {
        this.repr = repr;
    }

    /**
     * Diese Methode liefert die Textdarstellung der Operatoren
     */
    public String toString() {
        return repr;
    }
}
