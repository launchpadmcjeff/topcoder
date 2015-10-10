package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13072">WritingWords</a>
 */
public class WritingWords {

	public int write(String word) {
		int ret = 0;
		for (char c : word.toCharArray()) {
			ret += c - 'A' + 1;
		}
		
		return ret;
	}
}
