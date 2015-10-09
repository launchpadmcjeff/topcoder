package com.github.topcoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class RedAndGreenTest {

	RedAndGreen sut;

	@Before
	public void setUp() {
		sut = new RedAndGreen();
	}

	@Test
	public void testMinPaints0() {
		assertEquals(0, sut.minPaints("R"));
	}

	/*  
	"RGRGR"
	Returns: 2
	Paint the squares in the marked positions in the picture below with the opposite color. There are other ways with 2 total paints.
	RGRGR
	 |  |
	RRRGG
	*/
	@Test
	public void testMinPaints1() {
		assertEquals(2, sut.minPaints("RGRGR"));
	}

	/* 
	"RRRGGGGG"
	Returns: 0
	There is no need to paint anything.
	*/
	@Test
	public void testMinPaints2() {
		assertEquals(0, sut.minPaints("RRRGGGGG"));
	}

	
	/*    
	"GGGGRRR"
	Returns: 3
	Paint all the red squares green.
	*/
	@Test
	public void testMinPaints3() {
		assertEquals(3, sut.minPaints("GGGGRRR"));
	}
	
	/*    
	"RGRGRGRGRGRGRGRGR"
	Returns: 8
	*/
	@Test
	public void testMinPaints4() {
		assertEquals(8, sut.minPaints("RGRGRGRGRGRGRGRGR"));
	}
	
	/*    
	"RRRGGGRGGGRGGRRRGGRRRGR"
	Returns: 9
	*/
	@Test
	public void testMinPaints5() {
		assertEquals(9, sut.minPaints("RRRGGGRGGGRGGRRRGGRRRGR"));
	}
	
}
