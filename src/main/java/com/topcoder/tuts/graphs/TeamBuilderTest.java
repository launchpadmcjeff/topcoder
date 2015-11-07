package com.topcoder.tuts.graphs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TeamBuilderTest {

	private TeamBuilder sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new TeamBuilder();
	}

	@Test
	public void testSpecialLocations0() {
		String [] paths = {"010","000","110"};
		int[] expecteds = { 1,  1 };
		int[] actuals = sut.specialLocations(paths);
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testSpecialLocations1() {
		String [] paths = {"0010","1000","1100","1000"};
		int[] expecteds = { 1,  3 };
		int[] actuals = sut.specialLocations(paths);
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testSpecialLocations2() {
		String [] paths = {"01000","00100","00010","00001","10000"};
		int[] expecteds = { 5,  5 };
		int[] actuals = sut.specialLocations(paths);
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testSpecialLocations3() {
		String [] paths = {"0110000","1000100","0000001","0010000","0110000","1000010","0001000"};
		int[] expecteds = { 1,  3 };
		int[] actuals = sut.specialLocations(paths);
		assertEquals(expecteds, actuals);
	}

}
