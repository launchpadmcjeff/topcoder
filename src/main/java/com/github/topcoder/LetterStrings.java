package com.github.topcoder;


public class LetterStrings {

	public int sum(String[] s) {
		int ret = 0;

		for (String i : s) {
			for (char c : i.toCharArray()) {
				if (c == '-') {
					continue;
				} else {
					ret++;
				}
			}
		}
		return ret;
	}
}
