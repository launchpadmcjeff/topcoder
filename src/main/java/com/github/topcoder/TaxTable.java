package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=4511">TaxTable</a>
 */
public class TaxTable {
	public int income(int taxAmount) {
		if (taxAmount < 100000 * 0.25 - 6525) {
			return -1;
		} else if (taxAmount < 117250 * 0.25 - 6525) {
			return (int) ((taxAmount + 6525) / 0.25);
		} else if (taxAmount < 178650 * 0.25 - 10042.50) {
			return (int) ((taxAmount + 10042.50) / 0.28);
		} else if (taxAmount < 319100 * 0.33 - 18975) {
			return (int) ((taxAmount + 18975) / 0.33);
		} else {
			return (int) ((taxAmount + 25357) / 0.35);
		}
	}
}
