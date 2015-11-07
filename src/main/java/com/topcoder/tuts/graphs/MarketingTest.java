package com.topcoder.tuts.graphs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarketingTest {

	private Marketing sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Marketing();
	}

	@Test
	public void testHowMany0() {
		String[] compete = {"1 4","2","3","0",""};
		int expected = 2;
		long actual = sut.howMany(compete);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHowMany1() {
		String[] compete = {"1","2","0"};
		int expected = -1;
		long actual = sut.howMany(compete);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHowMany2() {
		String[] compete = {"1","2","3","0","0 5","1"};
		int expected = 2;
		long actual = sut.howMany(compete);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHowMany3() {
		String[] compete = {"","","","","","","","","","",
				 "","","","","","","","","","",
				 "","","","","","","","","",""};
		int expected = 1073741824;
		long actual = sut.howMany(compete);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHowMany4() {
		String[] compete = {"1","2","3","0","5","6","4"};
		int expected = -1;
		long actual = sut.howMany(compete);
		assertEquals(expected, actual);
	}
}
