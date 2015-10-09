package com.github.topcoder;


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
