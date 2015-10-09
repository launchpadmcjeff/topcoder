package com.github.topcoder;


public class CCipher {

	public String decode(String cipherText, int shift) {
		char[] f = new char[cipherText.length()];
		
		for (int i = 0; i < cipherText.length(); i++) {
			char c = (char) (cipherText.charAt(i) - shift);
			if (c < 'A') {
				f[i] = (char) ('Z' - ('A' - c) + 1);
			} else {
				f[i] = (char) (cipherText.charAt(i) - shift);
			}
		}
		
		return new String(f);
	}
}
