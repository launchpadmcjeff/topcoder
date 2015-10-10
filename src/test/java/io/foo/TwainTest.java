package io.foo;

import static org.junit.Assert.*;
import io.foo.Twain;

import org.junit.Before;
import org.junit.Test;

public class TwainTest {

	private Twain sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Twain();
	}

	@Test
	public void testGetNewSpelling0() {
		int year = 1;
		String phrase = "i fixed the chrome xerox by the cyclical church";
		String expected = "i fiksed the chrome zeroks by the cyclical church";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNewSpelling1() {
		int year = 2;
		String phrase = "i fixed the chrome xerox by the cyclical church";
		String expected = "i fiksed the chrome zeroks bi the ciclical church";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNewSpelling2() {
		int year = 0;
		String phrase = "this is unchanged";
		String expected = "this is unchanged";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNewSpelling3() {
		int year = 7;
		String phrase = "sch kn x xschrx cknnchc cyck xxceci";
		String expected = "sk n z zskrks nchk sik zksesi";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNewSpelling4() {
		int year = 7;
		String phrase = "  concoction   convalescence   cyclical   cello   ";
		String expected = "  konkoktion   konvalesense   siklikal   selo   ";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNewSpelling5() {
		int year = 7;
		String phrase = "";
		String expected = "";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetNewSpelling6() {
		int year = 7;
		String phrase = "cck xzz aaaaa";
		String expected = "k z aaaaa";
		String actual = sut.getNewSpelling(year, phrase);
		assertEquals(expected, actual);
	}

}
