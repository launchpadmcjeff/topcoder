package com.github.topcoder;



public class WordForm {

	public String getSequence(String word) {
		String ret = null;
		word = word.toUpperCase();
		char[] chs = new char[word.length()];
		int chsPtr = 0;
		boolean inV = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' || word.charAt(i) == 'Y') {
				if (i == 0 && word.charAt(i) == 'Y') {
					chs[chsPtr++] = 'C';
				} else if (inV == false) {
					inV = true;
					chs[chsPtr++] = 'V';
				} else if (inV && word.charAt(i) == 'Y') {
					inV = false;
					chs[chsPtr++] = 'C';
				}
			} else if (inV || i == 0) {
				inV = false;
				chs[chsPtr++] = 'C';
			}
		}
		ret = new String(chs, 0, chsPtr);
		return ret;
	}
}
