package io.foo;

import static org.junit.Assert.*;
import io.foo.TheBeauty;

import org.junit.Before;
import org.junit.Test;


public class TheBeautyTest {
/*
	Examples
	0)	
	    	
	7
	Returns: 1
	Just one digit.
	1)	
	    	
	100
	Returns: 2
	Two distinct digits - 0 and 1.
	2)	
	    	
	123456789
	Returns: 9
	All the digits are different.
	3)	
	    	
	1000000000
	Returns: 2
	4)	
	    	
	932400154
	Returns: 7
	This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




	This problem was used for: 
	       Single Round Match 437 Round 1 - Division II, Level One
	*/
	private TheBeauty sut;
	
	@Before
	public void setup() {
		sut = new TheBeauty();
	}
	@Test
	public void testFind0() {
		int actual = sut.find(7);
		assertEquals(1, actual);
	}
	@Test
	public void testFind1() {
		int actual = sut.find(100);
		assertEquals(2, actual);
	}
	@Test
	public void testFind2() {
		int actual = sut.find(123456789);
		assertEquals(9, actual);
	}
	@Test
	public void testFind3() {
		int actual = sut.find(1000000000);
		assertEquals(2, actual);
	}
	@Test
	public void testFind4() {
		int actual = sut.find(932400154);
		assertEquals(7, actual);
	}

}
