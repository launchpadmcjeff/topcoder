package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.CeyKaps;

import org.junit.Before;
import org.junit.Test;

public class CeyKapsTest {

	private CeyKaps sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new CeyKaps();
	}

	@Test
	public void testDecipher0() {
		String typed = "AAAAA";
		String[] switches = {"A:B","B:C","A:D"};
		String expected = "CCCCC";
		String actual = sut.decipher(typed, switches);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecipher1() {
		String typed = "ABCDE";
		String[] switches = {"A:B","B:C","C:D","D:E","E:A"};
		String expected = "AEBCD";
		String actual = sut.decipher(typed, switches);
		assertEquals(expected, actual);
	}
	@Test
	public void testDecipher2() {
		String typed = "IHWSIOTCHEDMYKEYCAPSARWUND";
		String[] switches = {"W:O","W:I"};
		String expected = "WHOSWITCHEDMYKEYCAPSAROUND";
		String actual = sut.decipher(typed, switches);
		assertEquals(expected, actual);
	}

}
