package io.foo;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13043">LeftAndRightHandedDiv2</a>
 */
public class LeftAndRightHandedDiv2 {

	public int count(String S) {
		int ret = 0;
		char[] chrs = S.toCharArray();
		for (int i = 0; i < chrs.length; i++) {
			if (chrs[i] == 'R' && i + 1 < chrs.length && chrs[i + 1] == 'L') {
				ret++;
			}
		}
		
		return ret;
	}
}
