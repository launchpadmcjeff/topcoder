package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SlimeXSlimeRancher2Test {
	/*
	Problem Statement
	You are playing a game titled Slime Rancher 2. You will be training slimes in this game. 



	You have a slime-in-training. Associated with the slime are N attributes, numbered 0 through N-1, 
	each represented by a positive integer. You are given int[] attributes containing N integers : the i-th 
	integer is the initial value of the i-th attribute for the slime. After the training is complete, each 
	of the slime's attributes will either stay the same or increase to some positive integer less than or 
	equal to 999. None of the attributes will decrease in value. The weight of the training is defined as 
	the sum of the differences between the final and initial values of all the attributes for the slime. 



	You are a master slime breeder, and you're able to obtain any possible final values for a slime's 
	attributes. This time, you would like to create a well-balanced slime. A slime is well-balanced if all 
	of its attributes have equal values. What is the minimum possible weight of the training?

	Definition

	Class:	SlimeXSlimeRancher2
	Method:	train
	Parameters:	int[]
	Returns:	int
	Method signature:	int train(int[] attributes)
	(be sure your method is public)


	Constraints
	-	attributes will contain between 2 and 50 elements, inclusive.
	-	Each element of attributes will be between 1 and 999, inclusive.

	Examples
	0)	

	{1,2,3}
	Returns: 3
	Train the slime such that all of its attributes are equal to 3. The total weight of the training 
	is |3 - 1| + |3 - 2| + |3 - 3| = 3.
	1)	

	{5,5}
	Returns: 0
	This slime is already well-balanced.
	2)	

	{900,500,100}
	Returns: 1200
	This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




	This problem was used for: 
	Single Round Match 506 Round 1 - Division II, Level One
	*/
	private SlimeXSlimeRancher2 sut;

	@Before
	public void setup() {
		sut = new SlimeXSlimeRancher2();
	}

	@Test
	public void testTrain0() {
		int actual = sut.train(new int[] { 1, 2, 3 });
		assertEquals(3, actual);
	}

	@Test
	public void testTrain1() {
		int actual = sut.train(new int[] { 5, 5 });
		assertEquals(0, actual);
	}

	@Test
	public void testTrain2() {
		int actual = sut.train(new int[] { 900, 500, 100 });
		assertEquals(1200, actual);
	}

}
