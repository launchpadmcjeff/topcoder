package com.github.topcoder;

import java.util.Arrays;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1968">SkipRope</a>
 */
public class SkipRope {

	public int[] partners(int[] candidates, int height) {
		int fst = 0;
		int lst = 0;
		Arrays.sort(candidates);

		for (int i = 0; i < candidates.length; i++) {
			if (Math.abs(candidates[i] - height) <= Math.abs(fst - height)) {
				lst = fst;
				fst = candidates[i];
				continue;
			} else if (Math.abs(candidates[i] - height) <= Math.abs(lst
					- height)) {
				lst = candidates[i];
				continue;
			}
		}

		if (fst < lst) {
			return new int[] { fst, lst };
		} else {
			return new int[] { lst, fst };
		}
	}
}
