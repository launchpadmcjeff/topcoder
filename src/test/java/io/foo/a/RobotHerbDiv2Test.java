package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.RobotHerbDiv2;

import org.junit.Before;
import org.junit.Test;

public class RobotHerbDiv2Test {

	private RobotHerbDiv2 sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new RobotHerbDiv2();
	}

	@Test
	public void testGetdist0() {
		int T = 1;
		int[] a = {1,2,3};
		int expected = 2;
		int actual = sut.getdist(T, a);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetdist1() {
		int T = 100;
		int[] a = {1};
		int expected = 0;
		int actual = sut.getdist(T, a);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetdist2() {
		int T = 5;
		int[] a = {1,1,2};
		int expected = 10;
		int actual = sut.getdist(T, a);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetdist3() {
		int T = 100;
		int[] a = {400000};
		int expected = 40000000;
		int actual = sut.getdist(T, a);
		assertEquals(expected, actual);
	}

}
