package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KiloManTest {

	private KiloMan sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new KiloMan();
	}

	@Test
	public void testHitsTaken0() {
		int[] pattern = {1,3,2,3,3,1,2,2,1};
		String jumps = "JJSSSJSSJ";
		int expected = 4;
		int actual = sut.hitsTaken(pattern, jumps);
		assertEquals(expected, actual);
	}
	@Test
	public void testHitsTaken1() {
		int[] pattern = {1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,
				4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7};
		String jumps = "SSSSSSSSSSSSSSJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ";
		int expected = 49;
		int actual = sut.hitsTaken(pattern, jumps);
		assertEquals(expected, actual);
	}
	@Test
	public void testHitsTaken2() {
		int[] pattern = {1,2,2,1};
		String jumps = "SJJS";
		int expected = 2;
		int actual = sut.hitsTaken(pattern, jumps);
		assertEquals(expected, actual);
	}
	@Test
	public void testHitsTaken3() {
		int[] pattern = {1};
		String jumps = "J";
		int expected = 0;
		int actual = sut.hitsTaken(pattern, jumps);
		assertEquals(expected, actual);
	}

}
