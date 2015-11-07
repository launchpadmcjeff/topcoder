package com.topcoder.tuts.dp;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class ZigZagTest {

	private ZigZag sut;

	@Before
	public void setUp() throws Exception {
		sut = new ZigZag();
	}

	@Test
	public void testLongestZigZag0() {
		int expected = 6;
		int[] sequence = new int[] { 1, 7, 4, 9, 2, 5 };
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}

	@Test
	public void testLongestZigZag1() {
		int expected = 7;
		int[] sequence = new int[] { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}

	@Test
	public void testLongestZigZag2() {
		int expected = 1;
		int[] sequence = new int[] { 44 };
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}

	@Test
	public void testLongestZigZag3() {
		int expected = 2;
		int[] sequence = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}

	@Test
	public void testLongestZigZag4() {
		int expected = 8;
		int[] sequence = new int[] { 70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100,
				19, 7, 5, 5, 5, 1000, 32, 32 };
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}

	@Test
	public void testLongestZigZag5() {
		int expected = 36;
		int[] sequence = new int[] { 374, 40, 854, 203, 203, 156, 362, 279,
				812, 955, 600, 947, 978, 46, 100, 953, 670, 862, 568, 188, 67,
				669, 810, 704, 52, 861, 49, 640, 370, 908, 477, 245, 413, 109,
				659, 401, 483, 308, 609, 120, 249, 22, 176, 279, 23, 22, 617,
				462, 459, 244 };
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestZigZag6() {
		int expected = 7;
		int[] sequence = new int[] {1, 0, 1, 2, 1, 0, 1, 0, 1};
		int actual = sut.longestZigZag(sequence);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongestZigZagBreaksTopSubmissionNot() {
		int expected = 7;
		int[] sequence = new int[] {1, 0, 1, 8, 7, 8, 7, 1, 0, 1};
		int actual = sut.longestZigZagTopSubmission(sequence);
		assertEquals(expected, actual);
	}

	@Test
	public void testIsZigZag0() {
		int[] sequence = new int[] {1, 7, 4, 9, 2, 5};
		boolean expected = true;
		boolean actual = sut.isZigZag(sequence);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsZigZag1() {
		int[] sequence = new int[] {1, 0, 1, 0, 1, 0, 1, 0, 1};
		boolean expected = true;
		boolean actual = sut.isZigZag(sequence);
		assertEquals(expected, actual);
	}
	
	
}
