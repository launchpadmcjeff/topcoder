package io.foo.a;
/**
 * <a href="http://community.topcoder.com/stat?c=problem_statement&pm=3457">
 * BlackAndRed</a>
 */
public class BlackAndRed {

	public int cut(String deck) {
		int ret = 0;

		foo:
		for (int i = 0; i < deck.length(); i++) {
			int bc = 0;
			int rc = 0;
			int j = 0;
			for (;;) {
				if (deck.charAt(i + j) == 'R') {
					rc++;
				} else {
					bc++;
				}
				if (rc > bc) {
					break;
				}
				if (i + j == deck.length() - 1) {
					j = 0 - i;
				} else {
					j++;
				}
				if (j == 0) {
					ret = i;
					break foo;
				}
			}
		}

		return ret;
	}
}
