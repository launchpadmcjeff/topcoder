package io.foo;

import java.util.Arrays;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=10396">UnluckyNumbers</a>
 */
public class UnluckyNumbers {

	public int getCount(int[] luckySet, int n) {
		int ret = 0;
		Arrays.sort(luckySet);
		
		int lo = -1;
		int hi = -1;
		
		for (int i = 0; i < luckySet.length; i++) {
			if (luckySet[i] < n) {
				lo = luckySet[i];
			} else if (luckySet[i] == n) {
				return 0;
			} else if (luckySet[i] > n) {
				hi = luckySet[i];
				break;
			}
		}
		
		for (int i = n; i < hi; i++) {
			for (int j = lo + 1; j <= n; j++) {
				if (j < i) {
					ret++;
				}
			}
		}
		
		return ret;
	}
}
