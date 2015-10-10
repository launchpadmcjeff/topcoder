package io.foo;

import static org.junit.Assert.*;
import io.foo.RosePetals;

import org.junit.Before;
import org.junit.Test;


public class RosePetalsTest {

	private RosePetals sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new RosePetals();
	}

	@Test
	public void testGetScore0() {
		int[] dice = {1, 2, 3, 2, 1};
		int expected = 2;
		int actual = sut.getScore(dice);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetScore1() {
		int[] dice = {4, 4, 5, 6, 5};
		int expected = 8;
		int actual = sut.getScore(dice);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetScore2() {
		int[] dice = {1, 2, 3, 3, 5};
		int expected = 8;
		int actual = sut.getScore(dice);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetScore3() {
		int[] dice = {3, 3, 3, 3, 3};
		int expected = 10;
		int actual = sut.getScore(dice);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetScore4() {
		int[] dice = {2, 2, 2, 2, 2};
		int expected = 0;
		int actual = sut.getScore(dice);
		assertEquals(expected, actual);
	}

}
