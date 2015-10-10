package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13125">WakingUpEasy</a>
 */
public class WakingUpEasy {

	public int countAlarms(int[] volume, int S) {
		int cnt = 0;
		int i = 0;
		while (S > 0) {
			cnt++;
			if (i >= volume.length) {
				i = 0;
			}
			S = S - volume[i++];
			
		}
		return cnt;
	}
}
