package io.foo;

import static org.junit.Assert.*;
import io.foo.SumOfPower;

import org.junit.Before;
import org.junit.Test;

/*
Problem Statement

You are given a int[] array. At any moment, you may choose a nonempty contiguous subsequence of array. Whenever 
you do so, you will gain power equal to the sum of all elements in the chosen subsequence.

You chose each possible contiguous subsequence exactly once, each time gaining some power. Compute and return 
the total amount of power you gained.

 
Definition
    	
Class:	SumOfPower
Method:	findSum
Parameters:	int[]
Returns:	int
Method signature:	int findSum(int[] array)
(be sure your method is public)
    
 
Constraints
-	array will contain between 1 and 50 elements, inclusive.
-	Each element in array will be between 1 and 100, inclusive.
 
Examples
0)	
    	
{1,2}
Returns: 6
We have the following three contiguous subsequences:
{1} => 1
{2} => 2
{1,2} => 3
Thus, the sum of all possible powers is 1+2+3=6.
1)	
    	
{1,1,1}
Returns: 10
A 3-element sequence has 6 possible nonempty contiguous subsequences. For the sequence {1,1,1} these are 
the subsequences: {1}, {1}, {1}, {1,1}, {1,1}, and {1,1,1}. Their sums are 1, 1, 1, 2, 2, and 3. If you 
choose each of them once, the total power you'll gain is 1+1+1+2+2+3 = 10.
2)	
    	
{3,14,15,92,65}
Returns: 1323
3)	
    	
{1,2,3,4,5,6,7,8,9,10}
Returns: 1210
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




This problem was used for: 
       Single Round Match 626 Round 1 - Division II, Level One
*/
public class SumOfPowerTest {

	private SumOfPower sut;

	@Before
	public void setup() {
		sut = new SumOfPower();
	}

	@Test
	public void testFindSum0() {
		int actual = sut.findSum(new int[] { 1, 2 });
		assertEquals(6, actual);
	}

	@Test
	public void testFindSum1() {
		int actual = sut.findSum(new int[] { 1, 1, 1 });
		assertEquals(10, actual);
	}

	@Test
	public void testFindSum2() {
		int actual = sut.findSum(new int[] { 3, 14, 15, 92, 65 });
		assertEquals(1323, actual);
	}

	@Test
	public void testFindSum3() {
		int actual = sut.findSum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		assertEquals(1210, actual);
	}

}
