package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SkipRopeTest {

	private SkipRope sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SkipRope();
	}

	@Test
	public void testPartners0() {
		int[] candidates = {102, 99, 104};
		int height = 100;
		int[] expecteds = { 99,  102 };
		int[] actuals = sut.partners(candidates, height);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPartners1() {
		int[] candidates = {102, 97, 104};
		int height = 100;
		int[] expecteds = { 97,  102 };
		int[] actuals = sut.partners(candidates, height);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPartners2() {
		int[] candidates = {101, 100, 99};
		int height = 100;
		int[] expecteds = { 100,  101 };
		int[] actuals = sut.partners(candidates, height);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPartners3() {
		int[] candidates = {75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170};
		int height = 169;
		int[] expecteds = { 170,  170 };
		int[] actuals = sut.partners(candidates, height);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPartners4() {
		int[] candidates = {134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137, 127, 130, 121, 
				 93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103, 149, 110, 156};
		int height = 82;
		int[] expecteds = { 79,  86 };
		int[] actuals = sut.partners(candidates, height);
		assertArrayEquals(expecteds, actuals);
	}

}
