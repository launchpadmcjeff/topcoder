package com.github.topcoder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class BettingMoneyTest {

	private BettingMoney sut;

	@Before
	public void setup() {
		sut = new BettingMoney();
	}

	@Test
	public void testMoneyMade0() {
		int actual = sut.moneyMade(new int[] { 10, 20, 30 }, new int[] { 20,
				30, 40 }, 1);
		assertEquals(3400, actual);
	}

	@Test
	public void testMoneyMade1() {
		int actual = sut.moneyMade(new int[] { 200, 300, 100 }, new int[] { 10,
				10, 10 }, 2);
		assertEquals(49000, actual);
	}

	@Test
	public void testMoneyMade2() {
		int actual = sut.moneyMade(new int[] { 100, 100, 100, 100 }, new int[] {
				5, 5, 5, 5 }, 0);
		assertEquals(29500, actual);
	}

	@Test
	public void testMoneyMade3() {
		int actual = sut.moneyMade(new int[] { 5000, 5000 },
				new int[] { 100, 2 }, 0);
		assertEquals(0, actual);
	}

	@Test
	public void testMoneyMade4() {
		int actual = sut.moneyMade(new int[] { 100 }, new int[] { 10 }, 0);
		assertEquals(-1000, actual);
	}

}
