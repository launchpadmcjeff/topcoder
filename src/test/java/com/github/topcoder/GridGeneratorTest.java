package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GridGeneratorTest {

	private GridGenerator sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new GridGenerator();
	}

	@Test
	public void testGenerate0() {
		int[] row = {1,0,3,4,1};
		int[] col = {1,4,1,0,3};
		int expected = 579;
		int actual = sut.generate(row, col);
		assertEquals(expected, actual);
	}
	@Test
	public void testGenerate1() {
		int[] row = {9,9,9,9,9,9,9,9,9,9};
		int[] col = {9,9,9,9,9,9,9,9,9,9};
		int expected = 13163067;
		int actual = sut.generate(row, col);
		assertEquals(expected, actual);
	}
	@Test
	public void testGenerate2() {
		int[] row = {0,0,0,0,0,0,0,0,0};
		int[] col = {0,0,0,0,0,0,0,0,0};
		int expected = 0;
		int actual = sut.generate(row, col);
		assertEquals(expected, actual);
	}

}
