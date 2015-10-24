package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.BlackAndRed;

import org.junit.Before;
import org.junit.Test;

public class BlackAndRedTest {

	private BlackAndRed sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new BlackAndRed();
	}

	@Test
	public void testCut0() {
		String deck = "BRBRBR";
		int expected = 0;
		int actual = sut.cut(deck);
		assertEquals(expected, actual);
	}
	@Test
	public void testCut1() {
		String deck = "RBRBRB";
		int expected = 1;
		int actual = sut.cut(deck);
		assertEquals(expected, actual);
	}
	@Test
	public void testCut2() {
		String deck = "BBBRRRRB";
		int expected = 7;
		int actual = sut.cut(deck);
		assertEquals(expected, actual);
	}
	@Test
	public void testCut3() {
		String deck = "BR";
		int expected = 0;
		int actual = sut.cut(deck);
		assertEquals(expected, actual);
	}
	@Test
	public void testCut4() {
		String deck = "RBRBBRRRRBBBRBBRRBRBBRRRBRBBBRBRBRBRBRRB";
		int expected = 9;
		int actual = sut.cut(deck);
		assertEquals(expected, actual);
	}

}
