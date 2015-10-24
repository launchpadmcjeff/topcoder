package io.foo.util;

public class QuickSorter2 {

	public <T extends Comparable<T>> void sort(T[] in) {
		sort(in, 0, in.length - 1);
	}

	private <T extends Comparable<T>> void sort(T[] in, int l, int r) {
		if (l >= r) {
			return;
		}
		int p = partition(in, l, r);
		sort(in, l, p - 1);
		sort(in, p + 1, r);
	}

	private <T extends Comparable<T>> int partition(T[] in, int l, int r) {
		T pvt = in[l];

		int i = l + 1;
		int j = r;

		for (;;) {
			while (i <= j && in[i].compareTo(pvt) < 0) {
				i++;
			}
			while (j > i && in[j].compareTo(pvt) >= 0) {
				j--;
			}
			if (i < j) {
				swap(in, i, j);
			}
			if (i >= j) {
				break;
			}
		}
		swap(in, l, i - 1);

		return i - 1;
	}

	private <T> void swap(T[] in, int l, int r) {
		T tmp = in[l];
		in[l] = in[r];
		in[r] = tmp;
	}

	void foo() {
		for (int i = 0; i < 9; i++) {
			if (i == 3) {
				
			}
		}
	}
}
