package com.github.topcoder;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;


public class BigSorterTest {
	BigSorter sut;
	Integer[] g1;
	Integer[] g1$;
	Integer[] g2;
	Integer[] g2$;

	class C implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return a.compareTo(b);
		}
	}

	@Before
	public void setUp() {
		sut = new BigSorter();
		g1 = new Integer[] { 99, 88, 33, 44, 111, 87, 21, 16, 3, 1, 4, 28, 78,
				314 };
		g1$ = new Integer[] { 1, 3, 4, 16, 21, 28, 33, 44, 78, 87, 88, 99, 111,
				314 };
		g2 = new Integer[] { 99, 88, 33, 2, 7, 1, 8, 28, 44, 111, 87, 21, 16, 3, 1, 4, 28, 78,
				314 };
		g2$ = new Integer[] { 1, 1, 2, 3, 4, 7, 8, 16, 21, 28, 28, 33, 44, 78, 87, 88, 99, 111,
				314 };
	}

	@Test
	public void testMergeSort() {
		sut.mergeSort(g1, new C());
		assertArrayEquals(g1$, g1);
	}

	@Test
	public void testQuickSort() {
		sut.quickSort(g1, new C());
		assertArrayEquals(g1$, g1);
	}
	@Test
	public void testQuickSort2() {
		sut.quickSort(g2, new C());
		assertArrayEquals(g2$, g2);
	}

	@Test
	public void testHeapSort() {
		sut.heapSort(g1, new C());
		assertArrayEquals(g1$, g1);
	}
	
	@Test
	public void testHeapSort2() {
		sut.heapSort(g2, new C());
		assertArrayEquals(g2$, g2);
	}

}
