package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1650">Soccer</a>
 */
public class Soccer {

	public int maxPoints(int[] wins, int[] ties) {
		int ret = 0;
		int[] tots = new int[wins.length];
		for (int i = 0; i < wins.length; i++) {
			tots[i] = wins[i] * 3 + ties[i];
		}
		for (int i : tots) {
			if (ret < i) {
				ret = i;
			}
		}
		return ret;
	}
}
