package io.foo.util;

import static org.junit.Assert.*;
import io.foo.util.BinarySearcher;

import org.junit.Before;
import org.junit.Test;

public class BinarySearcherTest {

	private BinarySearcher sut;
	private Integer[] in;

	@Before
	public void setUp() {
		sut = new BinarySearcher();
		in = new Integer[] { 1, 4, 16, 21, 28, 33, 33, 33, 37, 44, 78, 87, 88, 99, 99, 111, 314 };
	}

	@Test
	public void testFind0() {
		int expected = 9;
		int actual = sut.find(in, 44);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind1() {
		int expected = -1;
		int actual = sut.find(in, 0);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind2() {
		int expected = -1;
		int actual = sut.find(in, 999);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind3() {
		int actual = sut.find(in, 33);
		assertTrue(actual >= 5 && actual <= 7);
	}
	@Test
	public void testFind4() {
		int expected = 11;
		int actual = sut.find(in, 87);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind5() {
		int expected = -1;
		int actual = sut.find(new Integer[] {1, 3}, 5);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind6() {
		int expected = -1;
		int actual = sut.find(new Integer[] {42}, 38);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind7() {
		int expected = 0;
		int actual = sut.find(new Integer[] {42}, 42);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind8() {
		int expected = -1;
		int actual = sut.find(new Integer[] {1, 2, 4, 5}, 3);
		assertEquals(expected, actual);
	}
	@Test
	public void testFind9() {
		int expected = 0;
		int actual = sut.find(new Integer[] {1, 3, 5}, 1);
		assertEquals(expected, actual);
	}
}
