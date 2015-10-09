package com.github.topcoder;


public class RedAndGreen {
	public int minPaints(String row) {
		int ret = -1;
		char[] chrs = row.toCharArray();

		for (int i = 0; i <= chrs.length; i++) {
			int mp = 0;
			for (int j = 0; j < chrs.length; j++) {
				if (j < i && chrs[j] == 'G') {
					mp++;
				} else if (j >= i && chrs[j] == 'R') {
					mp++;
				}
			}
			if (ret == -1 || mp < ret) {
				ret = mp;
			}
		}
		
		
		
		return ret;
	}
}
