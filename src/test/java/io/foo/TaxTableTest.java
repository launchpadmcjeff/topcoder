package io.foo;

import static org.junit.Assert.*;
import io.foo.TaxTable;

import org.junit.Before;
import org.junit.Test;


public class TaxTableTest {

	private TaxTable sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new TaxTable();
	}

	@Test
	public void testIncome0() {
		int taxAmount = 47025;
		int expected = 200000;
		int actual = sut.income(taxAmount);
		assertEquals(expected, actual);
	}
	@Test
	public void testIncome1() {
		int taxAmount = 1000;
		int expected = -1;
		int actual = sut.income(taxAmount);
		assertEquals(expected, actual);
	}
	@Test
	public void testIncome2() {
		int taxAmount = 47026;
		int expected = 200003;
		int actual = sut.income(taxAmount);
		assertEquals(expected, actual);
	}
	@Test
	public void testIncome3() {
		int taxAmount = 86304;
		int expected = 319027;
		int actual = sut.income(taxAmount);
		assertEquals(expected, actual);
	}
	@Test
	public void testIncome4() {
		int taxAmount = 22792;
		int expected = 117266;
		int actual = sut.income(taxAmount);
		assertEquals(expected, actual);
	}

}
