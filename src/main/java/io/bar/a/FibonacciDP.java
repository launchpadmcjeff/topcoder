package io.bar.a;

public class FibonacciDP {

	public long calcFibNaiveRecursive(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return calcFibNaiveRecursive(n - 1) + calcFibNaiveRecursive(n - 2);
	}

	public long calcFibRecursiveWithMemo(int n, long[] memo) {
		if (memo[n] != -1) {
			return memo[n];
		}
		long fib = 0;
		if (n == 0) {
			fib = 0;
		} else if (n == 1) {
			fib = 1;
		} else {
			fib = calcFibRecursiveWithMemo(n - 1, memo) + calcFibRecursiveWithMemo(n - 2, memo);
		}
		memo[n] = fib;
		return memo[n];
	}
	
	public long calcFibTopologicalOrder(int n) {
		long m2 = 0;
		long m1 = 1;
		long ret = 0;
		for (int i = 2; i <= n; i++) {
			ret = m1 + m2;
			m2 = m1;
			m1 = ret;
		}
		return ret;
	}
}
