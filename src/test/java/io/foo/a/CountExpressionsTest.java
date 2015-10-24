package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.CountExpressions;

import org.junit.Before;
import org.junit.Test;

public class CountExpressionsTest {

	private CountExpressions sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new CountExpressions();
	}

	@Test
	public void testCalcExpressions0() {
		
		int x = 7;
		int y = 8;
		int val = 16;
		int expected = 9;
		int actual = sut.calcExpressions(x, y, val);
		assertEquals(expected, actual);
	}
	@Test
	public void testCalcExpressions1() {
		int x = 3;
		int y = 5;
		int val = 7;
		int expected = 5;
		int actual = sut.calcExpressions(x, y, val);
		assertEquals(expected, actual);
	}
	@Test
	public void testCalcExpressions2() {
		int x = 99;
		int y = 100;
		int val = 98010000;
		int expected = 6;
		int actual = sut.calcExpressions(x, y, val);
		assertEquals(expected, actual);
	}
	@Test
	public void testCalcExpressions3() {
		int x = -99;
		int y = 42;
		int val = -1764;
		int expected = 2;
		int actual = sut.calcExpressions(x, y, val);
		assertEquals(expected, actual);
	}
	@Test
	public void testCalcExpressions4() {
		int x = 100;
		int y = -100;
		int val = -100000000;
		int expected = 0;
		int actual = sut.calcExpressions(x, y, val);
		assertEquals(expected, actual);
	}
	@Test
	public void testCalcExpressions5() {
		int x = 1;
		int y = 2;
		int val = 5;
		int expected = 17;
		int actual = sut.calcExpressions(x, y, val);
		assertEquals(expected, actual);
	}

}
