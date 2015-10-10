package io.foo;

import static org.junit.Assert.*;
import io.foo.Time;

import org.junit.Before;
import org.junit.Test;


public class TimeTest {
	Time sut;

	@Before
	public void setUp() {
		sut = new Time();
	}

	@Test
	public void testWhatTime0() {
		assertEquals("0:0:0", sut.whatTime(0));
	}

	@Test
	public void testWhatTime1() {
		assertEquals("1:1:1", sut.whatTime(3661));
	}

	@Test
	public void testWhatTime2() {
		assertEquals("1:30:36", sut.whatTime(5436));
	}

	@Test
	public void testWhatTime3() {
		assertEquals("23:59:59", sut.whatTime(86399));
	}
}
