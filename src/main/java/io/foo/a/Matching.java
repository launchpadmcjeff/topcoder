package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2249">Matching</a>
 */
public class Matching {

	public String[] findMatch(String[] first, String[] second) {
		String[] ret = new String[4];
		String[] a0 = { "CIRCLE", "SQUIGGLE", "DIAMOND" };
		String[] a1 = { "RED", "BLUE", "GREEN" };
		String[] a2 = { "SOLID", "STRIPED", "EMPTY" };
		String[] a3 = { "ONE", "TWO", "THREE" };
		String[] p = null;
		for (int i = 0; i < first.length; i++) {
			if (first[i].equals(second[i])) {
				ret[i] = first[i];
			} else {
				switch (i) {
				case 0:
					p = a0;
					break;
				case 1:
					p = a1;
					break;
				case 2:
					p = a2;
					break;
				case 3:
					p = a3;
					break;
				}
				for (int j = 0; j < p.length; j++) {
					if (!p[j].equals(first[i]) && !p[j].equals(second[i])) {
						ret[i] = p[j];
						break;
					}
				}
			}
		}

		return ret;
	}
}
