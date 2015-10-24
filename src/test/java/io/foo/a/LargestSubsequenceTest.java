package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.LargestSubsequence;

import org.junit.Before;
import org.junit.Test;

public class LargestSubsequenceTest {

	private LargestSubsequence sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new LargestSubsequence();
	}

	@Test
	public void testGetLargest0() {
		String s = "test";
		String expected = "tt";
		String actual = sut.getLargest(s);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLargest1() {
		String s = "a";
		String expected = "a";
		String actual = sut.getLargest(s);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLargest2() {
		String s = "example";
		String expected = "xple";
		String actual = sut.getLargest(s);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLargest3() {
		String s = "aquickbrownfoxjumpsoverthelazydog";
		String expected = "zyog";
		String actual = sut.getLargest(s);
		assertEquals(expected, actual);
	}

}
