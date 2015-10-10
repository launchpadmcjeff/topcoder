package io.foo;

import static org.junit.Assert.*;
import io.foo.Soccer;

import org.junit.Before;
import org.junit.Test;


public class SoccerTest {
	/*
	Problem Statement for Soccer


	Problem Statement
	    	
	In soccer leagues, the winner of a match is awarded with 3 points and the loser 0 points. In case of a tie, 
	both teams are awarded with 1 point each.

	Create a class Soccer containing the method maxPoints which takes a int[] wins, the number of wins for each 
	team in the league, and a int[] ties, the number of ties for each team in the league and returns an int, the 
	maximum points a team in the league has. The i'th elements of wins and ties correspond to the number of wins 
	and ties respectively for team i.

	 
	Definition
	    	
	Class:	Soccer
	Method:	maxPoints
	Parameters:	int[], int[]
	Returns:	int
	Method signature:	int maxPoints(int[] wins, int[] ties)
	(be sure your method is public)
	    
	 
	Notes
	-	Two or more teams may have the same number of points.
	 
	Constraints
	-	wins will contain between 1 and 50 elements, inclusive.
	-	ties will contain between 1 and 50 elements, inclusive.
	-	wins will contain the same number of elements as ties.
	-	Each element in wins will be between 0 and 100, inclusive.
	-	Each element in ties will be between 0 and 100, inclusive.
	 
	Examples
	0)	
	    	
	{1,4,3,0,0}
	{3,1,5,3,1}
	Returns: 14
	The number of points for each team are:



	Team 0: 3*1 + 1*3 = 6 points

	Team 1: 3*4 + 1*1 = 13 points

	Team 2: 3*3 + 1*5 = 14 points

	Team 3: 3*0 + 1*3 = 3 points

	Team 4: 3*0 + 1*1 = 1 point



	So team 2 has the most number of points, 14. The method should thus return 14.

	1)	
	    	
	{12,45,20,17,48,0}
	{48,10,53,94,0,100}
	Returns: 145
	Both team 1 and team 3 got 145 points, which is the maximum.
	2)	
	    	
	{35,0}
	{0,76}
	Returns: 105
	3)	
	    	
	{0,0,0,0}
	{0,0,0,0}
	Returns: 0
	4)	
	    	
	{13,79,26,73,14,89,71,37,89,71,19,59,39}
	{88,27,5,70,84,94,20,50,2,11,31,22,50}
	Returns: 361
	This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




	This problem was used for: 
	       Single Round Match 140 Round 1 - Division II, Level One 
	       Single Round Match 194 Round 1 - Division II, Level One
	*/
	private Soccer sut;
	
	@Before
	public void setup() {
		sut = new Soccer();
	}

	@Test
	public void testMaxPoints0() {
		int actual = sut.maxPoints(new int[] { 1, 4, 3, 0, 0 }, new int[] { 3,
				1, 5, 3, 1 });
		assertEquals(14, actual);
	}

	@Test
	public void testMaxPoints1() {
		int actual = sut.maxPoints(new int[] { 12, 45, 20, 17, 48, 0 },
				new int[] { 48, 10, 53, 94, 0, 100 });
		assertEquals(145, actual);
	}

	@Test
	public void testMaxPoints2() {
		int actual = sut.maxPoints(new int[] { 35, 0 }, new int[] { 0, 76 });
		assertEquals(105, actual);
	}

	@Test
	public void testMaxPoints3() {
		int actual = sut.maxPoints(new int[] { 0, 0, 0, 0 }, new int[] { 0, 0,
				0, 0 });
		assertEquals(0, actual);
	}

	@Test
	public void testMaxPoints4() {
		int actual = sut.maxPoints(new int[] { 13, 79, 26, 73, 14, 89, 71, 37,
				89, 71, 19, 59, 39 }, new int[] { 88, 27, 5, 70, 84, 94, 20,
				50, 2, 11, 31, 22, 50 });
		assertEquals(361, actual);
	}

}
