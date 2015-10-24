package io.foo.util;

import static org.junit.Assert.*;
import io.foo.util.BigFibber;

import org.junit.Before;
import org.junit.Test;

public class BigFibberTest {

	private BigFibber sut;

	@Before
	public void setUp() throws Exception {
		sut = new BigFibber();
	}

	@Test
	public void testTinyFib() {
		for (int i = 0; i < 20; i++) {
			System.out.println(sut.tinyFib(i));

		}
	}

	@Test
	public void testBigFib() {
		for (int i = 0; i < 20; i++) {
			System.out.println(sut.bigFib(i));
		}
	}

	@Test
	public void testBigFib2() {
		for (int i = 0; i < 20; i++) {
			System.out.println(sut.bigFib2(i));
		}
	}

}
