package com.github.topcoder;


public class SumOfPower {

	public int findSum(int[] array) {
		int ret = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int t = i;
				while (t <= j) {
					ret += array[t++];
				}
			}
		}
		
		return ret;
	}
}
