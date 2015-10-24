package io.foo.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeSoccerTest {

	private PrimeSoccer sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new PrimeSoccer();
	}

	@Test
	public void testGetProbability0() {
		int skillOfTeamA = 50;
		int skillOfTeamB = 50;
		double expected = 0.5265618908306351;
		double actual = sut.getProbability(skillOfTeamA, skillOfTeamB);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta );
	}
	@Test
	public void testGetProbability1() {
		int skillOfTeamA = 100;
		int skillOfTeamB = 100;
		double expected = 0.0;
		double actual = sut.getProbability(skillOfTeamA, skillOfTeamB);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta );
	}
	@Test
	public void testGetProbability2() {
		int skillOfTeamA = 12;
		int skillOfTeamB = 89;
		double expected = 0.6772047168840167;
		double actual = sut.getProbability(skillOfTeamA, skillOfTeamB);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta );
	}

}
