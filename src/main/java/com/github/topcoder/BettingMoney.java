package com.github.topcoder;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2297">BettingMoney</a>
 */
public class BettingMoney {

	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult) {
		int ret = 0;
		for (int i = 0; i < amounts.length; i++) {
			if (i == finalResult) {
				for (int j = amounts[i]; j > 0; j--) {
					ret -= centsPerDollar[i];
				}
			} else {
				ret += amounts[i] * 100;
			}
		}
		return ret;
	}
}
