package io.foo;

import static org.junit.Assert.*;
import io.foo.Taxi;

import org.junit.Before;
import org.junit.Test;


public class TaxiTest {

	private Taxi sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Taxi();
	}

	@Test
	public void testMaxDis0() {
		int maxX = 10;
		int maxY = 3;
		int taxiDis = 3;
		double expected = 3.0;
		double actual = sut.maxDis(maxX, maxY, taxiDis);
		assertEquals(expected, actual, 1.0e-9);
	}
	@Test
	public void testMaxDis1() {
		int maxX = 10;
		int maxY = 3;
		int taxiDis = 24;
		double expected = -1.0;
		double actual = sut.maxDis(maxX, maxY, taxiDis);
		assertEquals(expected, actual, 1.0e-9);
	}
	@Test
	public void testMaxDis2() {
		int maxX = 7;
		int maxY = 10;
		int taxiDis = 13;
		double expected = 10.44030650891055;
		double actual = sut.maxDis(maxX, maxY, taxiDis);
		assertEquals(expected, actual, 1.0e-9);
	}
	@Test
	public void testMaxDis3() {
		int maxX = 4;
		int maxY = 4;
		int taxiDis = 7;
		double expected = 5.0;
		double actual = sut.maxDis(maxX, maxY, taxiDis);
		assertEquals(expected, actual, 1.0e-9);
	}
	@Test
	public void testMaxDis4() {
		int maxX = 976421;
		int maxY = 976421;
		int taxiDis = 1000000;
		double expected = 976705.6560100387;
		double actual = sut.maxDis(maxX, maxY, taxiDis);
		assertEquals(expected, actual, 1.0e-9);
	}

}
