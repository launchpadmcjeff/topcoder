package io.foo;

import static org.junit.Assert.*;
import io.foo.CheckFunction;

import org.junit.Before;
import org.junit.Test;


public class CheckFunctionTest {
	/*
	0)	
   	
	"13579"
	Returns: 21
	1 consists of 2 dashes;

	3 consists of 5 dashes;

	5 consists of 5 dashes;

	7 consists of 3 dashes;

	9 consists of 6 dashes;

	2 + 5 + 5 + 3 + 6 = 21.
	1)	
	   	
	"02468"
	Returns: 28
	2)	
	   	
	"73254370932875002027963295052175"
	Returns: 157
*/
	private CheckFunction sut;
	
	@Before
	public void setup() {
		sut = new CheckFunction();
	}
	@Test
	public void testNewFunction0() {
		int ret = sut.newFunction("13579");
		assertEquals(21, ret);
	}
	@Test
	public void testNewFunction1() {
		int ret = sut.newFunction("02468");
		assertEquals(28, ret);
	}
	@Test
	public void testNewFunction2() {
		int ret = sut.newFunction("73254370932875002027963295052175");
		assertEquals(157, ret);
	}

}
