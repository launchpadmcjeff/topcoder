package com.github.topcoder;


public class ElectionFraudDiv2 {

	public String IsFraudulent(int[] percentages) {
		String ret = null;
		
		int total = 0;
		for (int i = 0; i < percentages.length; i++) {
			total += percentages[i];
		}
		if (total == 100) {
			return "NO";
		}
		if (total > 100) {
			int foo = (int) (percentages.length * 0.5);
			if (total > 100 + foo) {
				return "YES";
			} else {
				return "NO";
			}
		}
		if (total < 100) {
			int foo = (int) (percentages.length * 0.5);
			if (total <= 100 - foo) {
				return "YES";
			} else {
				return "NO";
			}
			
		}
		return ret;
	}
}
