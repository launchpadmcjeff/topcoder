package com.topcoder.tuts.graphs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoboCourierTest {

	private RoboCourier sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new RoboCourier();
	}

	@Test
	public void testTimeToDeliver0() {
		String[] path = { "FRRFLLFLLFRRFLF" };
		int expected = 15;
		int actual = sut.timeToDeliver(path);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTimeToDeliver1() {
		String[] path = { "RFLLF" };
		int expected = 17;
		int actual = sut.timeToDeliver(path);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTimeToDeliver2() {
		String[] path = { "FLFRRFRFRRFLLFRRF" };
		int expected = 0;
		int actual = sut.timeToDeliver(path);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTimeToDeliver3() {
		String[] path = { "FFFFFFFFFRRFFFFFFRRFFFFF",
				  "FLLFFFFFFLLFFFFFFRRFFFF" };
		int expected = 44;
		int actual = sut.timeToDeliver(path);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTimeToDeliver4() {
		String[] path = { "RFLLFLFLFRFRRFFFRFFRFFRRFLFFRLRRFFLFFLFLLFRFLFLRFF",
				  "RFFLFLFFRFFLLFLLFRFRFLRLFLRRFLRFLFFLFFFLFLFFRLFRLF",
				  "LLFLFLRLRRFLFLFRLFRF" };
		int expected = 24;
		int actual = sut.timeToDeliver(path);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTimeToDeliver5() {
		String[] path = { "LLFLFRLRRLRFFLRRRRFFFLRFFRRRLLFLFLLRLRFFLFRRFFFLFL",
				  "RLFFRRLRLRRFFFLLLRFRLLRFFLFRLFRRFRRRFRLRLRLFFLLFLF",
				  "FRFLRFRRLLLRFFRRRLRFLFRRFLFFRLFLFLFRLLLLFRLLRFLLLF",
				  "FFLFRFRRFLLFFLLLFFRLLFLRRFRLFFFRRFFFLLRFFLRFRRRLLR",
				  "FFFRRLLFLLRLFRRLRLLFFFLFLRFFRLRLLFLRLFFLLFFLLFFFRR",
				  "LRFRRFLRRLRRLRFFFLLLLRRLRFFLFRFFRLLRFLFRRFLFLFFLFR",
				  "RFRRLRRFLFFFLLRFLFRRFRFLRLRLLLLFLFFFLFRLLRFRLFRLFR",
				  "LLFLFRLFFFFFFFRRLRLRLLRFLRLRRRRRRRRLFLFLFLRFLFRLFF",
				  "RLFRRLLRRRRFFFRRRLLLLRRLFFLLLLLRFFFFRFRRLRRRFFFLLF",
				  "FFFFLRRLRFLLRRLRLRFRRRRLFLLRFLRRFFFRFRLFFRLLFFRRLL" };
		int expected = 169;
		int actual = sut.timeToDeliver(path);
		assertEquals(expected, actual);
	}

}
