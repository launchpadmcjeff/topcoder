package io.foo.util;

public class BigFibber {

	public int tinyFib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return tinyFib(n - 1) + tinyFib(n - 2);
	}
	
	public int bigFib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int ret = 0;
		int x = 0;
		int y = 1;
		for (int i = 2; i <= n; i++) {
			ret = x + y;
			x = y;
			y = ret;
		}
		return ret;
	}
	
	public int bigFib2(int n) {
		int n2 = 0;
		int n1 = 1;
		for (int i = 0; i < n - 2; i++) {
			n2 = n1;
			n1 = n1 + n2;
		}
		return n2 + n1;
				
	}
}
