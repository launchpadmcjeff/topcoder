package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AccountBalanceTest {

	private AccountBalance sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new AccountBalance();
	}

	@Test
	public void testProcessTransactions0() {
		int startingBalance = 100;
		String[] transactions = {"C 1000", "D 500", "D 350"};
		int expected = 250;
		int actual = sut.processTransactions(startingBalance, transactions);
		assertEquals(expected, actual);
	}
	@Test
	public void testProcessTransactions1() {
		int startingBalance = 100;
		String[] transactions = {};
		int expected = 100;
		int actual = sut.processTransactions(startingBalance, transactions);
		assertEquals(expected, actual);
	}
	@Test
	public void testProcessTransactions2() {
		int startingBalance = 100;
		String[] transactions = {"D 50", "D 20", "D 40"};
		int expected = -10;
		int actual = sut.processTransactions(startingBalance, transactions);
		assertEquals(expected, actual);
	}
	@Test
	public void testProcessTransactions3() {
		int startingBalance = 53874;
		String[] transactions = {"D 1234", "C 987", "D 2345", "C 654", "D 6789", "D 34567"};
		int expected = 10580;
		int actual = sut.processTransactions(startingBalance, transactions);
		assertEquals(expected, actual);
	}

}
