package io.bar;

import java.util.Comparator;

public interface Sorter {
	<T> void mergeSort(T[] in, Comparator<T> c);

	<T> void quickSort(T[] in, Comparator<T> c);

	<T> void heapSort(T[] in, Comparator<T> c);
}