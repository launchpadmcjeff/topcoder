package io.foo;

import static org.junit.Assert.*;
import io.foo.FoxProgression;

import org.junit.Before;
import org.junit.Test;


public class FoxProgressionTest {

	private FoxProgression sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FoxProgression();
	}

	@Test
	public void testTheCount0() {
		int expected = 1;
		int[] seq = {1, 2, 4, 8};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount1() {
		int expected = 1;
		int[] seq = {5, 3, 1};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount2() {
		int expected = 1;
		int[] seq = {1, 1};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount3() {
		int expected = 1;
		int[] seq = {8, 4};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount4() {
		int expected = -1;
		int[] seq = {1};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount5() {
		int expected = 2;
		int[] seq = {4, 8};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount6() {
		int expected = 0;
		int[] seq = {1, 3, 4};
		int actual = sut.theCount(seq);
		assertEquals(expected, actual);
	}

}
