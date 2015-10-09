package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SegmentsTest {

	private Segments sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Segments();
	}

	@Test
	public void testIntersection0() {
		int[] s1 = {0, 0, 0, 1};
		int[] s2 = {1, 0, 1, 1};
		String expected = "NO";
		String actual = sut.intersection(s1, s2);
		assertEquals(expected, actual);
	}
	@Test
	public void testIntersection1() {
		int[] s1 = {0, 0, 0, 1};
		int[] s2 = {0, 1, 0, 2};
		String expected = "POINT";
		String actual = sut.intersection(s1, s2);
		assertEquals(expected, actual);
	}
	@Test
	public void testIntersection2() {
		int[] s1 = {0, -1, 0, 1};
		int[] s2 = {-1, 0, 1, 0};
		String expected = "POINT";
		String actual = sut.intersection(s1, s2);
		assertEquals(expected, actual);
	}
	@Test
	public void testIntersection3() {
		int[] s1 = {0, 0, 2, 0};
		int[] s2 = {1, 0, 10, 0};
		String expected = "SEGMENT";
		String actual = sut.intersection(s1, s2);
		assertEquals(expected, actual);
	}
	@Test
	public void testIntersection4() {
		int[] s1 = {5, 5, 5, 5};
		int[] s2 = {6, 6, 6, 6};
		String expected = "NO";
		String actual = sut.intersection(s1, s2);
		assertEquals(expected, actual);
	}
	@Test
	public void testIntersection5() {
		int[] s1 = {10, 0, -10, 0};
		int[] s2 = {5, 0, -5, 0};
		String expected = "SEGMENT";
		String actual = sut.intersection(s1, s2);
		assertEquals(expected, actual);
	}

}
