package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class WakingUpEasyTest {
	/*
	0)	

	{5, 2, 4}
	13
	Returns: 4
	Initially, Alex's sleepiness is 13, and the list of alarms is {5, 2, 4}.
	After the first alarm, Alex's sleepiness is 8. The list of alarms becomes {2, 4, 5}.
	After the second alarm, Alex's sleepiness is 6. The list of alarms becomes {4, 5, 2}.
	After the third alarm, Alex's sleepiness is 2. The list of alarms becomes {5, 2, 4}.
	After the fourth alarm, Alex's sleepiness is -3, so Alex wakes up.
	1)	

	{5, 2, 4}
	3
	Returns: 1
	The first alarm is enough here.
	2)	

	{1}
	10000
	Returns: 10000
	The only alarm has to ring 10000 times before Alex finally wakes up.
	3)	

	{42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37,
	92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36,
	95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69}
	9999
	Returns: 203
	*/
	private WakingUpEasy sut;

	@Before
	public void setup() {
		sut = new WakingUpEasy();
	}

	@Test
	public void testCountAlarms0() {
		int ans = sut.countAlarms(new int[] { 5, 2, 4 }, 13);
		assertEquals(4, ans);
	}

	@Test
	public void testCountAlarms1() {
		int ans = sut.countAlarms(new int[] { 5, 2, 4 }, 3);
		assertEquals(1, ans);
	}

	@Test
	public void testCountAlarms2() {
		int ans = sut.countAlarms(new int[] { 1 }, 10000);
		assertEquals(10000, ans);
	}

	@Test
	public void testCountAlarms3() {
		int ans = sut.countAlarms(new int[] { 42, 68, 35, 1, 70, 25, 79, 59,
				63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54,
				93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36,
				95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69 }, 9999);
		assertEquals(203, ans);
	}

}
