package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class InsideOutTest {

	private InsideOut sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new InsideOut();
	}
	@Test
	public void testUnscramble0() {
		String line = "I ENIL SIHTHSIREBBIG S";
		String expected = "THIS LINE IS GIBBERISH";
		String actual = sut.unscramble(line);
		assertEquals(expected, actual);
	}
	@Test
	public void testUnscramble1() {
		String line = "LEVELKAYAK";
		String expected = "LEVELKAYAK";
		String actual = sut.unscramble(line);
		assertEquals(expected, actual);
	}
	@Test
	public void testUnscramble2() {
		String line = "H YPPAHSYADILO";
		String expected = "HAPPY HOLIDAYS";
		String actual = sut.unscramble(line);
		assertEquals(expected, actual);
	}
	@Test
	public void testUnscramble3() {
		String line = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String expected = "MLKJIHGFEDCBAZYXWVUTSRQPON";
		String actual = sut.unscramble(line);
		assertEquals(expected, actual);
	}
	@Test
	public void testUnscramble4() {
		String line = "RUT OWT SNEH HCNERF EERHTEGDIRTRAP A DNA  SEVODELT";
		String expected = "THREE FRENCH HENS TWO TURTLEDOVES  AND A PARTRIDGE";
		String actual = sut.unscramble(line);
		assertEquals(expected, actual);
	}

}
