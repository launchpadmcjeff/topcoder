package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.DigitsSum;

import org.junit.Before;
import org.junit.Test;

public class DigitsSumTest {

	private DigitsSum sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DigitsSum();
	}

	@Test
	public void testLastDigit0() {
		int n = 12345;
		int expected = 6;
		int actual = sut.lastDigit(n);
		assertEquals(expected, actual);
	}
	@Test
	public void testLastDigit1() {
		int n = 6;
		int expected = 6;
		int actual = sut.lastDigit(n);
		assertEquals(expected, actual);
	}
	@Test
	public void testLastDigit2() {
		int n = 999999999;
		int expected = 9;
		int actual = sut.lastDigit(n);
		assertEquals(expected, actual);
	}
	@Test
	public void testLastDigit3() {
		int n = 213413512;
		int expected = 4;
		int actual = sut.lastDigit(n);
		assertEquals(expected, actual);
	}
	@Test
	public void testLastDigit4() {
		int n = 314;
		int expected = 8;
		int actual = sut.lastDigit(n);
		assertEquals(expected, actual);
	}
	@Test
	public void testLastDigit5() {
		int n = 2147483647;
		int expected = 1;
		int actual = sut.lastDigit(n);
		assertEquals(expected, actual);
	}

}
