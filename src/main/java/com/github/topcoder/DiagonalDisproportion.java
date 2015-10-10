package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=6003">DiagonalDisproportion</a>
 */
public class DiagonalDisproportion {

	public int getDisproportion(String[] matrix) {
		int maind = 0;
		int colld = 0;
		int diag = 0;
		for (int i = 0; i < matrix.length; i++) {
			String foo = matrix[i];
			char[] bar = foo.toCharArray();
			for (int j = 0; j < bar.length; j++) {
				if (j == diag) {
					maind += bar[j] - '0';
					diag++;
					break;
				}
			}
		}
		diag = matrix.length - 1;
		for (int i = 0; i < matrix.length; i++) {
			String foo = matrix[i];
			char[] bar = foo.toCharArray();
			for (int j = 0; j < bar.length; j++) {
				if (j == diag) {
					colld += bar[j] - '0';
					diag--;
					break;
				}
			}
		}
		
		return maind - colld;
	}
}
