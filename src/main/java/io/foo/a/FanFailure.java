package io.foo.a;

import java.util.Arrays;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2235">FanFailure</a>
 */
public class FanFailure {

	public int[] getRange(int[] capacities, int minCooling) {
		int[] ret = new int[2];
		
		int tot = 0;
		Arrays.sort(capacities);
		
		for (int i = 0; i < capacities.length; i++) {
			tot += capacities[i];
		}
		int cpx = tot - minCooling;
		
		
		return ret;
	}
}
