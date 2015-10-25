package com.programmingchallenges;


/**
 * 
 * @see <a href="http://www.spoj.com/problems/PROBTNPO/">The3NPlus1Problem.java</a>
 *
 */
public class The3NPlus1Problem {

	public String input(String s) {
		String[] parms = s.split("\\s+");
		Integer i = Integer.valueOf(parms[0]);
		Integer j = Integer.valueOf(parms[1]);

		int maxCnt = 0;
		for (int k = i; k <= j; k++) {
			int n = k;
			int cnt = 1;

			while (n != 1) {
				cnt++;
				if (n % 2 == 0) {
					n = n >>> 1;
				} else {
					n = n * 3 + 1;
				}
			}
			if (cnt > maxCnt) {
				maxCnt = cnt;
			}
		}

		return s + " " + Integer.toString(maxCnt);
	}
}
