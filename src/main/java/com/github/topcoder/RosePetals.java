package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=6635">RosePetals</a>
 */
public class RosePetals {
	public int getScore(int[] dice) {
		int ret = 0;
		int[] p = {0, 0, 0, 2, 0, 4, 0};
		for (int i : dice) {
			ret += p[i];
		}
		
		return ret;
	}

}
