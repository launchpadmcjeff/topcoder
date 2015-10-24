package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.RabbitNumbering;

import org.junit.Before;
import org.junit.Test;

public class RabbitNumberingTest {

	private RabbitNumbering sut;

	@Before
	public void setUp() throws Exception {
		sut = new RabbitNumbering();
	}

	@Test
	public void testTheCount0() {
		int[] maxNumber = { 5 };
		int expected = 5;
		int actual = sut.theCount(maxNumber);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount1() {
		int[] maxNumber = {4, 4, 4, 4};
		int expected = 24;
		int actual = sut.theCount(maxNumber);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount2() {
		int[] maxNumber = {5, 8};
		int expected = 35;
		int actual = sut.theCount(maxNumber);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount3() {
		int[] maxNumber = {2, 1, 2};
		int expected = 0;
		int actual = sut.theCount(maxNumber);
		assertEquals(expected, actual);
	}
	@Test
	public void testTheCount4() {
		int[] maxNumber = {25, 489, 76, 98, 704, 98, 768, 39, 697, 8, 56, 74, 36, 95, 87, 2, 968, 4, 920, 54, 873, 90};
		int expected = 676780400;
		int actual = sut.theCount(maxNumber);
		assertEquals(expected, actual);
	}

}
