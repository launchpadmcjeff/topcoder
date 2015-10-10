package io.foo;

import static org.junit.Assert.*;
import io.foo.ImageDithering;

import org.junit.Before;
import org.junit.Test;


public class ImageDitheringTest {

	private ImageDithering sut;
	
	@Before
	public void setup() {
		sut = new ImageDithering();
	}
	@Test
	public void testCount0() {
		String dithered = "BW";
		String[] screen = { "AAAAAAAA", "ABWBWBWA", "AWBWBWBA", "ABWBWBWA",
				"AWBWBWBA", "AAAAAAAA" };
		int expected = 24;
		int actual = sut.count(dithered, screen);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount1() {
		String dithered = "BW";
		String[] screen = {"BBBBBBBB",
		 "BBWBWBWB",
		 "BWBWBWBB",
		 "BBWBWBWB",
		 "BWBWBWBB",
		 "BBBBBBBB"};
		int expected = 48;
		int actual = sut.count(dithered, screen);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount2() {
		String dithered = "ACEGIKMOQSUWY";
		String[] screen = {"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX"};
		int expected = 150;
		int actual = sut.count(dithered, screen);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount3() {
		String dithered = "CA";
		String[] screen = {"BBBBBBB",
		 "BBBBBBB",
		 "BBBBBBB"};
		int expected = 0;
		int actual = sut.count(dithered, screen);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount4() {
		String dithered = "DCBA";
		String[] screen = {"ACBD"};
		int expected = 4;
		int actual = sut.count(dithered, screen);
		assertEquals(expected, actual);
	}

}
