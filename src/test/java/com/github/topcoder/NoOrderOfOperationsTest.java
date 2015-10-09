package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NoOrderOfOperationsTest {

	private NoOrderOfOperations sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new NoOrderOfOperations();
	}

	@Test
	public void testEvaluate0() {
		String expr = "3+5*7";
		int expected = 56;
		int actual = sut.evaluate(expr);
		assertEquals(expected, actual);
	}
	@Test
	public void testEvaluate1() {
		String expr = "4-8*9*1";
		int expected = -36;
		int actual = sut.evaluate(expr);
		assertEquals(expected, actual);
	}
	@Test
	public void testEvaluate2() {
		String expr = "0";
		int expected = 0;
		int actual = sut.evaluate(expr);
		assertEquals(expected, actual);
	}
	@Test
	public void testEvaluate3() {
		String expr = "1*2*3*4*5*6*7*8*9";
		int expected = 362880;
		int actual = sut.evaluate(expr);
		assertEquals(expected, actual);
	}

}
