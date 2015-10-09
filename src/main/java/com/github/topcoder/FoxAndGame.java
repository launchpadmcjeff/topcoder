package com.github.topcoder;


public class FoxAndGame {
	public int countStars(String[] result) {
		int ret = 0;
		for (String i : result) {
			switch (i) {
			case "---":
				break;
			case "o--":
				ret += 1;
				break;
			case "oo-":
				ret += 2;
				break;
			case "ooo":
				ret += 3;
				break;
			}
		}
		return ret;
	}
}
