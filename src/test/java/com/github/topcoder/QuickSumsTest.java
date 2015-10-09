package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickSumsTest {

	QuickSums sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new QuickSums();
	}

	@Test
	public void testMinSums0() {
		String numbers = "99999";
		int sum = 45;
		int actual = sut.minSums(numbers, sum);
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMinSums1() {
		String numbers = "1110";
		int sum = 3;
		int expected = 3;
		int actual = sut.minSums(numbers, sum);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMinSums2() {
		String numbers = "0123456789";
		int sum = 45;
		int expected = 8;
		int actual = sut.minSums(numbers, sum);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMinSums3() {
		String numbers = "99999";
		int sum = 100;
		int expected = -1;
		int actual = sut.minSums(numbers, sum);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMinSums4() {
		String numbers = "382834";
		int sum = 100;
		int expected = 2;
		int actual = sut.minSums(numbers, sum);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMinSums5() {
		String numbers = "9230560001";
		int sum = 71;
		int expected = 4;
		int actual = sut.minSums(numbers, sum);
		assertEquals(expected, actual);
	}
}
