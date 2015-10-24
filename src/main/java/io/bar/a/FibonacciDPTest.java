package io.bar.a;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class FibonacciDPTest {

	FibonacciDP sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FibonacciDP();
	}

	@Test
	public void testCalcFibNaiveRecursive1() {
		long actual = sut.calcFibNaiveRecursive(1);
		long expected = 1;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursive2() {
		long actual = sut.calcFibNaiveRecursive(2);
		long expected = 1;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursive3() {
		long actual = sut.calcFibNaiveRecursive(3);
		long expected = 2;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursive4() {
		long actual = sut.calcFibNaiveRecursive(4);
		long expected = 3;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursive5() {
		long actual = sut.calcFibNaiveRecursive(5);
		long expected = 5;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursive6() {
		long actual = sut.calcFibNaiveRecursive(6);
		long expected = 8;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursive49() {
		long actual = sut.calcFibNaiveRecursive(49);
		long expected = 7778742049L;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursiveWithMemo49() {
		long[] memo = new long[50];
		Arrays.fill(memo, -1);
		long actual = sut.calcFibRecursiveWithMemo(49, memo);
		long expected = 7778742049L;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibNaiveRecursiveWithMemo100() {
		long[] memo = new long[101];
		Arrays.fill(memo, -1);
		long actual = sut.calcFibRecursiveWithMemo(100, memo);
		long expected = 3736710778780434371L;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibTopologicalOrder49() {
		long actual = sut.calcFibTopologicalOrder(49);
		long expected = 7778742049L;
		assertEquals(expected , actual);
	}
	@Test
	public void testCalcFibTopologicalOrder100() {
		long actual = sut.calcFibTopologicalOrder(100);
		long expected = 3736710778780434371L;
		assertEquals(expected , actual);
	}

}
