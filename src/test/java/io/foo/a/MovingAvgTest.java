package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.MovingAvg;

import org.junit.Before;
import org.junit.Test;

public class MovingAvgTest {

	private MovingAvg sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new MovingAvg();
	}

	@Test
	public void testDifference0() {
		int k = 2;
		double[] data = {3,8,9,15};
		double expected = 6.5;
		double actual = sut.difference(k, data);
		double delta = 1.0E-9;
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testDifference1() {
		int k = 3;
		double[] data = {17,6.2,19,3.4};
		double expected = 4.533333333333335;
		double actual = sut.difference(k, data);
		double delta = 1.0E-9;
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testDifference2() {
		int k = 3;
		double[] data = {6,2.5,3.5};
		double expected = 0.0;
		double actual = sut.difference(k, data);
		double delta = 1.0E-9;
		assertEquals(expected, actual, delta);
	}

}
