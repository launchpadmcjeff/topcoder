package com.topcoder.tuts.dp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlowerGardenTest {

	private FlowerGarden sut;

	@Before
	public void setUp() throws Exception {
		sut = new FlowerGarden();
	}

	@Test
	public void testGetOrdering0() {
		int[] height = new int[] { 5, 4, 3, 2, 1 };
		int[] bloom = new int[] { 1, 1, 1, 1, 1 };
		int[] wilt = new int[] { 365, 365, 365, 365, 365 };
		int[] expecteds = new int[] { 1, 2, 3, 4, 5 };
		int[] actuals = sut.getOrdering(height, bloom, wilt);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetOrdering1() {
		int[] height = new int[] { 5, 4, 3, 2, 1 };
		int[] bloom = new int[] { 1, 5, 10, 15, 20 };
		int[] wilt = new int[] { 4, 9, 14, 19, 24 };
		int[] expecteds = new int[] { 5, 4, 3, 2, 1 };
		int[] actuals = sut.getOrdering(height, bloom, wilt);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetOrdering2() {
		int[] height = new int[] { 5, 4, 3, 2, 1 };
		int[] bloom = new int[] { 1, 5, 10, 15, 20 };
		int[] wilt = new int[] { 5, 10, 15, 20, 25 };
		int[] expecteds = new int[] { 1, 2, 3, 4, 5 };
		int[] actuals = sut.getOrdering(height, bloom, wilt);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetOrdering3() {
		int[] height = new int[] { 5, 4, 3, 2, 1 };
		int[] bloom = new int[] { 1, 5, 10, 15, 20 };
		int[] wilt = new int[] { 5, 10, 14, 20, 25 };
		int[] expecteds = new int[] { 3, 4, 5, 1, 2 };
		int[] actuals = sut.getOrdering(height, bloom, wilt);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetOrdering4() {
		int[] height = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] bloom = new int[] { 1, 3, 1, 3, 1, 3 };
		int[] wilt = new int[] { 2, 4, 2, 4, 2, 4 };
		int[] expecteds = new int[] { 2, 4, 6, 1, 3, 5 };
		int[] actuals = sut.getOrdering(height, bloom, wilt);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetOrdering5() {
		int[] height = new int[] { 3, 2, 5, 4 };
		int[] bloom = new int[] { 1, 2, 11, 10 };
		int[] wilt = new int[] { 4, 3, 12, 13 };
		int[] expecteds = new int[] { 4, 5, 2, 3 };
		int[] actuals = sut.getOrdering(height, bloom, wilt);
		assertArrayEquals(expecteds, actuals);
	}

}
