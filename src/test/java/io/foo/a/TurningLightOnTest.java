package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.TurningLightOn;

import org.junit.Before;
import org.junit.Test;

public class TurningLightOnTest {

	TurningLightOn sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new TurningLightOn();
	}

	@Test
	public void testMinFlips0() {
		String[] board = {"0001111",
						  "0001111",
			              "1111111"};
		int expected = 1;
		int actual = sut.minFlips(board);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinFlips1() {
		String[] board = {"1111111",
				 "1111111",
				 "1111111"};
		int expected = 0;
		int actual = sut.minFlips(board);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinFlips2() {
		String[] board = {"01001"};
		int expected = 3;
		int actual = sut.minFlips(board);
		assertEquals(expected, actual);
	}
	@Test
	public void testMinFlips3() {
		String[] board = {"0101",
				 "1010",
				 "0101",
				 "1010"};
		int expected = 7;
		int actual = sut.minFlips(board);
		assertEquals(expected, actual);
	}

}
