package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=6630">DigitsSum</a>
 */
public class DigitsSum {

	public int lastDigit(int n) {
		String t = Integer.toString(n);
		int y = 0;
		do {
			y = 0;
			for (int i = 0; i < t.length(); i++) {
				y += t.charAt(i) - 0x30;
			}
			t = Integer.toString(y);

		} while (t.length() > 1);

		return y;
	}
}
