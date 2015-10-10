package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1694">Quipu</a>
 */
public class Quipu {

	public int readKnots(String knots) {
		int ret = 0;
		int[] nums = new int[10];
		int numPtr = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = -1;
		}
		
		boolean fndZro = false;
		for (int i = 0; i < knots.length(); i++) {
			if (knots.charAt(i) == 'X') {
				fndZro = false;
				int f = 0;
				while (knots.charAt(i) == 'X') {
					f++;
					i++;
				}
				nums[numPtr++] = f;
				i--;
			}
			if (knots.charAt(i) == '-') {
				if (fndZro) {
					nums[numPtr++] = 0;
				}
				fndZro = true;
			}
		}
		
		for (int i = 0; i < numPtr; i++) {
			ret = ret * 10 + nums[i];
		}
		return ret;
	}
}
