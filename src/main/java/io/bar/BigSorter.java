package io.bar;

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
		Heap<T> heap = new Heap<>(in, c);
		heap.sort();
	}
	
	
	
	private class Heap<T> {
		T[] heap;
		int heapEnd;
		Comparator<T> c;
		
		public Heap(T[] in, Comparator<T> comp) {
			heap = in;
			c = comp;
			heapEnd = in.length - 1;
			buildHeap();
			
		}
		
		public void sort() {
			for (int i = heap.length - 1; i >= 0; i--) {
				T t = take();
				heap[i] = t;
			}
		}
		
		private void buildHeap() {
			
			for (int i = heap.length / 2 - 1; i >= 0; i--) {
				heapifyDown(i);
			}
		}
		
		private T take() {
			T ret = heap[0];
			heap[0] = heap[heapEnd--];
			heapifyDown(0);
			return ret;
		}

		private void swap(int a, int b) {
			T temp = heap[a];
			heap[a] = heap[b];
			heap[b] = temp;
		}
		
		private void heapifyDown(int node) {
			int l = leftChild(node);
			int r = rightChild(node);
			if (l != -1 && c.compare(heap[node], heap[l]) < 0) {
				if (r != -1 && c.compare(heap[l], heap[r]) < 0) {
					swap(node, r);
					heapifyDown(r);
				} else {
					swap(node, l);
					heapifyDown(l);
				}
			} else if (r != -1 && c.compare(heap[node], heap[r]) < 0) {
				swap(node, r);
				heapifyDown(r);
			}
		}
		
		private int leftChild(int node) {
			int i = 2 * node + 1;
			if (i > heapEnd){
				i = -1;
			}
			return i;
		}
		
		private int rightChild(int node) {
			int i = 2 * node + 2;
			if (i > heapEnd){
				i = -1;
			}
			return i;
		}
		
		private int parent(int node) {
			if (node == 0) {
				return -1;
			}
			return node / 2 - 1;
		}
	}
}










