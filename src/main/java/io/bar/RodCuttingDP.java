package io.bar;

public class RodCuttingDP {

	public int cutRod(int[] prices, int length) {
		if (length == 0) {
			return 0;
		}
		int max = 0;
		for (int i = 1; i <= length; i++) {
			int t = prices[i - 1] + cutRod(prices, length - i);
			if (t > max) {
				max = t;
			}
		}
		
		return max;
	}
	
	public int cutRodDP(int[] prices, int length) {
		int[] maxRev = new int[prices.length];
		if (length == 0) {
			return 0;
		}
		int max = 0;
		for (int i = 1; i <= length; i++) {
			int t = prices[i - 1] + cutRod(prices, length - i);
			if (t > max) {
				max = t;
			}
		}
		
		return max;
	}
}
