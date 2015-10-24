package io.foo.util;

public class BinarySearcher {

	
	public <T extends Comparable<T>> int find(T[] a, T ndl) {
		int ret = -1;
		int off = 0;
		int len = a.length;
		
		while (len >= 1) {
			int m = len / 2;
			if (a[off + m].compareTo(ndl) < 0) {
				off = off + m + 1;
				len = len - m - 1;
			} else if (a[off + m].compareTo(ndl) > 0) {
				len = m;
			} else {
				ret = off + m;
				break;
			}
		}
		return ret;
	}
	
	public <T extends Comparable<T>> int find0(T[] in, T ndl) {
		int ret = -1;
		
		int off = 0;
		int len = in.length;
		
		while (off < in.length && len >= 0) {
			int mid = len / 2;
			if (in[off + mid].compareTo(ndl) < 0) {
				off = off + mid + 1;
				len = len - off;
			} else if (in[off + mid].compareTo(ndl) > 0) {
				len = mid - 1;
			} else {
				ret = off + mid;
				break;
			}
		}
		return ret;
	}
	
}
