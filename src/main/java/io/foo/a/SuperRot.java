package io.foo.a;

import java.util.HashMap;
import java.util.Map;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1625">SuperRot</a>
 */
public class SuperRot {
	public String decoder(String message) {
		StringBuilder ret = new StringBuilder();
		Map<Character, Character> mp = new HashMap<>();
		char A = 'A';
		for (int i = 0; i < 13; i++) {
			mp.put((char)(A + i), (char)(A + 13 + i));
		}
		char N = 'N';
		for (int i = 0; i < 13; i++) {
			mp.put((char)(N + i), (char)(N - 13 + i));
		}
		char a = 'a';
		for (int i = 0; i < 13; i++) {
			mp.put((char)(a + i), (char)(a + 13 + i));
		}
		char n = 'n';
		for (int i = 0; i < 13; i++) {
			mp.put((char)(n + i), (char)(n - 13 + i));
		}
		char x0 = '0';
		for (int i = 0; i < 5; i++) {
			mp.put((char)(x0 + i), (char)(x0 + 5 + i));
		}
		char x5 = '5';
		for (int i = 0; i < 5; i++) {
			mp.put((char)(x5 + i), (char)(x5 - 5 + i));
		}
		mp.put(' ', ' ');
		
		for (int i = 0; i < message.length(); i++) {
			ret.append(mp.get(message.charAt(i)));
		}
		return ret.toString();
	}
}