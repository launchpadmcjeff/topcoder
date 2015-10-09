package com.github.topcoder;

import java.util.LinkedList;
import java.util.List;


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
