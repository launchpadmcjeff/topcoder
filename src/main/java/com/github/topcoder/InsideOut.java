package com.github.topcoder;


public class InsideOut {

	public String unscramble(String line) {
		String ret = null;
		char[] a = new char[line.length()];
		int j = 0;
		for (int i = line.length() / 2 - 1; i >= 0; i--) {
			a[j++] = line.charAt(i);
		}
		for (int i = line.length() - 1; i >= line.length() / 2; i--) {
			a[j++] = line.charAt(i);
		}
		
		ret = new String(a);
		return ret;
	}
}
