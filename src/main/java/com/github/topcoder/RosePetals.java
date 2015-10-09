package com.github.topcoder;


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
