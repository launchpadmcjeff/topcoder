package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13000">OneDimensionalRobotEasy</a>
 */
public class OneDimensionalRobotEasy {

	public int finalPosition(String commands, int A, int B) {
		int ret = 0;
		for (char i : commands.toCharArray()) {
			if (i == 'L' && ret > -A) {
				ret--;
			} else if (i == 'R' && ret < B) {
				ret++;
			}
		}
		return ret;
	}
}
