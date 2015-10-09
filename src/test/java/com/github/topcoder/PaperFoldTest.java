package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PaperFoldTest {

	private PaperFold sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new PaperFold();
	}

	@Test
	public void testNumFolds0() {
		int[] paper = {8, 11};
		int[] box = {6, 10};
		int expected = 1;
		int actual = sut.numFolds(paper, box);
		assertEquals(expected, actual);
	}
	@Test
	public void testNumFolds1() {
		int[] paper = {11, 17};
		int[] box = {6, 4};
		int expected = 4;
		int actual = sut.numFolds(paper, box);
		assertEquals(expected, actual);
	}
	@Test
	public void testNumFolds2() {
		int[] paper = {11, 17};
		int[] box = {5, 4};
		int expected = 4;
		int actual = sut.numFolds(paper, box);
		assertEquals(expected, actual);
	}
	@Test
	public void testNumFolds3() {
		int[] paper = {1000,1000};
		int[] box = {62,63};
		int expected = -1;
		int actual = sut.numFolds(paper, box);
		assertEquals(expected, actual);
	}
	@Test
	public void testNumFolds4() {
		int[] paper = {100,30};
		int[] box = {60,110};
		int expected = 0;
		int actual = sut.numFolds(paper, box);
		assertEquals(expected, actual);
	}
	@Test
	public void testNumFolds5() {
		int[] paper = {1895, 6416};
		int[] box = {401, 1000};
		int expected = 5;
		int actual = sut.numFolds(paper, box);
		assertEquals(expected, actual);
	}

}
