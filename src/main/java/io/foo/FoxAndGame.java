package io.foo;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=12438">FoxAndGame</a>
 */
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
