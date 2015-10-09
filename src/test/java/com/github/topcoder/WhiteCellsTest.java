package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class WhiteCellsTest {

	private WhiteCells sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new WhiteCells();
	}

	@Test
	public void testCountOccupied0() {
		String[] board = { "........", "........", "........", "........",
				"........", "........", "........", "........" };

		int expected = 0;
		int actual = sut.countOccupied(board);
		assertEquals(expected, actual);
	}
	@Test
	public void testCountOccupied1() {
		String[] board = {"FFFFFFFF",
			"FFFFFFFF",
			"FFFFFFFF",
			"FFFFFFFF",
			"FFFFFFFF",
			"FFFFFFFF",
			"FFFFFFFF",
			"FFFFFFFF"};
		int expected = 32;
		int actual = sut.countOccupied(board);
		assertEquals(expected, actual);
	}
	@Test
	public void testCountOccupied2() {
		String[] board = {".F.F...F",
				"F...F.F.",
				"...F.F.F",
				"F.F...F.",
				".F...F..",
				"F...F.F.",
				".F.F.F.F",
				"..FF..F."};
		
		int expected = 1;
		int actual = sut.countOccupied(board);
		assertEquals(expected, actual);
	}
	@Test
	public void testCountOccupied3() {
		String[] board = {"........",
				"..F.....",
				".....F..",
				".....F..",
				"........",
				"........",
				".......F",
				".F......"};
		
		int expected = 2;
		int actual = sut.countOccupied(board);
		assertEquals(expected, actual);
	}

}
