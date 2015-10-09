package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TypingDistanceTest {

	private TypingDistance sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new TypingDistance();
	}

	@Test
	public void testMinDistance0() {
		String keyboard = "qwertyuiop";
		String word = "potter";
		int expected = 8;
		int actual = sut.minDistance(keyboard, word);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinDistance1() {
		String keyboard = "tc";
		String word = "tctcttccctccccttc";
		int expected = 9;
		int actual = sut.minDistance(keyboard, word);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinDistance2() {
		String keyboard = "a";
		String word = "a";
		int expected = 0;
		int actual = sut.minDistance(keyboard, word);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinDistance3() {
		String keyboard = "kwadrutove";
		String word = "rowerowe";
		int expected = 39;
		int actual = sut.minDistance(keyboard, word);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinDistance4() {
		String keyboard = "qwertyuiopasdfghjklzxcvbnm";
		String word = "topcodersingleroundmatchgoodluckhavefun";
		int expected = 322;
		int actual = sut.minDistance(keyboard, word);
		assertEquals(expected, actual);
	}

}
