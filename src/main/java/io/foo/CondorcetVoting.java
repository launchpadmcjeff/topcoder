package io.foo;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=8240">CondorcetVoting</a>
 */
public class CondorcetVoting {

	public int winner(String[] votes) {
		int ret = 0;
		int[] cnts = new int[votes[0].length()];

		for (int i = 0; i < votes.length; i++) {
			char[] v = votes[i].toCharArray();
			for (int j = 0; j < v.length; j++) {
				cnts[j] += 0x7B - v[j];
			}
		}
		boolean tie = false;
		int win = -1;
		for (int i = 0; i < cnts.length; i++) {
			if (cnts[i] > win) {
				win = cnts[i];
			}
		}
		for (int i = 0; i < cnts.length; i++) {
			if (cnts[i] == win) {
				if (tie) {
					ret = -1;
					break;
				}
				tie = true;
				ret = i;
			}
		}
		return ret;
	}
}
