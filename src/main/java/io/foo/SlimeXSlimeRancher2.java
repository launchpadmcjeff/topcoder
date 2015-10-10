package io.foo;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=11279">SlimeXSlimeRancher2</a>
 */
public class SlimeXSlimeRancher2 {

	public int train(int[] attributes) {
		int ret = 0;
		int max = 0;
		for (int i = 0; i < attributes.length; i++) {
			if (attributes[i] > max) {
				max = attributes[i];
			}
		}
		for (int i = 0; i < attributes.length; i++) {
			ret += max - attributes[i];
		}
		
		return ret;
	}
}
