package com.github.topcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import org.apache.log4j.Logger;

public class BigSorter implements Sorter {
	private final Logger logger = Logger.getLogger(BigSorter.class);
	private Random rand = new Random();

	public <T> void mergeSort(T[] in, Comparator<T> c) {
		logger.trace(String.format("%s", Arrays.toString(in)));
		if (in.length <= 1) {
			return;
		}
		T[] a = Arrays.copyOfRange(in, 0, in.length / 2);
		T[] b = Arrays.copyOfRange(in, in.length / 2, in.length);
		mergeSort(a, c);
		mergeSort(b, c);
		// merge(in, a, b, c);
		int j = 0;
		int k = 0;
		for (int i = 0; i < in.length; i++) {
			if (j == a.length) {
				in[i] = b[k++];
			} else if (k == b.length) {
				in[i] = a[j++];
			} else if (c.compare(a[j], b[k]) < 0) {
				in[i] = a[j++];
			} else {
				in[i] = b[k++];
			}
		}
	}

	private <T> void merge(T[] in, T[] a, T[] b, Comparator<T> c) {
		logger.trace(String.format("in:%s", Arrays.toString(in)));
		logger.trace(String.format("mergea:%s", Arrays.toString(a)));
		logger.trace(String.format("mergeb:%s", Arrays.toString(b)));
		int a0 = 0;
		int b0 = 0;
		for (int i = 0; i < in.length; i++) {
			logger.trace(String.format("i:%s,a0:%s,b0:%s", i, a0, b0));
			if (a0 == a.length) {
				in[i] = b[b0++];
			} else if (b0 == b.length) {
				in[i] = a[a0++];
			} else if (c.compare(a[a0], b[b0]) < 0) {
				in[i] = a[a0++];
			} else {
				in[i] = b[b0++];
			}
		}
		logger.trace(String.format("mergeRet:%s", Arrays.toString(in)));
	}

	public <T> void quickSort(T[] in, Comparator<T> c) {
		quickSort(in, 0, in.length, c);
	}

	private <T> void quickSort(T[] a, int i, int n, Comparator<T> c) {
		if (n <= 1) {
			return;
		}
		T x = a[i + rand.nextInt(n)];
		int p = i - 1;
		int j = i;
		int q = i + n;
		while (j < q) {
			int comp = c.compare(a[j], x);
			if (comp < 0) {
				swap(a, j++, ++p);
			} else if (comp > 0) {
				swap(a, j, --q);
			} else {
				j++;
			}
		}
		quickSort(a, i, p - i + 1, c);
		quickSort(a, q, n - q + i, c);
	}

	private <T> void swap(T[] a, int j, int p) {
		T tmp = a[j];
		a[j] = a[p];
		a[p] = tmp;
	}

	public <T> void heapSort(T[] in, Comparator<T> c) {
		
	}
}
