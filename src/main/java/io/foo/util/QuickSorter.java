package io.foo.util;

import java.util.Random;

import org.apache.log4j.Logger;

public class QuickSorter {
	private final Logger logger = Logger.getLogger(QuickSorter.class);
	private final Random rand = new Random();
	public <T extends Comparable<T>> void sort(T[] in) {
		sort(in, 0, in.length);
	}
	
	private <T extends Comparable<T>> void sort(T[] in, int off, int len) {
		if (len <= 1) {
			return;
		}
		
		T pivot = in[off + rand.nextInt(len)];
		int p = off - 1;
		int i = off;
		int q = off + len;
		
		while (i < q) {
			if (in[i].compareTo(pivot) < 0) {
				T t = in[++p];
				in[p] = in[i];
				in[i++] = t;
			} else if (in[i].compareTo(pivot) > 0) {
				T t = in[--q];
				in[q] = in[i];
				in[i] = t;
			} else {
				i++;
			}
		}
		sort(in, off, p - off + 1);
		sort(in, q, off + len - q);
	}
}
