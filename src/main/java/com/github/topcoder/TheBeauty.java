package com.github.topcoder;


public class TheBeauty {

	public int find(int n) {
		int ret = 0;
		boolean[] ints = new boolean[10];

		while (n > 0) {
			ints[n % 10] = true;
			n = n / 10;
		}
		for (boolean i : ints) {
			if (i) {
				ret++;
			}
		}
		return ret;
	}
}
