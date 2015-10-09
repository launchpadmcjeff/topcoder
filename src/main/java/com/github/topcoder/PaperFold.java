package com.github.topcoder;


public class PaperFold {

	public int numFolds(int[] paper, int[] box) {
		int ret = -1;
		
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				if (i + j > 8) {
					continue;
				}
				if (paper[0] / Math.pow(2.0, i) <= box[0]
						&& paper[1] / Math.pow(2.0, j) <= box[1]) {
					if (ret == -1 || i + j < ret) {
						ret = i + j;
					}
				} else if (paper[0] / Math.pow(2.0, i) <= box[1]
						&& paper[1] / Math.pow(2.0, j) <= box[0]) {
					if (ret == -1 || i + j < ret) {
						ret = i + j;
					}
				}
			}
		}
		
		
		return ret;
	}
}
