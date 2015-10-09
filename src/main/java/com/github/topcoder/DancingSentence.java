package com.github.topcoder;


public class DancingSentence {
	
	public String makeDancing(String sentence) {
		StringBuilder sb = new StringBuilder(sentence.length());
		
		boolean lc = false;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				sb.append(sentence.charAt(i));
				continue;
			}
			if (!lc) {
				lc = true;
				sb.append(Character.toUpperCase(sentence.charAt(i)));
			} else {
				lc = false;
				sb.append(Character.toLowerCase(sentence.charAt(i)));
			}
		}
		
		return sb.toString();
	}
}