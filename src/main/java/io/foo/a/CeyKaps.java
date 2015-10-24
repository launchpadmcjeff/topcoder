package io.foo.a;

import java.util.HashMap;
import java.util.Map;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1740">CeyKaps</a>
 */
public class CeyKaps {

	class Kb {
		char[] keys = new char[26];

		Kb() {
			for (int i = 0; i < 26; i++) {
				keys[i] = (char) ('A' + i);
			}
		}

		char get(char key) {
			return keys[key - 'A'];
		}
		
		void swap(char a, char b) {
			boolean t = false;
			boolean u = false;
			for (int i = 0; i < keys.length; i++) {
				if (keys[i] == a) {
					keys[i] = b;
					t = true;
				} else if (keys[i] == b) {
					keys[i] = a;
					u = true;
				}
				if (t && u) {
					break;
				}
			}
		}
	}

	public String decipher(String typed, String[] switches) {
		StringBuilder ret = new StringBuilder();

		Kb kb = new Kb();
		
		for (int i = 0; i < switches.length; i++) {
			char t = switches[i].charAt(0);
			char u = switches[i].charAt(2);
			kb.swap(t, u);
		}
		
		for (int i = 0; i < typed.length(); i++) {
			ret.append(kb.get(typed.charAt(i)));
		}

		return ret.toString();
	}
}
