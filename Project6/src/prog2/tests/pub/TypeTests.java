package prog2.tests.pub;

import java.util.ArrayList;

import org.junit.Test;

import tinycc.implementation.type.Type;
import tinycc.parser.TokenKind;
import prog2.tests.ASTExercise;
import prog2.tests.CompilerTests;
import prog2.tests.PublicTest;

public class TypeTests extends CompilerTests implements PublicTest, ASTExercise {
	@Test
	public void testChar() {
		final Type t = astFactory.createBaseType(TokenKind.CHAR);
		assertEqualsNormalized("char", t.toString());
	}

	@Test
	public void testInt() {
		final Type t = astFactory.createBaseType(TokenKind.INT);
		assertEqualsNormalized("int", t.toString());
	}

	@Test
	public void testVoid() {
		final Type t = astFactory.createBaseType(TokenKind.VOID);
		assertEqualsNormalized("void", t.toString());
	}

	@Test
	public void testCharPointer() {
		final Type pointsTo = astFactory.createBaseType(TokenKind.CHAR);
		final Type t = astFactory.createPointerType(pointsTo);
		assertEqualsNormalized("char*", t.toString());
	}

	@Test
	public void testIntPointer() {
		final Type pointsTo = astFactory.createBaseType(TokenKind.INT);
		final Type t = astFactory.createPointerType(pointsTo);
		assertEqualsNormalized("int*", t.toString());
	}

	@Test
	public void testVoidPointer() {
		final Type pointsTo = astFactory.createBaseType(TokenKind.VOID);
		final Type t = astFactory.createPointerType(pointsTo);
		assertEqualsNormalized("void*", t.toString());
	}

	@Test
	public void testVoidPP() {
		final Type pointsTo = astFactory.createBaseType(TokenKind.VOID);
		final Type t1 = astFactory.createPointerType(pointsTo);
		final Type t2 = astFactory.createPointerType(t1);
		assertEqualsNormalized("void**", t2.toString());
	}

	@Test
	public void testFunctionTypeIntIntInt() {
		final Type intType = astFactory.createBaseType(TokenKind.INT);
		final ArrayList<Type> params = new ArrayList<Type>(2);
		params.add(intType);
		params.add(intType);
		final Type f = astFactory.createFunctionType(intType, params);
		assertEqualsNormalized("int(int,int)", f.toString());
	}

	@Test
	public void testFunctionTypeVoidInt() {
		final Type intType = astFactory.createBaseType(TokenKind.INT);
		final ArrayList<Type> params = new ArrayList<Type>(2);
		params.add(intType);
		final Type f = astFactory.createFunctionType(astFactory.createBaseType(TokenKind.VOID), params);
		assertEqualsNormalized("void(int)", f.toString());
	}

	@Test
	public void testFunctionTypeVoidVoid() {
		final Type f = astFactory.createFunctionType(astFactory.createBaseType(TokenKind.VOID), new ArrayList<Type>(0));
		assertEqualsNormalized("void()", f.toString());
	}
}
