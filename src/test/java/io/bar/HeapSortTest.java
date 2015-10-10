package io.bar;

import static org.junit.Assert.*;
import io.bar.HeapSort;

import org.junit.Before;
import org.junit.Test;


public class HeapSortTest {
	HeapSort sut;
	int[] g1;
	int[] g1$;

	@Before
	public void setUp() {
		sut = new HeapSort();
		g1 = new int[] { 99, 88, 33, 44, 111, 87, 21, 16, 3, 1, 4, 28, 78, 314 };
		g1$ = new int[] { 1, 3, 4, 16, 21, 28, 33, 44, 78, 87, 88, 99, 111, 314 };
	}

	@Test
	public void testSort() {
		sut.sort(g1);
		assertArrayEquals(g1, g1$);
	}


}
