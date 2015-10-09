package com.github.topcoder;

public class DreamingAboutCarrots {
	public int carrotsBetweenCarrots(int x1, int y1, int x2, int y2) {
		int ret = 0;
		double m = (double)(y2 - y1) / (x2 - x1);
		double b = y1 - m * x1;
		double y = 0;
		if (x1 < x2) {
			for (int x = 1; x1 + x < x2; x++) {
				y = m * (x1 + x) + b;
				if (Math.ceil(y) == y) {
					ret++;
				}
			}
		} else {
			for (int x = -1; x1 + x > x2; x--) {
				y = m * (x1 - x) + b;
				if (Math.ceil(y) == y) {
					ret++;
				}
			}
		}
		return ret;
	}

}
