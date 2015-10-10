package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1728">ImageDithering</a>
 */
public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int ret = 0;
		char[] charArray = dithered.toCharArray();
		for (String str : screen) {
			for (char i : str.toCharArray()) {
				for (char j : charArray) {
					if (i == j) {
						ret++;
						break;
					}
				}
			}
		}
		
		return ret;
	}
}
