package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class WordFormTest {

	private WordForm sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new WordForm();
	}

	@Test
	public void testGetSequence0() {
		String word = "WHEREABOUTS";
		String expected = "CVCVCVC";
		String actual = sut.getSequence(word);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSequence1() {
		String word = "yoghurt";
		String expected = "CVCVC";
		String actual = sut.getSequence(word);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSequence2() {
		String word = "YipPy";
		String expected = "CVCV";
		String actual = sut.getSequence(word);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSequence3() {
		String word = "AyYyEYye";
		String expected = "VCVCVCV";
		String actual = sut.getSequence(word);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSequence4() {
		String word = "yC";
		String expected = "C";
		String actual = sut.getSequence(word);
		assertEquals(expected, actual);
	}

}
