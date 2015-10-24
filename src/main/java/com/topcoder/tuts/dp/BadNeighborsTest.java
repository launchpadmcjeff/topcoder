package com.topcoder.tuts.dp;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BadNeighborsTest {

	private BadNeighbors sut;

	@Before
	public void setUp() throws Exception {
		sut = new BadNeighbors();
	}

	@Test
	public void testMaxDonations0() {
		int[] donations = new int[] { 10, 3, 2, 5, 7, 8 };
		int expected = 19;
		int actual = sut.maxDonations(donations);
		assertEquals(expected, actual);
	}

	@Test
	public void testMaxDonations1() {
		int[] donations = new int[] { 11, 15 };
		int expected = 15;
		int actual = sut.maxDonations(donations);
		assertEquals(expected, actual);
	}

	@Test
	public void testMaxDonations2() {
		int[] donations = new int[] { 7, 7, 7, 7, 7, 7, 7 };
		int expected = 21;
		int actual = sut.maxDonations(donations);
		assertEquals(expected, actual);
	}

	@Test
	public void testMaxDonations3() {
		int[] donations = new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
		int expected = 16;
		int actual = sut.maxDonations(donations);
		assertEquals(expected, actual);
	}

	@Test
	public void testMaxDonations4() {
		int[] donations = new int[] { 94, 40, 49, 65, 21, 21, 106, 80, 92, 81,
				679, 4, 61, 6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61,
				397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 };
		int expected = 2926;
		int actual = sut.maxDonations(donations);
		assertEquals(expected, actual);
	}

	/* Top Solution */
	public int maxDonations(int[] donations) {
		cache = new int[2][donations.length];
		Arrays.fill(cache[0], -1);
		Arrays.fill(cache[1], -1);
		return Math.max(max(donations, 2, true) + donations[0],
				max(donations, 1, false));
	}

	int[][] cache;

	public int max(int[] donations, int where, boolean onegave) {
		if (where == donations.length)
			return 0;
		if (where == donations.length - 1 && onegave)
			return 0;
		else if (where == donations.length - 1)
			return donations[where];
		if (cache[onegave ? 1 : 0][where] != -1)
			return cache[onegave ? 1 : 0][where];
		return cache[onegave ? 1 : 0][where] = Math.max(
				max(donations, where + 1, onegave),
				max(donations, where + 2, onegave) + donations[where]);
	}
	/* End Top Solution */
}
