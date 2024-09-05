package ast.visitors;

import ast.expressions.*;

public class EvalVisitor implements ast.visitors.Visitor<Integer> {

    private int booleanToInteger(boolean b) {
        return b ? 1 : 0;
    }

    @Override
    public Integer visit(ConstExpression ex) {
        return ex.getValue();
    }

    @Override
    public Integer visit(MulExpression ex) {
        return ex.getLhs().accept(this) * ex.getRhs().accept(this);
    }

    @Override
    public Integer visit(DivExpression ex) {
        return ex.getLhs().accept(this) / ex.getRhs().accept(this);
    }

    @Override
    public Integer visit(AddExpression ex) {
        return ex.getLhs().accept(this) + ex.getRhs().accept(this);
    }

    @Override
    public Integer visit(SubExpression ex) {
        return ex.getLhs().accept(this) - ex.getRhs().accept(this);
    }

    @Override
    public Integer visit(NegExpression ex) {
        return -ex.getOperand().accept(this);
    }

    @Override
    public Integer visit(AndExpression ex) {
        return booleanToInteger(ex.getLhs().accept(this) != 0 && ex.getRhs().accept(this) != 0);
    }

    @Override
    public Integer visit(EqualsExpression ex) {
        return booleanToInteger(ex.getLhs().accept(this).equals(ex.getRhs().accept(this)));
    }

    @Override
    public Integer visit(OrExpression ex) {
        return booleanToInteger(ex.getLhs().accept(this) != 0 || ex.getRhs().accept(this) != 0);
    }

    @Override
    public Integer visit(XorExpression ex) {
        return booleanToInteger((ex.getLhs().accept(this) != 0 && ex.getRhs().accept(this) == 0) ||
                                (ex.getLhs().accept(this) == 0 && ex.getRhs().accept(this) != 0));
    }

    @Override
    public Integer visit(NotExpression ex) {
        return booleanToInteger(ex.getOperand().accept(this) == 0);
    }

}
