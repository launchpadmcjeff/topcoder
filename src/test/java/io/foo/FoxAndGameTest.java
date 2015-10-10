package io.foo;

import static org.junit.Assert.*;
import io.foo.FoxAndGame;

import org.junit.Before;
import org.junit.Test;

/*
Problem Statement
Fox Ciel is playing the popular game 'Cut the Rope' on her smartphone. The game has multiple stages, and for each 
stage the player can gain between 0 and 3 stars, inclusive. You are given a String[] result containing Fox Ciel's 
current results: For each stage, result contains an element that specifies Ciel's result in that stage. More 
precisely, result[i] will be "---" if she got 0 stars in stage i, "o--" if she got 1 star, "oo-" if she got 2 
stars and "ooo" if she managed to get all 3 stars. Return the total number of stars Ciel has at the moment.

Definition

Class:	FoxAndGame
Method:	countStars
Parameters:	String[]
Returns:	int
Method signature:	int countStars(String[] result)
(be sure your method is public)


Constraints
-	result will contain between 1 and 50 elements, inclusive.
-	Each element in result will be one of "---", "o--", "oo-", "ooo".

Examples
0)	

{"ooo",
"ooo"}
Returns: 6
There are two stages. In each of them, Ciel got all three stars. Together, she now has 3+3 = 6 stars.
1)	

{"ooo",
"oo-",
"o--"}
Returns: 6
This time the answer is 3 + 2 + 1 = 6.
2)	

{"ooo",
"---",
"oo-",
"---",
"o--"}
Returns: 6
3)	

{"o--",
"o--",
"o--",
"ooo",
"---"}
Returns: 6
4)	

{"---",
"o--",
"oo-",
"ooo",
"ooo",
"oo-",
"o--",
"---"}
Returns: 12
5)	

{"---",
"---",
"---",
"---",
"---",
"---"}
Returns: 0
6)	

{"oo-"}
Returns: 2
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.




This problem was used for: 
Single Round Match 571 Round 1 - Division II, Level One
*/
public class FoxAndGameTest {

	private FoxAndGame sut;

	@Before
	public void setup() {
		sut = new FoxAndGame();
	}

	@Test
	public void testCountStars0() {
		int actual = sut.countStars(new String[] { "ooo", "ooo" });
		assertEquals(6, actual);
	}

	@Test
	public void testCountStars1() {
		int actual = sut.countStars(new String[] { "ooo", "oo-", "o--" });
		assertEquals(6, actual);
	}

	@Test
	public void testCountStars2() {
		int actual = sut.countStars(new String[] { "ooo", "---", "oo-", "---",
				"o--" });
		assertEquals(6, actual);
	}

	@Test
	public void testCountStars3() {
		int actual = sut.countStars(new String[] { "o--", "o--", "o--", "ooo",
				"---" });
		assertEquals(6, actual);
	}

	@Test
	public void testCountStars4() {
		int actual = sut.countStars(new String[] { "---", "o--", "oo-", "ooo",
				"ooo", "oo-", "o--", "---" });
		assertEquals(12, actual);
	}

	@Test
	public void testCountStars5() {
		int actual = sut.countStars(new String[] { "---", "---", "---", "---",
				"---", "---" });
		assertEquals(0, actual);
	}

	@Test
	public void testCountStars6() {
		int actual = sut.countStars(new String[] { "oo-" });
		assertEquals(2, actual);
	}

}
