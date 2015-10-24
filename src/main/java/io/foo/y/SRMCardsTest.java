package io.foo.y;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SRMCardsTest {

	private SRMCards sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SRMCards();
	}

	@Test
	public void testMaxTurns0() {
		int[] cards = {498, 499};
		int expected = 1;
		int actual = sut.maxTurns(cards);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxTurns1() {
		int[] cards = {491, 492, 495, 497, 498, 499};
		int expected = 4;
		int actual = sut.maxTurns(cards);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxTurns2() {
		int[] cards = {100, 200, 300, 400};
		int expected = 4;
		int actual = sut.maxTurns(cards);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxTurns3() {
		int[] cards = {11, 12, 102, 13, 100, 101, 99, 9, 8, 1};
		int expected = 6;
		int actual = sut.maxTurns(cards);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxTurns4() {
		int[] cards = {118, 321, 322, 119, 120, 320};
		int expected = 4;
		int actual = sut.maxTurns(cards);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMaxTurns5() {
		int[] cards = {10, 11, 12, 13, 14, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int expected = 7;
		int actual = sut.maxTurns(cards);
		assertEquals(expected, actual);
	}

}
