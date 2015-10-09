package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElectionFraudDiv2Test {

	private ElectionFraudDiv2 sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new ElectionFraudDiv2();
	}

	@Test
	public void testIsFraudulent0() {
		int[] percentages = {100};
		String expected = "NO";
		String actual = sut.IsFraudulent(percentages);
		assertEquals(expected, actual);
	}
	@Test
	public void testIsFraudulent1() {
		int[] percentages = {34, 34, 34};
		String expected = "YES";
		String actual = sut.IsFraudulent(percentages);
		assertEquals(expected, actual);
	}
	@Test
	public void testIsFraudulent2() {
		int[] percentages = {12, 12, 12, 12, 12, 12, 12, 12};
		String expected = "YES";
		String actual = sut.IsFraudulent(percentages);
		assertEquals(expected, actual);
	}
	@Test
	public void testIsFraudulent3() {
		int[] percentages = {13, 13, 13, 13, 13, 13, 13, 13};
		String expected = "NO";
		String actual = sut.IsFraudulent(percentages);
		assertEquals(expected, actual);
	}
	@Test
	public void testIsFraudulent4() {
		int[] percentages = {0, 1, 100};
		String expected = "NO";
		String actual = sut.IsFraudulent(percentages);
		assertEquals(expected, actual);
	}
	@Test
	public void testIsFraudulent5() {
		int[] percentages = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8};
		String expected = "NO";
		String actual = sut.IsFraudulent(percentages);
		assertEquals(expected, actual);
	}

}
