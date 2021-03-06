package io.foo;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2868">NoOrderOfOperations</a>
 */
public class NoOrderOfOperations {

	public int evaluate(String expr) {
		int a = expr.charAt(0) - '0';
		int b = 0;
		char opr = 0;
		
		int i = 1;
		while (i < expr.length()) {

			opr = expr.charAt(i++);
			b = expr.charAt(i++) - '0';

			switch (opr) {
			case '+':
				a = a + b;
				break;
			case '-':
				a = a - b;
				break;
			case '*':
				a = a * b;
				break;
			}
		}

		return a;
	}
}
