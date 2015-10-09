package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
Problem Statement
Some students are seated in a row next to each other. Each of them is either left-handed or 
right-handed. You are given a String S that describes the row of students. Each character of 
S is either 'L' or 'R', representing a left-handed or a right-handed person, respectively. 
The characters describe the row from the left to the right: for all i, the person described 
by character i+1 sits to the right of the person described by character i. 



The students are trying to write down lecture notes. Whenever a left-handed person sits 
immediately to the right of a right-handed person, their elbows collide when they both try 
to write at the same time. Compute and return the number of elbow collisions, assuming that 
all students in the row attempt to write at the same time.

Definition

Class:	LeftAndRightHandedDiv2
Method:	count
Parameters:	String
Returns:	int
Method signature:	int count(String S)
(be sure your method is public)


Constraints
-	S will contain between 1 and 50 characters, inclusive.
-	Each character of S will be either 'L' or 'R'.

Examples
0)	

"L"
Returns: 0
There's only one person in the row so there are no collisions.
1)	

"RRR"
Returns: 0
Everybody is right-handed so there are no collisions.
2)	

"LRLRLR"
Returns: 2
There will be two collisions: one of them between the second and the third person from the left 
(described by S[1] and S[2]) and the other between the fourth and the fifth person.
3)	

"LLLRRR"
Returns: 0
4)	

"RLRLRL"
Returns: 3
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




This problem was used for: 
Single Round Match 612 Round 1 - Division II, Level One
*/
public class LeftAndRightHandedDiv2Test {

	private LeftAndRightHandedDiv2 sut;

	@Before
	public void setup() {
		sut = new LeftAndRightHandedDiv2();
	}

	@Test
	public void testCount0() {
		int actual = sut.count("L");
		assertEquals(0, actual);
	}

	@Test
	public void testCount1() {
		int actual = sut.count("RRR");
		assertEquals(0, actual);
	}

	@Test
	public void testCount2() {
		int actual = sut.count("LRLRLR");
		assertEquals(2, actual);
	}

	@Test
	public void testCount3() {
		int actual = sut.count("LLLRRR");
		assertEquals(0, actual);
	}

	@Test
	public void testCount4() {
		int actual = sut.count("RLRLRL");
		assertEquals(3, actual);
	}

}
