package ast.expressions;

/**
 * Die Schnittstelle Expression schreibt Ausdrücken eine print() und eine eval() Methode vor.
 */
public interface Expression {

    /**
     * Diese Methode soll den Ausdruck auswerten und den Wert als int zurückgeben.
     *
     * @return Wert des ausgewerteten Ausdrucks
     */
    int eval();

    /**
     * Diese Methode soll den vollständigen Ausdruck auf der Kommandozeile ausgeben. Beachte, dass diese Methode von
     * allen Unterklassen genutzt werden kann.
     */
    void print();

}
