package io.foo;

import java.util.Arrays;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13195">CostOfDancing</a>
 */
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
