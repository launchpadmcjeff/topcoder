package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DreamingAboutCarrotsTest {

	private DreamingAboutCarrots sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DreamingAboutCarrots();
	}

	@Test
	public void testCarrotsBetweenCarrots0() {
		int x1 = 1;
		int y1 = 1;
		int x2 = 5;
		int y2 = 5;
		int expected = 3;
		int actual = sut.carrotsBetweenCarrots(x1, y1, x2, y2);
		assertEquals(expected, actual);
	}
	@Test
	public void testCarrotsBetweenCarrots1() {
		int x1 = 0;
		int y1 = 0;
		int x2 = 1;
		int y2 = 1;
		int expected = 0;
		int actual = sut.carrotsBetweenCarrots(x1, y1, x2, y2);
		assertEquals(expected, actual);
	}
	@Test
	public void testCarrotsBetweenCarrots2() {
		int x1 = 50;
		int y1 = 48;
		int x2 = 0;
		int y2 = 0;
		int expected = 1;
		int actual = sut.carrotsBetweenCarrots(x1, y1, x2, y2);
		assertEquals(expected, actual);
	}
	@Test
	public void testCarrotsBetweenCarrots3() {
		int x1 = 0;
		int y1 = 0;
		int x2 = 42;
		int y2 = 36;
		int expected = 5;
		int actual = sut.carrotsBetweenCarrots(x1, y1, x2, y2);
		assertEquals(expected, actual);
	}

}
