package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.WordCompositionGame;

import org.junit.Before;
import org.junit.Test;

public class WordCompositionGameTest {

	private WordCompositionGame sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new WordCompositionGame();
	}

	@Test
	public void testScore0() {
		String[] listA = {"cat", "dog", "pig", "mouse"};
		String[] listB = {"cat", "pig"};
		String[] listC = {"dog", "cat"};
		String expected = "8/3/3";
		String actual = sut.score(listA, listB, listC);
		assertEquals(expected, actual);
	}
	@Test
	public void testScore1() {
		String[] listA = {"mouse"};
		String[] listB = {"cat", "pig"};
		String[] listC = {"dog", "cat"};
		String expected = "3/5/5";
		String actual = sut.score(listA, listB, listC);
		assertEquals(expected, actual);
	}
	@Test
	public void testScore2() {
		String[] listA = {"dog", "mouse"};
		String[] listB = {"dog", "pig"};
		String[] listC = {"dog", "cat"};
		String expected = "4/4/4";
		String actual = sut.score(listA, listB, listC);
		assertEquals(expected, actual);
	}
	@Test
	public void testScore3() {
		String[] listA = {"bcdbb","aaccd","dacbc","bcbda","cdedc","bbaaa","aecae"};
		String[] listB = {"bcdbb","ddacb","aaccd","adcab","edbee","aecae","bcbda"};
		String[] listC = {"dcaab","aadbe","bbaaa","ebeec","eaecb","bcbba","aecae","adcab","bcbda"};
		String expected = "14/14/21";
		String actual = sut.score(listA, listB, listC);
		assertEquals(expected, actual);
	}

}
