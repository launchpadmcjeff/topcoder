package com.github.topcoder;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

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


public class QuickSortTest {

	QuickSort sut;
	int[] g1;
	int[] g1$;

	@Before
	public void setUp() {
		sut = new QuickSort();
		g1 = new int[] { 33, 99, 88, 99, 33, 44, 111, 87, 21, 16, 33, 1, 4, 28, 78, 314 };
		g1$ = new int[] { 1, 4, 16, 21, 28, 33, 33, 33, 44, 78, 87, 88, 99, 99, 111, 314 };
	}

	@Test
	public void testSort() {
		sut.sort(g1);
		assertArrayEquals(g1$, g1);
	}

	@Test
	public void testConcurrentMap() throws InterruptedException,
			ExecutionException, TimeoutException {
		ConcurrentMap<String, String> foo = new ConcurrentHashMap<>();
		String res = foo.putIfAbsent("one", "uno");
		assertThat(res, is(nullValue()));
		res = foo.get("one");
		assertThat(res, is("uno"));
		ExecutorService bar = Executors.newFixedThreadPool(3);
//		ExecutorService bar = Executors.newCachedThreadPool();
		Collection<? extends Callable<String>> tasks = Arrays.asList(
				new MyCallable(), new MyCallable(), new MyCallable(),
				new MyCallable());
		List<Future<String>> invokeAll = bar.invokeAll(tasks);
		for (Future<String> i : invokeAll) {
			System.out.println(i.get(60, TimeUnit.MINUTES));
//			System.out.println(i.isDone());
		}
	}

	class MyCallable implements Callable<String> {
		@Override
		public String call() throws Exception {
			Thread.sleep(Math.abs(new Random().nextLong() % 10000));
			return "Hooray!";
		}

	}
}
