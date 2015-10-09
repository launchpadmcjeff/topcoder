package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CCipherTest {

	private CCipher sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new CCipher();
	}

	@Test
	public void testDecode0() {
		String cipherText = "VQREQFGT";
		int shift = 2;
		String expected = "TOPCODER";
		String actual = sut.decode(cipherText, shift);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode1() {
		String cipherText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int shift = 10;
		String expected = "QRSTUVWXYZABCDEFGHIJKLMNOP";
		String actual = sut.decode(cipherText, shift);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode2() {
		String cipherText = "TOPCODER";
		int shift = 0;
		String expected = "TOPCODER";
		String actual = sut.decode(cipherText, shift);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode3() {
		String cipherText = "ZWBGLZ";
		int shift = 25;
		String expected = "AXCHMA";
		String actual = sut.decode(cipherText, shift);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode4() {
		String cipherText = "DBNPCBQ";
		int shift = 1;
		String expected = "CAMOBAP";
		String actual = sut.decode(cipherText, shift);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode5() {
		String cipherText = "LIPPSASVPH";
		int shift = 4;
		String expected = "HELLOWORLD";
		String actual = sut.decode(cipherText, shift);
		assertEquals(expected, actual);
	}

}
