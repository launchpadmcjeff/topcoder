package com.github.topcoder;

import java.util.HashMap;
import java.util.Map;


public class TypingDistance {

	public int minDistance(String keyboard, String word) {
		int ret = 0;
		Map<Character, Integer> k = new HashMap<>(26);
		char[] kb = keyboard.toCharArray();
		for (int i = 0; i < kb.length; i++) {
			k.put(kb[i], i);
		}
		char[] w = word.toCharArray();
		int start = k.get(w[0]);
		for (int i = 1; i < w.length; i++) {
			ret += Math.abs(k.get(w[i]) - start);
			start = k.get(w[i]);
		}
		return ret;
	}
}
