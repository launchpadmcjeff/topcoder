package io.foo;

import static org.junit.Assert.*;
import io.foo.Chessboard;

import org.junit.Before;
import org.junit.Test;


public class ChessboardTest {

	private Chessboard sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Chessboard();
	}

	@Test
	public void testChangeNotation0() {
		String cell = "1";
		String expected = "a1";
		String actual = sut.changeNotation(cell);
		assertEquals(expected, actual);
	}
	@Test
	public void testChangeNotation1() {
		String cell = "2";
		String expected = "b1";
		String actual = sut.changeNotation(cell);
		assertEquals(expected, actual);
	}
	@Test
	public void testChangeNotation2() {
		String cell = "26";
		String expected = "b4";
		String actual = sut.changeNotation(cell);
		assertEquals(expected, actual);
	}
	@Test
	public void testChangeNotation3() {
		String cell = "c1";
		String expected = "3";
		String actual = sut.changeNotation(cell);
		assertEquals(expected, actual);
	}
	@Test
	public void testChangeNotation4() {
		String cell = "e4";
		String expected = "29";
		String actual = sut.changeNotation(cell);
		assertEquals(expected, actual);
	}
	@Test
	public void testChangeNotation5() {
		String cell = "h8";
		String expected = "64";
		String actual = sut.changeNotation(cell);
		assertEquals(expected, actual);
	}

}
