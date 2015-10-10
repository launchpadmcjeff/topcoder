package io.foo;

import static org.junit.Assert.*;
import io.foo.Yahtzee;

import org.junit.Before;
import org.junit.Test;


public class YahtzeeTest {

	private Yahtzee sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Yahtzee();
	}

	@Test
	public void testMaxPoints0() {
		int[] toss = { 2, 2, 3, 5, 4 };
		int expected = 5;
		int actual = sut.maxPoints(toss);
		assertEquals(expected, actual);
	}
	@Test
	public void testMaxPoints1() {
		int[] toss = { 6, 4, 1, 1, 3 };
		int expected = 6;
		int actual = sut.maxPoints(toss);
		assertEquals(expected, actual);
	}
	@Test
	public void testMaxPoints2() {
		int[] toss = { 5, 3, 5, 3, 3 };
		int expected = 10;
		int actual = sut.maxPoints(toss);
		assertEquals(expected, actual);
	}

}
