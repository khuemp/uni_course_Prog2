package ast.visitors;

import ast.expressions.*;

public class StringVisitor implements ast.visitors.Visitor<String> {

    private String visitExpression(BinaryExpression ex) {
        return "(" + ex.getLhs().accept(this) + " " + ex.getOperator().toString() + " " + ex.getRhs().accept(this) +
               ")";
    }

    private String visitExpression(UnaryExpression ex) {
        return "(" + ex.getOperator().toString() + ex.getOperand().accept(this) + ")";
    }

    @Override
    public String visit(ConstExpression ex) {
        return Integer.toString(ex.eval());
    }

    @Override
    public String visit(MulExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(DivExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(AddExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(SubExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(NegExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(AndExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(EqualsExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(OrExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(XorExpression ex) {
        return visitExpression(ex);
    }

    @Override
    public String visit(NotExpression ex) {
        return visitExpression(ex);
    }

}
