package com.github.topcoder;


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
