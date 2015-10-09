package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SwimmersDelightTest {

	private SwimmersDelight sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SwimmersDelight();
	}

	@Test
	public void testLongestJump0() {
		int[] x = {3,7};
		int[] y = {5,5};
		int expected = 4;
		int actual = sut.longestJump(x, y);
		assertEquals(expected, actual);
	}
	@Test
	public void testLongestJump1() {
		int[] x = {3,6};
		int[] y = {5,2};
		int expected = 4;
		int actual = sut.longestJump(x, y);
		assertEquals(expected, actual);
	}
	@Test
	public void testLongestJump2() {
		int[] x = {1,1};
		int[] y = {4,6};
		int expected = 9;
		int actual = sut.longestJump(x, y);
		assertEquals(expected, actual);
	}
	@Test
	public void testLongestJump3() {
		int[] x = {3,8};
		int[] y = {0,10};
		int expected = 7;
		int actual = sut.longestJump(x, y);
		assertEquals(expected, actual);
	}
	@Test
	public void testLongestJump4() {
		int[] x = {4,2};
		int[] y = {5,5};
		int expected = 6;
		int actual = sut.longestJump(x, y);
		assertEquals(expected, actual);
	}

}
