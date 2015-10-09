package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SearchBoxTest {

	private SearchBox sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SearchBox();
	}

	@Test
	public void testFind0() {
		String text = "We dont need no education";
		String search = "ed";
		String wholeWord = "N";
		int start = 13;
		int expected = 16;
		int actual = sut.find(text, search, wholeWord, start);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind1() {
		String text = "We dont need no thought control";
		String search = "We";
		String wholeWord = "Y";
		int start = 0;
		int expected = 0;
		int actual = sut.find(text, search, wholeWord, start);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind2() {
		String text = "No dark sarcasm in the classroom";
		String search = "The";
		String wholeWord = "Y";
		int start = 5;
		int expected = -1;
		int actual = sut.find(text, search, wholeWord, start);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind3() {
		String text = "Teachers leave them kids alone";
		String search = "kid";
		String wholeWord = "Y";
		int start = 1;
		int expected = -1;
		int actual = sut.find(text, search, wholeWord, start);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind4() {
		String text = "All in all its just another brick in the wall";
		String search = "all";
		String wholeWord = "Y";
		int start = 9;
		int expected = -1;
		int actual = sut.find(text, search, wholeWord, start);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind5() {
		String text = "All in all youre just another brick in the wall";
		String search = "just";
		String wholeWord = "Y";
		int start = 17;
		int expected = 17;
		int actual = sut.find(text, search, wholeWord, start);
		assertEquals(expected, actual);
	}

}
