package io.foo;

import static org.junit.Assert.*;
import io.foo.BinaryCode;

import org.junit.Before;
import org.junit.Test;


public class BinaryCodeTest {
	BinaryCode sut;

	@Before
	public void setUp() {
		sut = new BinaryCode();
	}

	@Test
	public void testDecode0() {
		assertArrayEquals(new String[] { "011100011", "NONE" },
				sut.decode("123210122"));
	}

	@Test
	public void testDecode1() {
		assertArrayEquals(new String[] { "01", "10" }, sut.decode("11"));
	}

	@Test
	public void testDecode2() {
		assertArrayEquals(new String[] { "NONE", "11001" }, sut.decode("22111"));
	}

	@Test
	public void testDecode3() {
		assertArrayEquals(new String[] { "NONE", "NONE" },
				sut.decode("123210120"));
	}

	@Test
	public void testDecode4() {
		assertArrayEquals(new String[] { "NONE", "NONE" }, sut.decode("3"));
	}

	@Test
	public void testDecode5() {
		assertArrayEquals(new String[] { "01101001101101001101001001001101001",
				"10110010110110010110010010010110010" },
				sut.decode("12221112222221112221111111112221111"));
	}
}
