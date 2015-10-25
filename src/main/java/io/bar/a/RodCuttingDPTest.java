package io.bar.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RodCuttingDPTest {

	private RodCuttingDP sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new RodCuttingDP();
	}

	@Test
	public void testCutRod0() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 1;
		int expected = 1;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod1() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 2;
		int expected = 5;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod2() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 3;
		int expected = 8;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod3() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 4;
		int expected = 10;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod4() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 5;
		int expected = 13;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod5() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 6;
		int expected = 17;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod6() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 7;
		int expected = 18;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod7() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 8;
		int expected = 22;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod8() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 9;
		int expected = 25;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCutRod9() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		int length = 10;
		int expected = 30;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCutRodA() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 33, 38, 39, 45, 52, 55, 55, 60};
		int length = 18;
		int expected = 60;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCutRodB() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 33, 38, 39, 45, 52, 55, 55, 60};
		int length = 16;
		int expected = 55;
		int actual = sut.cutRod(prices, length );
		assertEquals(expected, actual);
	}

}
