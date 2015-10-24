package io.foo.a;

import java.util.Arrays;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=12437">FoxAndMp3Easy</a>
 */
public class FoxAndMp3Easy {

	public String[] playList(int n) {
		String[] t = new String[n];
		
		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(Integer.toString(i) + ".mp3");
			t[i -1] = sb.toString();
		}
		
		Arrays.sort(t);
		return Arrays.copyOfRange(t, 0, n <= 50 ? n : 50);
	}
}
