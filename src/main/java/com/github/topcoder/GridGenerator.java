package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=4688">GridGenerator</a>
 */
public class GridGenerator {

	public int generate(int[] row, int[] col) {
		int[][] grid = new int[col.length][row.length];

		grid[0] = row;
		for (int i = 1; i < col.length; i++) {
			grid[i][0] = col[i];
		}
		for (int i = 1; i < row.length; i++) {
			for (int j = 1; j < col.length; j++) {
				grid[i][j] = grid[i][j - 1] + grid[i - 1][j - 1]
						+ grid[i - 1][j];
			}
		}
		return grid[col.length - 1][row.length - 1];
	}
}
