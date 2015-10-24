package io.foo.a;

import java.util.Arrays;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2884">Mailbox</a>
 */
public class Mailbox {

	public int impossible(String collection, String[] address) {
		int ret = 0;

		for (int i = 0; i < address.length; i++) {
			char[] c = collection.toCharArray();
			char[] a = address[i].toCharArray();
			for (int j = 0; j < a.length; j++) {
				if (Character.isWhitespace(a[j])) {
					continue;
				}
				int bs = getAndMark(c, a[j]);
				if (bs < 0) {
					ret++;
					break;
				}
			}
		}
		return ret;
	}

	private int getAndMark(char[] c, char d) {
		int ret = -1;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == d) {
				ret = i;
				c[i] = (char) -1;
				break;
			}
		}

		return ret;
	}
}
