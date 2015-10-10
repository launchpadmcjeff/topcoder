package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=961">LetterStrings</a>
 */
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
