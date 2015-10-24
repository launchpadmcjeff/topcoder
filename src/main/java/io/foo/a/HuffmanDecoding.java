package io.foo.a;

import java.util.HashMap;
import java.util.Map;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=6477">HuffmanDecoding</a>
 */
public class HuffmanDecoding {
	
	public String decode(String archive, String[] dictionary) {
		StringBuilder ret = new StringBuilder();
		char a = 'A';
		Map<String, Character> dicm = new HashMap<>();
		
		for (int i = 0; i < dictionary.length; i++) {
			dicm.put(dictionary[i], a++);
		}
		
		for (int i = 0; i < archive.length(); ) {
			int j = 1;
			while (!dicm.containsKey(archive.substring(i, i + j))) {
				j++;
			}
			
			ret.append(dicm.get(archive.substring(i, i + j)));
			
			i += j;
		}
		
		return ret.toString();
	}
}