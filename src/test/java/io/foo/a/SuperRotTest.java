package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.SuperRot;

import org.junit.Before;
import org.junit.Test;

public class SuperRotTest {

	private SuperRot sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SuperRot();
	}

	@Test
	public void testDecoder0() {

		String message = "Uryyb 28";
		String expected = "Hello 73";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecoder1() {
		String message = "GbcPbqre";
		String expected = "TopCoder";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecoder2() {
		String message = "";
		String expected = "";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecoder3() {
		String message = "5678901234";
		String expected = "0123456789";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecoder4() {
		String message = "NnOoPpQqRr AaBbCcDdEe";
		String expected = "AaBbCcDdEe NnOoPpQqRr";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecoder5() {
		String message = "Gvzr vf 54 71 CZ ba Whyl 4gu bs gur lrne 7558 NQ";
		String expected = "Time is 09 26 PM on July 9th of the year 2003 AD";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecoder6() {
		String message = "Gur dhvpx oebja sbk whzcf bire n ynml qbt";
		String expected = "The quick brown fox jumps over a lazy dog";
		String actual = sut.decoder(message);
		assertEquals(expected, actual);
	}

}
