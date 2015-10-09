package com.github.topcoder;

import java.util.SortedMap;
import java.util.TreeMap;

public class HeapSort {

	public void sort(int[] arg) {
		SortedMap<Integer, Integer> heap = new TreeMap<Integer, Integer>();
		for (int i : arg) {
			if (heap.containsKey(i)) {
				int t = heap.get(i);
				heap.put(i, ++t);
			} else {
				heap.put(i, 1);
			}
		}
		for (int i = 0; i < arg.length; ) {
			int x = heap.firstKey();
			for (int j = 0; j < heap.get(x); j++) {
				arg[i++] = x;
			}
			heap.remove(x);
		}
	}
	
}
