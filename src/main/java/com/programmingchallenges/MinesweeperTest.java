package com.programmingchallenges;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinesweeperTest {

	private Minesweeper sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Minesweeper();
	}

	@Test
	public void testInput0() {
		String s = "4 4\n"
				+    "*...\n"
				+    "....\n"
				+    ".*..\n"
				+    "....";
		String expected = "Field #1:\n"
                        + "*100\n"
                        + "2210\n"
                        + "1*10\n"
                        + "1110";
		String actual = sut.input(s);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInput1() {
		String s = "3 5\n"
				+    "**...\n"
				+    ".....\n"
				+    ".*...";
		String expected = "Field #1:\n"
				+ "**100\n"
				+ "33200\n"
				+ "1*100";
		String actual = sut.input(s);
		assertEquals(expected, actual);
	}

}
