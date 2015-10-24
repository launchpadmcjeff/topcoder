package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.PalindromeDecoding;

import org.junit.Before;
import org.junit.Test;

public class PalindromeDecodingTest {

	private PalindromeDecoding sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new PalindromeDecoding();
	}

	@Test
	public void testDecode0() {
		String code = "ab";
		int[] position = {0};
		int[] length = {2};
		String expected = "abba";
		String actual = sut.decode(code, position, length);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode1() {
		String code = "Misip";
		int[] position = {2,3,1,7};
		int[] length = {1,1,2,2};
		String expected = "Mississippi";
		String actual = sut.decode(code, position, length);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode2() {
		String code = "XY";
		int[] position = {0, 0, 0, 0};
		int[] length = {2, 4, 8, 16};
		String expected = "XYYXXYYXXYYXXYYXXYYXXYYXXYYXXYYX";
		String actual = sut.decode(code, position, length);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode3() {
		String code = "TC206";
		int[] position = {1,2,5};
		int[] length = {1,1,1};
		String expected = "TCCC2006";
		String actual = sut.decode(code, position, length);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode4() {
		String code = "nodecoding";
		int[] position = {};
		int[] length = {};
		String expected = "nodecoding";
		String actual = sut.decode(code, position, length);
		assertEquals(expected, actual);
	}

}
