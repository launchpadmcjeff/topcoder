package com.github.topcoder;


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
