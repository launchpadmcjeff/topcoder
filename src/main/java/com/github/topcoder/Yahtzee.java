package com.github.topcoder;



public class Yahtzee {

	public int maxPoints(int[] toss) {
		int ret = 0;
		
		for (int i = 1; i <= 6; i++) {
			int t = 0;
			for (int j = 0; j < toss.length; j++) {
				if (toss[j] == i) {
					t += i;
				}
			}
			if (t > ret) {
				ret = t;
			}
		}
		
		
		return ret;
	}
}
