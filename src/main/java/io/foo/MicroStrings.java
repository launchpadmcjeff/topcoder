package io.foo;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=13048">MicroStrings</a>
 */
public class MicroStrings {

	public String makeMicroString(int A, int D) {
		StringBuilder sb = new StringBuilder();
		while (A >= 0) {
			sb.append(A);
			A = A - D;
		}
		return sb.toString();
	}
}
