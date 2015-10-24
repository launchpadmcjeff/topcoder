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

	public int longestZigZag(int[] sequence) {
		if (sequence.length == 1)
			return 1;
		int[] v = new int[sequence.length - 1];
		for (int i = 1; i < sequence.length; i++) {
			v[i - 1] = sequence[i] - sequence[i - 1];
		}
		// dir is first nonzero
		int ii = 0;
		while (ii < v.length && v[ii] == 0)
			ii++;
		if (ii == v.length)
			return 1;
		int dir = v[ii];
		int len = 2;
		for (int i = ii + 1; i < v.length; i++) {
			if (v[i] * dir < 0) {
				dir *= -1;
				len++;
			}
		}

		return len;
	}
}
