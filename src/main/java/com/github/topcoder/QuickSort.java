package com.github.topcoder;

import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;

public class QuickSort {
	private final Logger logger = Logger.getLogger(QuickSort.class);

	Random rand = new Random();

	public void sort(int[] arg) {
		sort(arg, 0, arg.length);
	}

	private void sort(int[] a, int i, int n) {
		logger.trace(String.format("%s:%d:%s", Arrays.toString(a), i, n));
		if (n <= 1) {
			return;
		}
		int x = a[i + rand.nextInt(n)];
		logger.trace("pivot value: " + x);
		int p = i - 1;
		int j = i;
		int q = i + n;

		while (j < q) {
			int comp = a[j] - x;
			if (comp < 0) {
				swap(a, j++, ++p);
			} else if (comp > 0) {
				swap(a, j, --q);
			} else {
				j++;
			}
		}
		sort(a, i, p-i+1);
		sort(a, q, n-q+i);
	}

	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
