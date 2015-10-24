package io.bar;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class BtTest {

	private Bt sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Bt();
	}

	@Test
	public void testBacktrack() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoo() {
		if (true & false) {
			
		}
		int actual = sut.foo();
		int expected = Integer.MAX_VALUE;
		assertEquals(expected, actual);
	}

	@Test
	public void testBar() {
		boolean bar = testfunc() <= new Date().getTime();
	}

	private Long testfunc() {
		// TODO Auto-generated method stub
		return null;
	}
}
