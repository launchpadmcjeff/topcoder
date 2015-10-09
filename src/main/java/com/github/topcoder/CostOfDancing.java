package com.github.topcoder;

import java.util.Arrays;


public class CostOfDancing {
	public int minimum(int K, int[] danceCost) {
		int ret = 0;
		Arrays.sort(danceCost);
		for (int i = 0; i < K; i++) {
			ret += danceCost[i];
		}
		return ret;
	}

}
