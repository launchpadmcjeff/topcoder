package com.topcoder.tuts.graphs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DungeonEscapeTest {

	private DungeonEscape sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DungeonEscape();
	}

	@Test
	public void testExitTime0() {
		String[] up = {	"0x4",
						"0x3",
			 			"0x3"};
		String[] down = {"0x9",
						"009",
			 			"0x9"};
		String[] east = {"0x9",
			 "1x9",
			 "009"};
		String[] west = {"0x9",
			 "0x0",
			 "009"};
		int startLevel = 2;
		int startEasting = 2;
		int expected = 10;
		int actual = sut.exitTime(up, down, east, west, startLevel, startEasting);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExitTime1() {
		String[] up = {"xxxxxxxxx1",
					 "1xxxxxxxxx",
					 "xxxxxxxxx1"};
		String[] down = {"xxxxxxxxxx",
				 "xxxxxxxxxx",
				 "xxxxxxxxxx"};
		String[] east = {"1111111111",
				 "xxxxxxxxxx",
				 "1111111111"};
		String[] west = {"xxxxxxxxxx",
				 "1111111111",
				 "xxxxxxxxxx"};
		int startLevel = 2;
		int startEasting = 0;
		int expected = 30;
		int actual = sut.exitTime(up, down, east, west, startLevel, startEasting);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExitTime2() {
		String[] up = {"xxxxxxxxx1",
					 "xxxx999991",
					 "x999999991"};
		String[] down = {"1111111111",
				 "1111111111",
				 "1111111111"};
		String[] east = {"1111122242",
				 "2222222241",
				 "2111111111"};
		String[] west = {"xxxxxxxxx1",
				 "1111111111",
				 "xxxxxxxxx1"};
		int startLevel = 2;
		int startEasting = 0;
		int expected = -1;
		int actual = sut.exitTime(up, down, east, west, startLevel, startEasting);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExitTime3() {
		String[] up = {"1x2x3x4x5x6x7x8x9",
					 "00000000000000000",
					 "98765432223456789",
					 "12345678987654321"};
		String[] down = {"00000000000000000",
				 "00000000000000000",
				 "00000000000000000",
				 "00000000000000000"};
		String[] east = {"xxxxxxxxxxxxxxxxx",
				 "xxxxxxxxxxxxxxxxx",
				 "22222222222222222",
				 "33333333333333333"};
		String[] west = {"xxxxxxxxxxxxxxxxx",
				 "xxxxxxxxxxxxxxxxx",
				 "22222222222222222",
				 "33333333333333333"};
		int startLevel = 3;
		int startEasting = 12;
		int expected = 17;
		int actual = sut.exitTime(up, down, east, west, startLevel, startEasting);
		assertEquals(expected, actual);
	}

}
