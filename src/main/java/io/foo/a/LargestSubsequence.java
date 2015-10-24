package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=11471">LargestSubsequence</a>
 */
public class LargestSubsequence {

	public String getLargest(String s) {
		StringBuilder sb = new StringBuilder();
		
		int start = 0;
		for (char i = 'z'; i >= 'a'; i--) {
			for (int j = start; j < s.length(); j++) {
				if (s.charAt(j) == i) {
					sb.append(i);
					start = j + 1;
				}
			}
		}
		
		
		
		return sb.toString();
	}
}
