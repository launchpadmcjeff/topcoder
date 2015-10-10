package io.foo;

import static org.junit.Assert.*;
import io.foo.Sortness;

import org.junit.Before;
import org.junit.Test;


public class SortnessTest {

	private Sortness sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Sortness();
	}

	@Test
	public void testGetSortness0() {
		int[] a = { 3, 2, 1, 4, 6, 7, 5, 8 };
		double expected = 1.25;
		double actual = sut.getSortness(a);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testGetSortness1() {
		int[] a = {1,2,3};
		double expected = 0.0;
		double actual = sut.getSortness(a);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testGetSortness2() {
		int[] a = {5,4,3,2,1};
		double expected = 4.0;
		double actual = sut.getSortness(a);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta);
	}
	@Test
	public void testGetSortness3() {
		int[] a = {1,5,8,7,9,6,10,12,11,3,4,2};
		double expected = 5.166666666666667;
		double actual = sut.getSortness(a);
		double delta = 1.0e-9;
		assertEquals(expected, actual, delta);
	}

}
