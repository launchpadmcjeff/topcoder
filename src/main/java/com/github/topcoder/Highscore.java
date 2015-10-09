package com.github.topcoder;

import java.util.Arrays;

public class Highscore {

	public int getRank(int[] scores, int newscore, int places) {
		int ret = -1;
		int[] ranks = new int[places];
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = -1;
		}
		System.arraycopy(scores, 0, ranks, 0, scores.length);

		for (int i = 0; i < ranks.length; i++) {
			if (newscore >= ranks[i] && ret == -1) {
				ret = i;
			}
			if (i == ranks.length - 1 && newscore == ranks[i]) {
				ret = -1;
			}
		}
		return ret == -1 ? ret : ret + 1;
	}
	
	public int getRank1(int[] scores, int newscore, int places) {
		int pos = -1;
		if (places > scores.length) {
			for (int i = 0; i < scores.length; i++) {
				if (newscore >= scores[i]) {
					pos = i;
					break;
				}
			}
			if (pos == -1) {
				return scores.length + 1;
			} else {
				return pos + 1;
			}
		} else {
			for (int i = 0; i < scores.length; i++) {
				if (newscore > scores[i]) {
					pos = i + 1;
					break;
				}
			}
			for (int i = pos + 1; i < scores.length; i++) {
				if (scores[i] == newscore) {
					int j = i + 1;
					while (j < scores.length && scores[j] == newscore) {
						j++;
					}
					if (j < scores.length && pos > i + 1) {
						pos = i + 1;
					}
					break;
				}
			}
			return pos;
		}
	}
	
	public int getRank0(int[] scores, int newscore, int places) {
		int pos = -1;
		int i = 0;
		while (i < scores.length && newscore < scores[i]) {
			if (newscore >= scores[i]) {
				pos = i;
				while (i < scores.length && scores[i] == newscore) {
					// advance pointer
					i++;
				}
				if (i == scores.length) {
					break;
				}
			}
			i++;
		}
		if (i == scores.length && pos == -1 && places > scores.length + 1) {
			pos = scores.length;
		}
		return pos == -1 ? -1 : pos + 1;
	}
}
