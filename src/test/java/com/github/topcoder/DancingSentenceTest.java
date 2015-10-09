package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DancingSentenceTest {

	private DancingSentence sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DancingSentence();
	}

	@Test
	public void testMakeDancing0() {
		String sentence = "This is a dancing sentence";
		String actual = sut.makeDancing(sentence);
		String expected = "ThIs Is A dAnCiNg SeNtEnCe";
		assertEquals(expected , actual);
	}
	@Test
	public void testMakeDancing1() {
		String sentence = " This   is         a  dancing   sentence  ";
		String actual = sut.makeDancing(sentence);
		String expected = " ThIs   Is         A  dAnCiNg   SeNtEnCe  ";
		assertEquals(expected , actual);
	}
	@Test
	public void testMakeDancing2() {
		String sentence = "aaaaaaaaaaa";
		String actual = sut.makeDancing(sentence);
		String expected = "AaAaAaAaAaA";
		assertEquals(expected , actual);
	}
	@Test
	public void testMakeDancing3() {
		String sentence = "z";
		String actual = sut.makeDancing(sentence);
		String expected = "Z";
		assertEquals(expected , actual);
	}

}
