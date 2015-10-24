package io.bar;

public class Bt {

	private static final int MAXCANDIDATES = 40;
	private static final int NMAX = 0;
	boolean finished = false;
	
	public void backtrack(int[] a, int k, int input) {
		int[] c = new int[MAXCANDIDATES];
		int ncandidates = 0;
		
		if (isSolution(a, k, input)) {
			processSolution(a, k, input);
		} else {
			k++;
			constructCandidates(a, k, input, c, ncandidates);
			for (int i = 0; i < ncandidates; i++) {
				a[k] = c[i];
				makeMove(a, k, input);
				backtrack(a, k, input);
				unmakeMove(a, k, input);
				if (finished) {
					return;
				}
			}
		}
	}

	private void unmakeMove(int[] a, int k, int input) {
		
	}

	private void makeMove(int[] a, int k, int input) {
		
	}

	private void constructCandidates(int[] a, int k, int input, int[] c,
			int ncandidates) {
		c[0] = 1;
		c[1] = 0;
	}

	private void processSolution(int[] a, int k, int input) {
		System.out.print("{");
		for (int i = 1; i <= k; i++) {
			if (a[i] == 1) {
				System.out.print(" " + i);
			}
		}
		System.out.println(" }");
	}

	public void generateSubsets(int n) {
		int[] a = new int[NMAX];
		backtrack(a, 0, n);
	}

	private boolean isSolution(int[] a, int k, int input) {
		return k == input;
	}
	
	public volatile int x = 0;
	
	public int foo() {
		long time = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			x++;
		}
		System.out.println("time: " + (System.currentTimeMillis() - time));
		
		return x;
	}
}
