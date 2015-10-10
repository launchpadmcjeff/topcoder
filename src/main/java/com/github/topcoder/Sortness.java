package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=7263">Sortness</a>
 */
public class Sortness {
	public double getSortness(int[] a) {
		double ret = 0.0;
		int cnt = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i > j) {
					if (a[i] < a[j]) {
						cnt++;
					}
				} else if (i < j) {
					if (a[i] > a[j]) {
						cnt++;
					}
				} else {
					continue;
				}
			}
		}
		ret = (double)cnt / (double)a.length;
		return ret;
	}

}
