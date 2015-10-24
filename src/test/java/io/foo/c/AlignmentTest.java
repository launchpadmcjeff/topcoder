package io.foo.c;

import static org.junit.Assert.*;
import io.foo.c.Alignment;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class AlignmentTest {

	private Alignment sut;

	@Before
	public void setUp() throws Exception {
		sut = new Alignment();
	}

	@Test
	public void testAlign0() {
		String A = "ABC";
		String B = "ACE";
		int x = 1;
		int expected = 4;
		int actual = sut.align(A, B, x);
		int best = align(A, B, x);
		assertEquals(expected, best);
//		assertEquals(expected, actual);
	}
	@Test
	public void testAlign1() {
		String A = "AAABAAAABAA";
		String B = "AAAABAABAAA";
		int x = 1;
		int expected = 7;
		int actual = sut.align(A, B, x);
		int best = align(A, B, x);
		assertEquals(expected, best);
//		assertEquals(expected, actual);
	}
	@Test
	public void testAlign2() {
		String A = "AAABAAAABAA";
		String B = "AAAABAABAAA";
		int x = 10;
		int expected = 28;
		int actual = sut.align(A, B, x);
		int best = align(A, B, x);
		assertEquals(expected, best);
//		assertEquals(expected, actual);
	}
	@Test
	public void testAlign3() {
		String A = "AA";
		String B = "B";
		int x = 1;
		int expected = 5;
		int actual = sut.align(A, B, x);
		int best = align(A, B, x);
		assertEquals(expected, best);
//		assertEquals(expected, actual);
	}
	
	public int align(String A, String B, int x) {
		int c[][] = new int[A.length() + 1][B.length() + 1];
		for (int b = 1; b <= B.length(); b++)
			c[0][b] = x + b;
		for (int a = 1; a <= A.length(); a++)
			c[a][0] = x + a;
		System.out.println(Arrays.deepToString(c).replaceAll("],","]\n"));
		System.out.println("---");
		for (int b = 1; b <= B.length(); b++) {
			for (int a = 1; a <= A.length(); a++) {
//				int w = -1 >>> 1;
				int w = Integer.MAX_VALUE;
				if (A.charAt(a - 1) == B.charAt(b - 1)) {
					w = c[a - 1][b - 1];
				} else {
					for (int s = b; s-- > 0;) {
						w = Math.min(w, c[a][s] + (b - s) + x);
					}
					for (int s = a; s-- > 0;) {
						w = Math.min(w, c[s][b] + (a - s) + x);
					}
				}
				c[a][b] = w;
			}
		}
		System.out.println(Arrays.deepToString(c).replaceAll("],","]\n"));
		System.out.println("****");
		return c[A.length()][B.length()];
	}
	
}
