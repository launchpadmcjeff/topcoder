package com.topcoder.tuts.dp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AvoidRoadsTest {

	private AvoidRoads sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new AvoidRoads();
	}

	@Test
	public void testNumWays0() {
		int width = 6;
		int height = 6;
		String[] bad = {"0 0 0 1","6 6 5 6"};
		long expected = 252L;
		long actual = sut.numWays(width, height, bad);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumWays1() {
		int width = 1;
		int height = 1;
		String[] bad = {};
		long expected = 2L;
		long actual = sut.numWays(width, height, bad);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumWays2() {
		int width = 35;
		int height = 31;
		String[] bad = {};
		long expected = 6406484391866534976L;
		long actual = sut.numWays(width, height, bad);
		assertEquals(expected, actual);
	}

	@Test
	public void testNumWays3() {
		int width = 2;
		int height = 2;
		String[] bad = {"0 0 1 0", "1 2 2 2", "1 1 2 1"};
		long expected = 0L;
		long actual = sut.numWays(width, height, bad);
		assertEquals(expected, actual);
	}

}
