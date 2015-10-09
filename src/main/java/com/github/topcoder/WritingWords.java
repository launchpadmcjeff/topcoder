package com.github.topcoder;


public class WritingWords {

	public int write(String word) {
		int ret = 0;
		for (char c : word.toCharArray()) {
			ret += c - 'A' + 1;
		}
		
		return ret;
	}
}
