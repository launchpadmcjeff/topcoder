package com.programmingchallenges;

public class Minesweeper {

	public String input(String s) {
		String[] lines = s.split("\n");
		StringBuilder sb = new StringBuilder("Field #1:\n");
		
		for (int i = 1; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length(); j++) {
				int mc = 0;
				if (lines[i].charAt(j) == '*') {
//				 j, i; 
					sb.append('*');
					continue;
				}
				if (j - 1 >= 0) {
//					j - 1, i;
					mc += lines[i].charAt(j - 1) == '*' ? 1 : 0;
					if (i + 1 < lines.length) {
//					j - 1, i + 1;
						mc += lines[i + 1].charAt(j - 1) == '*' ? 1 : 0;
					}
					if (i - 1 >= 1) {
						mc += lines[i - 1].charAt(j - 1) == '*' ? 1 : 0;
//						j - 1, i - 1;
					}
				}
				if (j + 1 < lines[i].length()) {
//					j + 1, i
					mc += lines[i].charAt(j + 1) == '*' ? 1 : 0;
					if (i - 1 > 0) {
//					j + 1, i - 1;
						mc += lines[i - 1].charAt(j + 1) == '*' ? 1 : 0;
					}
					if (i + 1 < lines.length) {
//					j + 1, i + 1;
						mc += lines[i + 1].charAt(j + 1) == '*' ? 1 : 0;
					}
				}
				if (i - 1 > 0) {
					mc += lines[i - 1].charAt(j) == '*' ? 1 : 0;
//				 j, i - 1; 
					
				}
				if (i + 1 < lines.length) {
//				 j, i + 1; 
					mc += lines[i + 1].charAt(j) == '*' ? 1 : 0;
				}
				sb.append(mc);
			}
			if (i < lines.length - 1) {
				sb.append('\n');
			}
		}
		
		
		return sb.toString();
	}
}
