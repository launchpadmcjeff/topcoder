package com.programmingchallenges;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class The3NPlus1ProblemTest {

	The3NPlus1Problem sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new The3NPlus1Problem();
	}

	@Test
	public void testInput01() {
		String actual = sut.input("1 10");
		String expected = "1 10 20";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInput02() {
		String actual = sut.input("100 200");
		String expected = "100 200 125";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInput03() {
		String actual = sut.input("201 210");
		String expected = "201 210 89";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInput04() {
		String actual = sut.input("900 1000");
		String expected = "900 1000 174";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInput05() {
		String actual = sut.input("1 1000000");
		String expected = "1 1000000 525";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInput06() {
		String actual = sut.input("1 22");
		String expected = "1 22 21";
		assertEquals(expected, actual);
	}

}
