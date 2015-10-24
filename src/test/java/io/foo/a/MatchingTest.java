package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.Matching;

import org.junit.Before;
import org.junit.Test;

public class MatchingTest {

	private Matching sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Matching();
	}

	@Test
	public void testFindMatch0() {
		String[] first = { "DIAMOND", "BLUE", "SOLID", "ONE" };
		String[] second = { "DIAMOND", "GREEN", "SOLID", "TWO" };
		String[] expecteds = { "DIAMOND", "RED", "SOLID", "THREE" };
		String[] actuals = sut.findMatch(first, second);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testFindMatch1() {
		String[] first = {"CIRCLE","GREEN","EMPTY","TWO"};
		String[] second = {"DIAMOND","BLUE","STRIPED","ONE"};
		String[] expecteds = { "SQUIGGLE",  "RED",  "SOLID",  "THREE" };
		String[] actuals = sut.findMatch(first, second);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testFindMatch2() {
		String[] first = {"DIAMOND","RED","SOLID","ONE"};
		String[] second = {"SQUIGGLE","BLUE","SOLID","TWO"};
		String[] expecteds = { "CIRCLE",  "GREEN",  "SOLID",  "THREE" };
		String[] actuals = sut.findMatch(first, second);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testFindMatch3() {
		String[] first = {"SQUIGGLE","RED","STRIPED","ONE"};
		String[] second = {"SQUIGGLE","RED","STRIPED","ONE"};
		String[] expecteds = { "SQUIGGLE",  "RED",  "STRIPED",  "ONE" };
		String[] actuals = sut.findMatch(first, second);
		assertArrayEquals(expecteds, actuals);
	}

}
