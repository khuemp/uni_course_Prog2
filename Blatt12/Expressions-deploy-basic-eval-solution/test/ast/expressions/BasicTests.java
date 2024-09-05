package ast.expressions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicTests {

    private void testAST(Expression root, String output, int value) {
        assertEquals(output, root.toString());
        assertEquals(value, root.eval());
    }

    @Test
    public void testAddExpression() {
        testAST(new AddExpression(new ConstExpression(42), new ConstExpression(271)), "(42 + 271)", 313);
    }

    @Test
    public void testAndExpression() {
        testAST(new AndExpression(new ConstExpression(1), new ConstExpression(2)), "(1 && 2)", 1);
    }

    @Test
    public void testConstExpression() {
        testAST(new ConstExpression(42), "42", 42);
    }

    @Test
    public void testDivExpression() {
        testAST(new DivExpression(new ConstExpression(3), new ConstExpression(2)), "(3 / 2)", 1);
    }

    @Test
    public void testEqualsExpression() {
        testAST(new EqualsExpression(new ConstExpression(3), new ConstExpression(2)), "(3 == 2)", 0);
    }

    @Test
    public void testMulExpression() {
        testAST(new MulExpression(new ConstExpression(42), new ConstExpression(2)), "(42 * 2)", 84);
    }

    @Test
    public void testNegExpression() {
        testAST(new NegExpression(new ConstExpression(42)), "(~42)", -42);
    }

    @Test
    public void testNotExpression() {
        testAST(new NotExpression(new ConstExpression(0)), "(!0)", 1);
    }

    @Test
    public void testOrExpression() {
        testAST(new OrExpression(new ConstExpression(42), new ConstExpression(0)), "(42 || 0)", 1);
    }

    @Test
    public void testSubExpression() {
        testAST(new SubExpression(new ConstExpression(42), new ConstExpression(271)), "(42 - 271)", -229);
    }

    @Test
    public void testXorExpression() {
        testAST(new XorExpression(new ConstExpression(42), new ConstExpression(0)), "(42 ^^ 0)", 1);
        testAST(new XorExpression(new ConstExpression(0), new ConstExpression(0)), "(0 ^^ 0)", 0);
        testAST(new XorExpression(new ConstExpression(0), new ConstExpression(42)), "(0 ^^ 42)", 1);
        testAST(new XorExpression(new ConstExpression(42), new ConstExpression(42)), "(42 ^^ 42)", 0);
    }

    @Test
    public void testFullTree() {
        testAST(new DivExpression(new MulExpression(new ConstExpression(3), new SubExpression(
                        new AddExpression(new NegExpression(new ConstExpression(42)), new ConstExpression(3)),
                        new ConstExpression(5))), new AddExpression(new ConstExpression(2), new AndExpression(
                        new OrExpression(new ConstExpression(1), new XorExpression(
                                new AndExpression(new NotExpression(new ConstExpression(0)), new ConstExpression(0)),
                                new ConstExpression(1))),
                        new EqualsExpression(new ConstExpression(8), new ConstExpression(1))))),
                "((3 * (((~42) + 3) - 5)) / (2 + ((1 || (((!0) && 0) ^^ 1)) && (8 == 1))))", -66);
    }
}