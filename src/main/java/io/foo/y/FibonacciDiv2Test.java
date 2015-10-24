package io.foo.y;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciDiv2Test {

	private FibonacciDiv2 sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FibonacciDiv2();
	}

	@Test
	public void testFind0() {
		int N = 1;
		int expected = 0;
		int actual = sut.find(N);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFind1() {
		int N = 13;
		int expected = 0;
		int actual = sut.find(N);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFind2() {
		int N = 15;
		int expected = 2;
		int actual = sut.find(N);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFind3() {
		int N = 19;
		int expected = 2;
		int actual = sut.find(N);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFind4() {
		int N = 1000000;
		int expected = 167960;
		int actual = sut.find(N);
		assertEquals(expected, actual);
	}

}
