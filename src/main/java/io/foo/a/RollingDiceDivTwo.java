package io.foo.a;

import java.util.Arrays;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=11801">RollingDiceDivTwo</a>
 */
public class RollingDiceDivTwo {
	
	public int minimumFaces(String[] rolls) {
		int ret = 0;
		char[] dice = new char[rolls[0].length()];
		
		for (int i = 0; i < rolls.length; i++) {
			char[] t = rolls[i].toCharArray();
			Arrays.sort(t);
			for (int j = 0; j < t.length; j++) {
				if (t[j] > dice[j]) {
					dice[j] = t[j];
				}
			}
		}
		
		for (int i = 0; i < dice.length; i++) {
			ret += dice[i] - '0';
		}
		
		return ret;
	}
}