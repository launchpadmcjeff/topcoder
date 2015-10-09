package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LetterStringsTest {

	private LetterStrings sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new LetterStrings();
	}

	@Test
	public void testSum0() {
		String[] s = {"-"};
		int expected = 0;
		int actual = sut.sum(s);
		assertEquals(expected, actual);
	}
	@Test
	public void testSum1() {
		String[] s = {"A"};
		int expected = 1;
		int actual = sut.sum(s);
		assertEquals(expected, actual);
	}
	@Test
	public void testSum2() {
		String[] s = {"-----Abc"};
		int expected = 3;
		int actual = sut.sum(s);
		assertEquals(expected, actual);
	}
	@Test
	public void testSum3() {
		String[] s = {"-A-B-C-D", "--------EFGHI", "JKLMNOPQR", "---STU-VW-XYZ"};
		int expected = 26;
		int actual = sut.sum(s);
		assertEquals(expected, actual);
	}

}
