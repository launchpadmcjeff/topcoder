package io.foo.a;

import java.util.HashMap;
import java.util.Map;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=4483">WordCompositionGame</a>
 */
public class WordCompositionGame {
	public String score(String[] listA, String[] listB, String[] listC) {
		String ret = null;
		Map<String, Integer> words = new HashMap<>();
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < listA.length; i++) {
			if (words.containsKey(listA[i])) {
				int x = words.get(listA[i]);
				x--;
				words.put(listA[i], x);
			} else {
				words.put(listA[i], 3);
			}
		}
		
		for (int i = 0; i < listB.length; i++) {
			if (words.containsKey(listB[i])) {
				int x = words.get(listB[i]);
				x--;
				words.put(listB[i], x);
			} else {
				words.put(listB[i], 3);
			}
		}
		
		for (int i = 0; i < listC.length; i++) {
			if (words.containsKey(listC[i])) {
				int x = words.get(listC[i]);
				x--;
				words.put(listC[i], x);
			} else {
				words.put(listC[i], 3);
			}
		}
		
		for (int i = 0; i < listA.length; i++) {
			a += words.get(listA[i]);
		}
		for (int i = 0; i < listB.length; i++) {
			b += words.get(listB[i]);
		}
		for (int i = 0; i < listC.length; i++) {
			c += words.get(listC[i]);
		}
		
		return String.format("%d/%d/%d", a, b, c);
	}
}