package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=8204">WhiteCells</a>
 */
public class WhiteCells {
	public int countOccupied(String[] board) {
		int ret = 0;
		
		for (int i = 0; i < board.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < board[i].length(); j += 2) {
					if (board[i].charAt(j) == 'F') {
						ret++;
					}
				}
			} else {
				for (int j = 1; j < board[i].length(); j += 2) {
					if (board[i].charAt(j) == 'F') {
						ret++;
					}
				}
				
			}
		}
		
		
		return ret;
	}

}
