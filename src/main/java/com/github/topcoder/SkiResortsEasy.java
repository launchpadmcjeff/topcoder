package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=12469">SkiResortsEasy</a>
 */
public class SkiResortsEasy {

	public int minCost(int[] altitude) {
		int ret = 0;
		for (int i = 0; i < altitude.length - 1; i++) {
			if (altitude[i + 1] > altitude[i]) {
				ret += altitude[i + 1] - altitude[i];
				altitude[i + 1] = altitude[i];
			}
		}
		return ret;
	}
}
