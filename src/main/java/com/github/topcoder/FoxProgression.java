package com.github.topcoder;


public class FoxProgression {

	public int theCount(int[] seq) {
		int ret = 2;
		Integer next = null;
		if (seq.length == 1) {
			return -1;
		}
		int diff = seq[1] - seq[0];
		for (int i = 0; i < seq.length - 1; i++) {
			if (seq[i + 1] - seq[i] != diff) {
				ret--;
				break;
			}
			if (i == seq.length - 2) {
				next = seq[i + 1] + diff;
			}
		}
		int geom = seq[1] / seq[0];
		for (int i = 0; i < seq.length - 1; i++) {
			if (seq[i] * geom != seq[i + 1]) {
				ret--;
				break;
			}
			if (i == seq.length - 2) {
				if (next != null && next == seq[i + 1] * geom) {
					ret--;
				}
			}
		}

		return ret;
	}
}
