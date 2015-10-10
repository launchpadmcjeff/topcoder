package io.foo;

import static org.junit.Assert.*;
import io.foo.WritingWords;

import org.junit.Before;
import org.junit.Test;


public class WritingWordsTest {
	/*
	 * 0)
	 * 
	 * "A" Returns: 1 One tap types the letter A. 1)
	 * 
	 * "ABC" Returns: 6 To type ABC, Ciel will do the following: Tap the button
	 * once to type A. Tap the button twice to type B. Tap the button three
	 * times to type C. The total number of taps is 1+2+3 = 6. 2)
	 * 
	 * "VAMOSGIMNASIA" Returns: 143 3)
	 * 
	 * "TOPCODER" Returns: 96 4)
	 * 
	 * "SINGLEROUNDMATCH" Returns: 183 5)
	 * 
	 * "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ" Returns: 1300 This
	 * problem statement is the exclusive and proprietary property of TopCoder,
	 * Inc. Any unauthorized use or reproduction of this information without the
	 * prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010,
	 * TopCoder, Inc. All rights reserved.
	 */

	private WritingWords sut;

	@Before
	public void setup() {
		sut = new WritingWords();
	}

	@Test
	public void testWrite0() {
		int ans = sut.write("A");
		assertEquals(ans, 1);
	}

	@Test
	public void testWrite1() {
		int ans = sut.write("ABC");
		assertEquals(ans, 6);
	}

	@Test
	public void testWrite2() {
		int ans = sut.write("VAMOSGIMNASIA");
		assertEquals(ans, 143);
	}

	@Test
	public void testWrite3() {
		int ans = sut.write("TOPCODER");
		assertEquals(ans, 96);
	}

	@Test
	public void testWrite4() {
		int ans = sut.write("SINGLEROUNDMATCH");
		assertEquals(ans, 183);
	}

	@Test
	public void testWrite5() {
		int ans = sut
				.write("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		assertEquals(ans, 1300);
	}

}
