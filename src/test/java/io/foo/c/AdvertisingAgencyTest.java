package io.foo.c;

import static org.junit.Assert.*;
import io.foo.c.AdvertisingAgency;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AdvertisingAgencyTest {

private AdvertisingAgency sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new AdvertisingAgency();
	}

	@Test
	public void testNumberOfRejections0() {
		int[] requests = new int[] {1,2,3};
		int expected = 0;
		int actual = sut.numberOfRejections(requests);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumberOfRejections1() {
		int[] requests = new int[] {1,1,1};
		int expected = 2;
		int actual = sut.numberOfRejections(requests);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumberOfRejections2() {
		int[] requests = new int[] {1,2,1,2};
		int expected = 2;
		int actual = sut.numberOfRejections(requests);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNumberOfRejections3() {
		int[] requests = new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
				 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
				 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
				 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
				 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		int expected = 49;
		int actual = sut.numberOfRejections(requests);
		assertEquals(expected, actual);
	}
	
}
