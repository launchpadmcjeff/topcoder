package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2997">grafixCorrupt</a>
 */
public class GrafixCorrupt {

	public int selectWord(String[] dictionary, String candidate) {
		int ret = -1;
		int top = 0;
		for (int i = 0; i < dictionary.length; i++) {
			int ltop = 0;
			for (int j = 0; j < candidate.length(); j++) {
				if (candidate.charAt(j) == dictionary[i].charAt(j)) {
					ltop++;
				}
			}
			if (ltop > top) {
				top = ltop;
				ret = i;
			}
		}
		
		return ret;
	}
}
