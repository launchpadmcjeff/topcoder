package com.github.topcoder;


public class Twain {

	public String getNewSpelling(int year, String phrase) {
		StringBuilder ret = new StringBuilder();
		if (year == 0) {
			return phrase;
		}
		
		if (year >= 1) {
			boolean wordStart = true;
			for (int i = 0; i < phrase.length(); i++) {
				char c = phrase.charAt(i);
				if (wordStart && c == 'x') {
					ret.append("z");
				} else if (c == 'x') {
					ret.append("ks");
				} else {
					ret.append(c);
				}
				if (c == ' ') {
					wordStart = true;
				} else {
					wordStart = false;
				}
			}
			System.out.println(ret.toString());
		}
		if (year >= 2) {
			phrase = ret.toString();
			ret.delete(0, ret.length());
			for (int i = 0; i < phrase.length(); i++) {
				char c = phrase.charAt(i);
				if (c == 'y') {
					ret.append('i');
				} else {
					ret.append(c);
				}
			}
			System.out.println(ret.toString());
		}
		if (year >= 3) {
			phrase = ret.toString();
			ret.delete(0, ret.length());
			for (int i = 0; i < phrase.length() - 1; i++) {
				char c = phrase.charAt(i);
				char d = phrase.charAt(i + 1);
				if (c == 'c' && (d == 'e' || d == 'i')) {
					ret.append('s');
				} else {
					ret.append(c);
				}
			}
			if (phrase.length() - 1 > 0) {
				ret.append(phrase.charAt(phrase.length() - 1));
			}
			System.out.println(ret.toString());
		}
		if (year >= 4) {
			phrase = ret.toString();
			ret.delete(0, ret.length());
			for (int i = 0; i < phrase.length() - 1; i++) {
				char c = phrase.charAt(i);
				if (c == 'c') {
					char d = phrase.charAt(i + 1);
					if (d == 'k') {
						continue;
					} else {
						ret.append(c);
					}
				} else {
					ret.append(c);
				}
			}
			if (phrase.length() - 1 > 0) {
				ret.append(phrase.charAt(phrase.length() - 1));
			}
			System.out.println(ret.toString());
		}
		if (year >= 5) {
			phrase = ret.toString();
			ret.delete(0, ret.length());
			boolean wordStart = true;
			for (int i = 0; i < phrase.length(); i++) {
				char c = phrase.charAt(i);
				if (wordStart && c == 's' && i < phrase.length() - 2
						&& phrase.charAt(i + 1) == 'c'
						&& phrase.charAt(i + 2) == 'h') {
					ret.append("sk");
					i += 2;
				} else if (c == 'c' && i < phrase.length() - 2
						&& phrase.charAt(i + 1) == 'h'
						&& phrase.charAt(i + 2) == 'r') {
					ret.append("k");
					i++;
				} else {
					ret.append(c);
				}
				if (c == ' ') {
					wordStart = true;
				} else {
					wordStart = false;
				}
			}
			phrase = ret.toString();
			ret.delete(0, ret.length());
			for (int i = 0; i < phrase.length(); i++) {
				char c = phrase.charAt(i);
				if (c == 'c' && i < phrase.length() - 1 && phrase.charAt(i + 1) != 'h') {
					ret.append('k');
				} else if (c == 'c' && i == phrase.length() - 1) {
					ret.append('k');
				} else {
					ret.append(c);
				}
			}
			System.out.println(ret.toString());
		}
		if (year >= 6) {
			phrase = ret.toString();
			ret.delete(0, ret.length());
			boolean wordStart = true;
			for (int i = 0; i < phrase.length(); i++) {
				char c = phrase.charAt(i);
				if (wordStart && c == 'k' && i < phrase.length() - 1 && phrase.charAt(i + 1) == 'n') {
					ret.append('n');
					i++;
				} else {
					ret.append(c);
				}
				if (c == ' ') {
					wordStart = true;
				} else {
					wordStart = false;
				}
			}
			System.out.println(ret.toString());
		}
		if (year >= 7) {
			boolean done = false;
			while (!done) {
				phrase = ret.toString();
				ret.delete(0, ret.length());
				done = true;
				for (int i = 0; i < phrase.length(); i++) {
					switch (phrase.charAt(i)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
					case ' ':
						ret.append(phrase.charAt(i));
						continue;
					default:
					}
					if (i < phrase.length() - 1
							&& phrase.charAt(i) == phrase.charAt(i + 1)) {
						ret.append(phrase.charAt(i));
						i++;
						done = false;
					} else {
						ret.append(phrase.charAt(i));
					}
				}
			}
			System.out.println(ret.toString());
		}
		
		return ret.toString();
	}
}
