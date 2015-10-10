package io.foo;

import static org.junit.Assert.*;
import io.foo.UnluckyNumbers;

import org.junit.Before;
import org.junit.Test;


public class UnluckyNumbersTest {

	private UnluckyNumbers sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new UnluckyNumbers();
	}

	@Test
	public void testGetCount0() {
		int[] luckySet = {1, 7, 14, 10};
		int n = 2;
		int expected = 4;
		int actual = sut.getCount(luckySet, n);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount1() {
		int[] luckySet = {4, 8, 13, 24, 30};
		int n = 10;
		int expected = 5;
		int actual = sut.getCount(luckySet, n);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount2() {
		int[] luckySet = {10, 20, 30, 40, 50};
		int n = 30;
		int expected = 0;
		int actual = sut.getCount(luckySet, n);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount3() {
		int[] luckySet = {3, 7, 12, 18, 25, 100, 33, 1000};
		int n = 59;
		int expected = 1065;
		int actual = sut.getCount(luckySet, n);
		assertEquals(expected, actual);
	}

}
