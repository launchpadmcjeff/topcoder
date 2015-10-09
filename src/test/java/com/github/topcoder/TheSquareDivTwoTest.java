package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TheSquareDivTwoTest {

	private TheSquareDivTwo sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new TheSquareDivTwo();
	}

	@Test
	public void testSolve0() {
		String[] board = { "..", "C." };
		String[] expecteds = { "..", ".C" };
		String[] actuals = sut.solve(board);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testSolve1() {
		String[] board = {"CC",
				 ".C"};
		String[] expecteds = {"C.", "CC" };
		String[] actuals = sut.solve(board);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testSolve2() {
		String[] board = {".C..",
				 "CC.C",
				 "..C.",
				 "CCCC"};
		String[] expecteds = {"...C", ".C.C", ".C.C", "CCCC" };
		String[] actuals = sut.solve(board);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testSolve3() {
		String[] board = {"...CCC",
				 "...CCC",
				 "...CCC",
				 "CCC...",
				 "CCC...",
				 "CCC..."};
		String[] expecteds = {"......", "......", "......", "CCCCCC", "CCCCCC", "CCCCCC" };
		String[] actuals = sut.solve(board);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testSolve4() {
		String[] board = {".....C",
				 "....CC",
				 "...CCC",
				 "..CCCC",
				 ".CCCCC",
				 "CCCCCC"};
		String[] expecteds = {".....C", "....CC", "...CCC", "..CCCC", ".CCCCC", "CCCCCC" };
		String[] actuals = sut.solve(board);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testSolve5() {
		String[] board = {"C.C..C.C..C..C.",
				 "CCC...C..CCC.C.",
				 "......CC...CCCC",
				 ".C..CC.C.C.C.C.",
				 "C....C.C......C",
				 ".....C..CCCCC.C",
				 "CCC.......CCCCC",
				 "..C.C..C.C...C.",
				 "CCC....CCC.CC..",
				 "CC.CCCC.CCCC...",
				 ".C..C.CC.C.CC.C",
				 "C.CCCC..CC..C.C",
				 ".CCCC.CCCCCC...",
				 "..C...C.CCC.CC.",
				 "CCCC..CCC.C...."};
		String[] expecteds = {"...............",
				"...............",
				"...............",
				"...............",
				"...............",
				".........C..C..",
				".........C.CC..",
				".C....C.CCCCC.C",
				".C.C.CC.CCCCCCC",
				"CCCC.CC.CCCCCCC",
				"CCCC.CCCCCCCCCC",
				"CCCCCCCCCCCCCCC",
				"CCCCCCCCCCCCCCC",
				"CCCCCCCCCCCCCCC",
				"CCCCCCCCCCCCCCC" };
		String[] actuals = sut.solve(board);
		assertArrayEquals(expecteds, actuals);
	}

}
