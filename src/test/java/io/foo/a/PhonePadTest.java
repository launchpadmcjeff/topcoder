package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.PhonePad;

import org.junit.Before;
import org.junit.Test;

public class PhonePadTest {

	private PhonePad sut;

	@Before
	public void setUp() throws Exception {
		sut = new PhonePad();
	}

	@Test
	public void testFingerMovement0() {
		String phoneNumber = "911";
		int expected = 6;
		int actual = sut.fingerMovement(phoneNumber);
		assertEquals(expected, actual);
	}

	@Test
	public void testFingerMovement1() {
		String phoneNumber = "5555555";
		int expected = 0;
		int actual = sut.fingerMovement(phoneNumber);
		assertEquals(expected, actual);
	}

	@Test
	public void testFingerMovement2() {
		String phoneNumber = "8606335540";
		int expected = 16;
		int actual = sut.fingerMovement(phoneNumber);
		assertEquals(expected, actual);
	}

	@Test
	public void testFingerMovement3() {
		String phoneNumber = "8606574276";
		int expected = 21;
		int actual = sut.fingerMovement(phoneNumber);
		assertEquals(expected, actual);
	}

}
