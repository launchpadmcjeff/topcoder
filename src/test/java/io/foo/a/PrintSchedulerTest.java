package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.PrintScheduler;

import org.junit.Before;
import org.junit.Test;

public class PrintSchedulerTest {

	private PrintScheduler sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new PrintScheduler();
	}

	@Test
	public void testGetOutput0() {
		String[] threads = {"AB","CD"};
		String[] slices = {"0 1","1 1","0 1","1 2"};
		String expected = "ACBDC";
		String actual = sut.getOutput(threads, slices);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOutput1() {
		String[] threads = {"ABCDE"};
		String[] slices = {"0 20","0 21"};
		String expected = "ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEA";
		String actual = sut.getOutput(threads, slices);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOutput2() {
		String[] threads = {"A","B"};
		String[] slices = {"1 10","0 1","1 10","0 2"};
		String expected = "BBBBBBBBBBABBBBBBBBBBAA";
		String actual = sut.getOutput(threads, slices);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOutput3() {
		String[] threads = {"A"};
		String[] slices = {"0 1"};
		String expected = "A";
		String actual = sut.getOutput(threads, slices);
		assertEquals(expected, actual);
	}

}
