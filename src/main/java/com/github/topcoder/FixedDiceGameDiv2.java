package com.github.topcoder;


public class FixedDiceGameDiv2 {

	public double getExpectation(int a, int b) {
		double ret = 0.0;
		double sum = 0;
		double wins = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i > j) {
					sum += i;
					wins++;
				}
			}
		}
		ret = sum / wins;
		return ret;
	}
}
