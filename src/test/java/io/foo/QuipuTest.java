package io.foo;

import static org.junit.Assert.*;
import io.foo.Quipu;

import org.junit.Before;
import org.junit.Test;


public class QuipuTest {

	private Quipu sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Quipu();
	}

	@Test
	public void testReadKnots0() {
		String knots = "-XX-XXXX-XXX-";
		int expected = 243;
		int actual = sut.readKnots(knots);
		assertEquals(expected, actual);
	}
	@Test
	public void testReadKnots1() {
		String knots = "-XX--XXXX---XXX-";
		int expected = 204003;
		int actual = sut.readKnots(knots);
		assertEquals(expected, actual);
	}
	@Test
	public void testReadKnots2() {
		String knots = "-X-";
		int expected = 1;
		int actual = sut.readKnots(knots);
		assertEquals(expected, actual);
	}
	@Test
	public void testReadKnots3() {
		String knots = "-X-------";
		int expected = 1000000;
		int actual = sut.readKnots(knots);
		assertEquals(expected, actual);
	}
	@Test
	public void testReadKnots4() {
		String knots = "-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-";
		int expected = 909979;
		int actual = sut.readKnots(knots);
		assertEquals(expected, actual);
	}

}
