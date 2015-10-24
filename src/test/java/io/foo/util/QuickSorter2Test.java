package io.foo.util;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import io.foo.util.QuickSorter2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Before;
import org.junit.Test;

public class QuickSorter2Test {

	QuickSorter2 sut;
	Integer[] g1;
	Integer[] g1$;

	@Before
	public void setUp() {
		sut = new QuickSorter2();
		g1 = new Integer[] { 33, 99, 88, 99, 33, 37, 44, 111, 87, 21, 16, 33, 1, 4, 28, 78, 314 };
		g1$ = new Integer[] { 1, 4, 16, 21, 28, 33, 33, 33, 37, 44, 78, 87, 88, 99, 99, 111, 314 };
	}

	@Test
	public void testSort0() {
		sut.sort(g1);
		assertArrayEquals(g1$, g1);
	}
	@Test
	public void testSort1() {
		Integer[] in = new Integer[] {2, 1};
		Integer[] expecteds = new Integer[] {1, 2};
		sut.sort(in);
		assertArrayEquals(expecteds, in);
	}
	@Test
	public void testSort2() {
		g1 = new Integer[]{1, 2, 3};
		g1$ = new Integer[] {1, 2, 3};
		sut.sort(g1);
		assertArrayEquals(g1$, g1);
	}
	@Test
	public void testSort3() {
		g1 = new Integer[0];
		g1$ = new Integer[0];
		sut.sort(g1);
		assertArrayEquals(g1$, g1);
	}
	@Test
	public void testSort4() {
		g1 = null;
		g1$ = null;
		sut.sort(g1);
		assertArrayEquals(g1$, g1);
	}
}
