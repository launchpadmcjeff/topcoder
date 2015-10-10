package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=10299">TheSquareDivTwo</a>
 */
public class TheSquareDivTwo {

	public String[] solve(String[] board) {
		String[] ret = new String[board.length];
		int[] rowSums = new int[board.length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length(); j++) {
				if (board[i].charAt(j) == 'C') {
					rowSums[i]++;
				}
			}
		}
		for (int i = board.length - 1; i >= 0; i--) {
			char[] retRow = new char[board.length];
			for (int j = board.length - 1; j >= 0; j--) {
				if (rowSums[j] > 0) {
					retRow[j] = 'C';
					rowSums[j]--;
				} else {
					retRow[j] = '.';
				}
			}
			ret[i] = new String(retRow);
		}
		return ret;
	}
}
