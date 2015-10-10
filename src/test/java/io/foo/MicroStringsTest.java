package io.foo;

import static org.junit.Assert.*;
import io.foo.MicroStrings;

import org.junit.Before;
import org.junit.Test;

/*
Problem Statement

John couldn't handle long strings so he came up with the idea of MicroStrings.



You are given two positive ints: A and D. These determine an infinite decreasing arithmetic 
progression: A, A-D, A-2D, and so on. Clearly, only finitely many elements of such a progression 
are non-negative.



Each such progression defines one MicroString, as follows: You take all the non-negative 
elements, convert each of them into a string, and then concatenate those strings (in order).



For example, let A=12 and D=5. For these values we get the arithmetic progression 
(12, 7, 2, -3, -8, ...). The non-negative elements are 12, 7, and 2. The corresponding 
strings are "12", "7", and "2". Their concatenation is the following MicroString: "1272".



Given A and D, return the MicroString they define.

 
Definition
    	
Class:	MicroStrings
Method:	makeMicroString
Parameters:	int, int
Returns:	String
Method signature:	String makeMicroString(int A, int D)
(be sure your method is public)
    
 
Notes
-	When converting a number to a string, the string must not have unnecessary leading zeros.
 
Constraints
-	A will be between 1 and 200, inclusive.
-	D will be between 1 and 200, inclusive.
 
Examples
0)	
    	
12
5
Returns: "1272"
This is the example from the problem statement.
1)	
    	
3
2
Returns: "31"
2)	
    	
31
40
Returns: "31"
3)	
    	
30
6
Returns: "3024181260"
The number 0 is also non-negative. When we convert it into a string, we get the string "0".
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




This problem was used for: 
       Single Round Match 614 Round 1 - Division II, Level One
       
*/
public class MicroStringsTest {

	private MicroStrings sut;
	
	@Before
	public void setup() {
		sut = new MicroStrings();
	}
	@Test
	public void testMakeMicroString0() {
		String actual = sut.makeMicroString(12, 5);
		assertEquals("1272", actual);
	}
	@Test
	public void testMakeMicroString1() {
		String actual = sut.makeMicroString(3, 2);
		assertEquals("31", actual);
	}
	@Test
	public void testMakeMicroString2() {
		String actual = sut.makeMicroString(31, 40);
		assertEquals("31", actual);
	}
	@Test
	public void testMakeMicroString3() {
		String actual = sut.makeMicroString(30, 6);
		assertEquals("3024181260", actual);
	}

}
