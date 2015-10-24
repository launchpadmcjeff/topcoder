package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.DukeOnChessBoard;

import org.junit.Before;
import org.junit.Test;

public class DukeOnChessBoardTest {

	private DukeOnChessBoard sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DukeOnChessBoard();
	}

	@Test
	public void testDukePath0() {
		int n = 3;
		String initPosition = "b2";
		String expected = "b2-c2-c3-b3-a3-a2-a1-b1-c1";
		String actual = sut.dukePath(n, initPosition);
		assertEquals(expected, actual);
	}
	@Test
	public void testDukePath1() {
		int n = 4;
		String initPosition = "d4";
		String expected = "d4-d3-d2-d1-c1-c2-c3...b3-b2-b1-a1-a2-a3-a4";
		String actual = sut.dukePath(n, initPosition);
		assertEquals(expected, actual);
	}
	@Test
	public void testDukePath2() {
		int n = 3;
		String initPosition = "a2";
		String expected = "a2-b2-c2-c3-b3-a3";
		String actual = sut.dukePath(n, initPosition);
		assertEquals(expected, actual);
	}
	@Test
	public void testDukePath3() {
		int n = 4;
		String initPosition = "d3";
		String expected = "d3-d4-c4-c3-c2-d2-d1...b2-b3-b4-a4-a3-a2-a1";
		String actual = sut.dukePath(n, initPosition);
		assertEquals(expected, actual);
	}
	@Test
	public void testDukePath4() {
		int n = 8;
		String initPosition = "a8";
		String expected = "a8-b8-c8-d8-e8-f8-g8...a1-a2-a3-a4-a5-a6-a7";
		String actual = sut.dukePath(n, initPosition);
		assertEquals(expected, actual);
	}
	@Test
	public void testDukePath5() {
		int n = 2;
		String initPosition = "a1";
		String expected = "a1-b1-b2-a2";
		String actual = sut.dukePath(n, initPosition);
		assertEquals(expected, actual);
	}

}
