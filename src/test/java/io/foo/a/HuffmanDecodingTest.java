package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.HuffmanDecoding;

import org.junit.Before;
import org.junit.Test;

public class HuffmanDecodingTest {

	private HuffmanDecoding sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new HuffmanDecoding();
	}

	@Test
	public void testDecode0() {
		String archive = "101101";
		String[] dictionary = {"00","10","01","11"};
		String expected = "BDC";
		String actual = sut.decode(archive, dictionary);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode1() {
		String archive = "10111010";
		String[] dictionary = {"0","111","10"};
		String expected = "CBAC";
		String actual = sut.decode(archive, dictionary);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode2() {
		String archive = "0001001100100111001";
		String[] dictionary = {"1","0"};
		String expected = "BBBABBAABBABBAAABBA";
		String actual = sut.decode(archive, dictionary);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode3() {
		String archive = "111011011000100110";
		String[] dictionary = {"010","00","0110","0111","11","100","101"};
		String expected = "EGGFAC";
		String actual = sut.decode(archive, dictionary);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecode4() {
		String archive = "001101100101100110111101011001011001010";
		String[] dictionary = {"110","011","10","0011","00011","111","00010","0010","010","0000"};
		String expected = "DBHABBACAIAIC";
		String actual = sut.decode(archive, dictionary);
		assertEquals(expected, actual);
	}

}
