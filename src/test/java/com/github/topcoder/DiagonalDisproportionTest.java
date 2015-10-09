package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiagonalDisproportionTest {

	private DiagonalDisproportion sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DiagonalDisproportion();
	}

	@Test
	public void testGetDisproportion0() {
		String[] matrix = {"190","828","373"};
		int expected = 1;
		int actual = sut.getDisproportion(matrix);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetDisproportion1() {
		String[] matrix = {"9000","0120","0000","9000"};
		int expected = -1;
		int actual = sut.getDisproportion(matrix);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetDisproportion2() {
		String[] matrix = {"6"};
		int expected = 0;
		int actual = sut.getDisproportion(matrix);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetDisproportion3() {
		String[] matrix = {"7748297018","8395414567","7006199788","5446757413","2972498628",
				"0508396790","9986085827","2386063041","5687189519","7729785238"};
		int expected = -24;
		int actual = sut.getDisproportion(matrix);
		assertEquals(expected, actual);
	}

}
