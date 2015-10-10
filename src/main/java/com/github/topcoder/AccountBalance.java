package com.github.topcoder;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=6036">AccountBalance</a>
 */
public class AccountBalance {

	public int processTransactions(int startingBalance, String[] transactions) {
		int ret = startingBalance;
		for (String i : transactions) {
			if ("C".equals(i.substring(0, 1))) {
				ret += Integer.parseInt(i.substring(2));
			} else {
				ret -= Integer.parseInt(i.substring(2));
			}
		}
		
		return ret;
	}
}
