package com.github.topcoder;


public class CheckFunction {

	public int newFunction(String code) {
		int ret = 0;
		int[] vals = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		char[] v = code.toCharArray();
		
		for (char i : v) {
			ret += vals[i - '0'];
		}
		return ret;
	}
}
