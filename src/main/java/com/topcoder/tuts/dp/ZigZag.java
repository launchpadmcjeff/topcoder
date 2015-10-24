package com.topcoder.tuts.dp;

import java.util.Arrays;

/**
 * 
 * @see <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1259">ZigZag</a>
 *
 */
public class ZigZag {

	public int longestZigZag(int[] sequence) {
//		int ret = 0;
//		
//		if (sequence.length == 1) {
//			return 1;
//		}
//
//		ret = Math.max(
//				longestZigZag(Arrays.copyOfRange(sequence, 0, sequence.length)),
//				longestZigZag(Arrays.copyOfRange(sequence, 1, sequence.length)));
//
//		return ret;
		return longestStretch(sequence);
	}
	
	int longestStretch(int[] seq) {
		if (seq.length == 1) {
			return 1;
		}
		int m2 = seq[0];
		int m1 = seq[1];
		int ret = m1 != m2 ? 2 : 1;
		for (int i = 2; i < seq.length; i++) {
			if (m2 < m1) {
				if (seq[i] < m1) {
					ret++;
				}
			} else if (m2 > m1) {
				if (seq[i] > m1) {
					ret++;
				}
			} else {
				int t = longestStretch(Arrays.copyOfRange(seq, i, seq.length));
				if (t > ret) {
					ret = t;
					break;
				}
			}
			m1 = seq[i];
			m2 = seq[i - 1];
		}
		
		return ret;
	}
}
