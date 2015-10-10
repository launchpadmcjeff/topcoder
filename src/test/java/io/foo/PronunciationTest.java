package io.foo;

import static org.junit.Assert.*;
import io.foo.Pronunciation;

import org.junit.Before;
import org.junit.Test;


public class PronunciationTest {

	private Pronunciation sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Pronunciation();
	}

	@Test
	public void testCanPronounce0() {
		String[] words = {"All","of","these","are","not","difficult"};
		String expected = "";
		String actual = sut.canPronounce(words);
		assertEquals(expected, actual);
	}
	@Test
	public void testCanPronounce1() {
		String[] words = {"The","word","REALLY","is","really","hard"};
		String expected = "REALLY";
		String actual = sut.canPronounce(words);
		assertEquals(expected, actual);
	}
	@Test
	public void testCanPronounce2() {
		String[] words = {"TRiCKy"};
		String expected = "TRiCKy";
		String actual = sut.canPronounce(words);
		assertEquals(expected, actual);
	}
	@Test
	public void testCanPronounce3() {
		String[] words = {"irresistable","prerogative","uttermost","importance"};
		String expected = "";
		String actual = sut.canPronounce(words);
		assertEquals(expected, actual);
	}
	@Test
	public void testCanPronounce4() {
		String[] words = {"Aa"};
		String expected = "";
		String actual = sut.canPronounce(words);
		assertEquals(expected, actual);
	}

}
