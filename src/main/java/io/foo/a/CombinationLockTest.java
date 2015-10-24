package io.foo.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CombinationLockTest {

	private CombinationLock sut;

	@Before
	public void setUp() throws Exception {
		sut = new CombinationLock();
	}

	@Test
	public void testDegreesTurned0() {
		int[] combo = { 10, 20, 30 };
		int size = 40;
		int start = 6;
		double expected = 2556.0;
		double delta = 1e-9;
		double actual = sut.degreesTurned(combo, size, start);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testDegreesTurned1() {
		int[] combo = { 0, 50, 99 };
		int size = 100;
		int start = 65;
		double expected = 2642.4;
		double delta = 1e-9;
		double actual = sut.degreesTurned(combo, size, start);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testDegreesTurned2() {
		int[] combo = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int size = 10;
		int start = 5;
		double expected = 79344.0;
		double delta = 1e-9;
		double actual = sut.degreesTurned(combo, size, start);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testDegreesTurned3() {
		int[] combo = { 64, 93, 87, 3, 22, 53, 64, 53, 11, 90, 11, 59, 30, 6, 11, 17, 72, 0, 38, 55 };
		int size = 97;
		int start = 26;
		double expected = 79166.59793814432;
		double delta = 1e-9;
		double actual = sut.degreesTurned(combo, size, start);
		assertEquals(expected, actual, delta);
	}

}
