package com.github.topcoder;


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
