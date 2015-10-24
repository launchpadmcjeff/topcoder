package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=6767">PalindromeDecoding</a>
 */
public class PalindromeDecoding {
	public String decode(String code, int[] position, int[] length) {
		StringBuilder ret = new StringBuilder(code);
		
		for (int i = 0; i < position.length; i++) {
			StringBuilder sb = new StringBuilder(ret.substring(position[i], position[i] + length[i]));
			sb.reverse();
			ret.insert(position[i] + length[i], sb.toString());
		}
		
		return ret.toString();
	}
}