package io.foo.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FanFailureTest {

	private FanFailure sut;

	@Before
	public void setUp() throws Exception {
		sut = new FanFailure();
	}

	@Test
	public void testGetRange0() {
		int[] capacities = { 1, 2, 3 };
		int minCooling = 2;
		int[] expecteds = { 2, 1 };
		int[] actuals = sut.getRange(capacities, minCooling);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetRange1() {
		int[] capacities = { 8, 5, 6, 7 };
		int minCooling = 22;
		int[] expecteds = { 0, 0 };
		int[] actuals = sut.getRange(capacities, minCooling);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetRange2() {
		int[] capacities = { 676, 11, 223, 413, 823, 122, 547, 187, 28 };
		int minCooling = 1000;
		int[] expecteds = { 7, 2 };
		int[] actuals = sut.getRange(capacities, minCooling);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testGetRange3() {
		int[] capacities = { 955, 96, 161, 259, 642, 242, 772, 369, 311, 785, 92, 991, 620, 394,
				128, 774, 973, 94, 681, 771, 916, 373, 523, 100, 220, 993, 472, 798, 132, 361, 33,
				362, 573, 624, 722, 520, 451, 231, 37, 921, 408, 170, 303, 559, 866, 412, 339, 757,
				822, 192 };
		int minCooling = 3619;
		int[] expecteds = { 46, 30 };
		int[] actuals = sut.getRange(capacities, minCooling);
		assertArrayEquals(expecteds, actuals);
	}

}
