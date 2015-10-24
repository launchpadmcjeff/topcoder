package io.foo.a;

import java.util.Arrays;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=10697">RabbitNumbering</a>
 */
public class RabbitNumbering {

	public int theCount(int[] maxNumber) {
		Arrays.sort(maxNumber);
		
		long t = maxNumber[0];
		
		for (int i = 1; i < maxNumber.length; i++) {
			t *= maxNumber[i] - i;
			if (t >= 1_000_000_007) {
				t %= 1_000_000_007;
			}
		}
		
		return (int)t;
	}
}
