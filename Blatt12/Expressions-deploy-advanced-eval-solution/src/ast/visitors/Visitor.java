package ast.visitors;

import ast.expressions.*;

/**
 * Dieses Interface muss von "Besuchern" implementiert werden. Es enthält eine Methode für jeweils alle
 * Implementierungen von Expression. Der Rückgabetyp kann beliebig gewählt werden, je nach Anwendung.
 *
 * @param <T> Typ den die Visitor Methoden zurückgeben
 */
public interface Visitor<T> {

    T visit(ConstExpression ex);

    T visit(MulExpression ex);

    T visit(DivExpression ex);

    T visit(AddExpression ex);

    T visit(SubExpression ex);

    T visit(NegExpression ex);

    T visit(AndExpression ex);

    T visit(EqualsExpression ex);

    T visit(OrExpression ex);

    T visit(XorExpression ex);

    T visit(NotExpression ex);

}
