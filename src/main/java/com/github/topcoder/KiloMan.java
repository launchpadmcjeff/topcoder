package com.github.topcoder;


public class KiloMan {

	public int hitsTaken(int[] pattern, String jumps) {
		int ret = 0;
		for (int i = 0; i < pattern.length; i++) {
			if (jumps.charAt(i) == 'S') {
				if (pattern[i] <= 2) {
					ret++;
				}
			} else {
				if (pattern[i] > 2) {
					ret++;
				}
			}
		}
		return ret;
	}
}
