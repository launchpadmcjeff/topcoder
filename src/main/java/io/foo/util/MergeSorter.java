package io.foo.util;

import java.util.Arrays;

public class MergeSorter {

	public <T extends Comparable<T>> void sort(T[] in) {
		if (in.length == 1) {
			return;
		}
		
		T[] left = Arrays.copyOfRange(in, 0, in.length / 2);
		T[] riht = Arrays.copyOfRange(in, in.length / 2, in.length);
		
		sort(left);
		sort(riht);
		
		int l = 0;
		int r = 0;
		for (int i = 0; i < in.length; i++) {
			if (l == left.length) {
				in[i] = riht[r++];
			} else if (r == riht.length) {
				in[i] = left[l++];
			} else if (left[l].compareTo(riht[r]) <= 0) {
				in[i] = left[l++];
			} else {
				in[i] = riht[r++];
			}
		}
	}
}
