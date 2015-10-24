package io.foo.y;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13159">FibonacciDiv2</a>
 */
public class FibonacciDiv2 {
	
	public int find(int N) {
		int m2 = 0;
		int m1 = 1;
		int m0 = 1;
		while (m0 < N) {
			m0 = m1 + m2;
			m2 = m1;
			m1 = m0;
		}
		return Math.min(Math.abs(m1 - N), Math.abs(m2 - N));
	}
}