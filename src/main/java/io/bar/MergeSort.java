package io.bar;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class MergeSort {
	private final Logger logger = Logger.getLogger(MergeSort.class);
	
	public void sort(int[] arg) {
		logger.trace(String.format("%s", Arrays.toString(arg)));
		if (arg.length > 1) {
			int[] a = Arrays.copyOfRange(arg, 0, arg.length / 2);
			int[] b = Arrays.copyOfRange(arg, arg.length / 2, arg.length);
			sort(a);
			sort(b);
			merge(a, b, arg);
		}
	}

	private void merge(int[] a, int[] b, int[] arg) {
		int i0 = 0;
		int i1 = 0;
		for (int i = 0; i < arg.length; i++) {
			if (i0 == a.length) {
				arg[i] = b[i1++];
			} else if (i1 == b.length) {
				arg[i] = a[i0++];
			} else if (a[i0] <= b[i1]) {
				arg[i] = a[i0++];
			} else {
				arg[i] = b[i1++];
			}
		}
	}
}
