package io.foo.util;

import static org.junit.Assert.*;
import io.foo.util.MergeSorter;

import org.junit.Before;
import org.junit.Test;

public class MergeSorterTest {

	MergeSorter sut;
	Integer[] g1;
	Integer[] g1$;

	@Before
	public void setUp() {
		sut = new MergeSorter();
		g1 = new Integer[] { 33, 99, 88, 99, 33, 37, 44, 111, 87, 21, 16, 33, 1, 4, 28, 78, 314 };
		g1$ = new Integer[] { 1, 4, 16, 21, 28, 33, 33, 33, 37, 44, 78, 87, 88, 99, 99, 111, 314 };
	}

	@Test
	public void testSort() {
		sut.sort(g1);
		assertArrayEquals(g1, g1$);
	}
}
