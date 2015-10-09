package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MeasuringTemperatureTest {

	private MeasuringTemperature sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new MeasuringTemperature();
	}

	@Test
	public void testAverageTemperature0() {
		double delta = 1.0e-9;
		int[] measuredValues = {9, 11, 12, 13, 15};
		double expected = 12.0;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature1() {
		double delta = 1.0e-9;
		int[] measuredValues = {0, 0, 0, 2, 997, -1, 0};
		double expected = 0.16666666666666666;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature2() {
		double delta = 1.0e-9;
		int[] measuredValues = {0, 0, 0, 2, -4, -1, 0};
		double expected = 0.16666666666666666;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature3() {
		double delta = 1.0e-9;
		int[] measuredValues = {0, 0, 0, 2, -3, -1, 0};
		double expected = -0.2857142857142857;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature4() {
		double delta = 1.0e-9;
		int[] measuredValues = {1,2,3,100,100,1,2};
		double expected = 29.857142857142858;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature5() {
		double delta = 1.0e-9;
		int[] measuredValues = {1,2,3,4,5,6,7,10};
		double expected = 4.0;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature6() {
		double delta = 1.0e-9;
		int[] measuredValues = {-35, -34, -34, -34, -35, 72, -34, 52, -36, -35, -36, 52, -36, -35, 981, -33};
		double expected = -34.75;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature7() {
		double delta = 1.0e-9;
		int[] measuredValues = {-273, -273, -274, -273};
		double expected = -273.0;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testAverageTemperature8() {
		double delta = 1.0e-9;
		int[] measuredValues = {10, 20, 30, 40};
		double expected = -300.0;
		double actual = sut.averageTemperature(measuredValues);
		assertEquals(expected, actual, delta);
	}

}
