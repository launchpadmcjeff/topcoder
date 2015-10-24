package io.foo.codekata;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeKata01 implements CodeKata {

	@Override
	public <T extends Comparable<T>> int binarySearch(T needle, T[] haystack) {
		int r = haystack.length - 1;
		int l = 0;
		int m = 0;
		while (l <= r) {
			m = (l + r) / 2;
			int comp = needle.compareTo(haystack[m]);
			if (comp < 0) {
				r = m - 1;
			} else if (comp > 0) {
				l = m + 1;
			} else {
				return m;
			}
		}
		return -m;
	}

	@Override
	public <T extends Comparable<T>> void quickSort(T[] in) {
		qsort(in, 0, in.length - 1);
	}

	private <T extends Comparable<T>> void qsort(T[] in, int start, int end) {
		if (end <= start) {
			return;
		}
		T pvt = in[(start + end) / 2];
		swap(in, start, (start + end) / 2);
		int i = start + 1;
		int j = end;
		while (i < j) {
			while (in[i].compareTo(pvt) <= 0) {
				i++;
			}
			while (in[j].compareTo(pvt) > 0) {
				j--;
			}
			if (i < j) {
				swap(in, i, j);
			} else {
				swap(in, start, i - 1);
			}
		}
		qsort(in, start, i - 1);
		qsort(in, j + 1, end);
	}

	@Override
	public <T extends Comparable<T>> void mergeSort(T[] in) {
		if (in.length <= 1) {
			return;
		}
		T[] l = Arrays.copyOfRange(in, 0, in.length / 2);
		T[] r = Arrays.copyOfRange(in, in.length / 2, in.length);
		mergeSort(l);
		mergeSort(r);
		merge(in, l, r);
	}

	public <T extends Comparable<T>> void merge(T[] in, T[] l, T[] r) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < in.length) {
			if (j >= r.length) {
				in[k++] = l[i++];
			} else if (i >= l.length) {
				in[k++] = r[j++];
			} else {
				int comp = l[i].compareTo(r[j]);
				if (comp <= 0) {
					in[k++] = l[i++];
				} else {
					in[k++] = r[j++];
				}
			}
		}
	}

	@Override
	public <T extends Comparable<T>> void insertionSort(T[] in) {
		for (int i = 1; i < in.length; i++) {
			for (int j = i; j > 0; j--) {
				if (in[j - 1].compareTo(in[j]) > 0) {
					swap(in, j - 1, j);
				} else {
					break;
				}
			}
		}
	}

	public <T> void swap(T[] in, int l, int r) {
		T tmp = in[l];
		in[l] = in[r];
		in[r] = tmp;
	}

	@Override
	public <T extends Comparable<T>> void heapSort(T[] in) {
		MaxHeap<T> heap = new MaxHeap<T>(in);
		heap.sort();
	}

	class MaxHeap<T extends Comparable<T>> {
		T[] in;
		int heapEnd;

		public MaxHeap(T[] in) {
			this.in = in;
			heapEnd = in.length;
			buildHeap();
			System.out.println(Arrays.deepToString(in));
		}

		T max() {
			T ret = in[0];
			in[0] = in[--heapEnd];
			maxHeapifyDown(0);
			return ret;
		}

		public void sort() {
			while (heapEnd > 0) {
				T res = max();
				in[heapEnd] = res;
			}
		}

		public void buildHeap() {
			for (int i = in.length / 2 - 1; i >= 0; i--) {
				maxHeapifyDown(i);
			}
		}

		public void maxHeapifyDown(int i) {
			while (i <= heapEnd / 2 - 1) {
				boolean swpL = false;
				boolean swpR = false;
				int lChild = leftChild(i);
				int rChild = rightChild(i);
				if (lChild == -1) {
					swpL = false;
				} else {
					swpL = in[i].compareTo(in[lChild]) < 0;
				}
				if (rChild == -1) {
					swpR = false;
				} else {
					swpR = in[i].compareTo(in[rChild]) < 0;
				}
				if (swpL && swpR) {
					if (in[lChild].compareTo(in[rChild]) >= 0) {
						swap(in, lChild, i);
						i = lChild;
					} else {
						swap(in, rChild, i);
						i = rChild;
					}
				} else if (swpL) {
					swap(in, lChild, i);
					i = lChild;
				} else if (swpR) {
					swap(in, rChild, i);
					i = rChild;
				} else {
					break;
				}
			}
		}

		public void maxHeapifyUp(int i) {
			while (i > 0) {
				if (in[parent(i)].compareTo(in[i]) < 0) {
					swap(in, parent(i), i);
				}
				i = parent(i);
			}
		}

		private int parent(int i) {
			int ret = 0;
			if (i > 0) {
				ret = (i - 1) / 2;
			}
			return ret;
		}

		int rightChild(int i) {
			int ret = 2 * i + 2;
			if (ret < heapEnd) {
				return ret;
			} else {
				return -1;
			}
		}

		int leftChild(int i) {
			int ret = 2 * i + 1;
			if (ret < heapEnd) {
				return ret;
			} else {
				return -1;
			}
		}

		void add(T elem) {
			if (heapEnd < in.length) {
				in[heapEnd++] = elem;
				maxHeapifyUp(heapEnd - 1);
			} else {
				throw new RuntimeException("Sorry heap too big");
			}
		}
	}

	@Override
	public <T extends Comparable<T>> void selectionSort(T[] in) {
		int min = -1;
		for (int i = 0; i < in.length; i++) {
			min = i;
			for (int j = i + 1; j < in.length; j++) {
				if (in[j].compareTo(in[min]) < 0) {
					min = j;
				}
			}
			swap(in, min, i);
		}
	}

	@Override
	public void radixSort(int[] in) {
		for (int i = 0; i < 3; i++) {

		}

	}

	@Override
	public void countingSort(int[] in, int n) {
		int[] b = new int[in.length];
		int[] c = new int[n];
		for (int i = 0; i < in.length; i++) {
			c[in[i]]++;
		}
		for (int i = 1; i < c.length; i++) {
			c[i] = c[i - 1] + c[i];
		}
		for (int i = in.length - 1; i >= 0; i--) {
			b[c[in[i]] - 1] = in[i];
			c[in[i]]--;
		}
		for (int i = 0; i < in.length; i++) {
			in[i] = b[i];
		}
	}

	public void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			boolean div3 = i % 3 == 0;
			boolean div5 = i % 5 == 0;
			if (div3 && div5) {
				System.out.println("FizzBuzz");
			} else if (div5) {
				System.out.println("Buzz");
			} else if (div3) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

	public int minCoins(int[] coinVals, int sum) {
		int[] sS = new int[sum + 1];
		for (int i = 0; i < sS.length; i++) {
			sS[i] = Integer.MAX_VALUE;
		}
		sS[0] = 0;

		for (int i = 1; i < sS.length; i++) {
			for (int j = 0; j < coinVals.length; j++) {
				if (coinVals[j] <= i && sS[i - coinVals[j]] + 1 < sS[i]) {
					sS[i] = sS[i - coinVals[j]] + 1;
				}
			}
		}

		return sS[sum];
	}

	public void floydWashallAllPairsShortestPaths(int[][] G) {
		for (int k = 0; k < G[0].length; k++) {
			for (int i = 0; i < G[0].length; i++) {
				for (int j = 0; j < G[0].length; j++) {
					if (G[i][k] + G[k][j] < G[i][j]) {
						G[i][j] = G[i][k] + G[k][j];
					}
				}
			}
		}
	}
	
	Integer[][] next = null;
	public void floydWashallAllPairsShortestPathsWithPathReconstruction(int[][] G) {
		next = new Integer[G[0].length][G[0].length];
		for (int i = 0; i < G[0].length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				if (G[i][j] < 1000) {
					next[i][j] = j;
				}
			}
		}
		
		for (int k = 0; k < G[0].length; k++) {
			for (int i = 0; i < G[0].length; i++) {
				for (int j = 0; j < G[0].length; j++) {
					if (G[i][k] + G[k][j] < G[i][j]) {
						G[i][j] = G[i][k] + G[k][j];
						next[i][j] = next[i][k];
					}
				}
			}
		}
	}
	
	public List<Integer> path(int u, int v) {
		List<Integer> ret = new ArrayList<>();
		if (next[u][v] == null) {
			return ret;
		}
		ret.add(u);
		while (u != v) {
			u = next[u][v];
			ret.add(u);
		}
		return ret;
	}

	static class Edge {
		String u;
		String v;
		Integer w;
		Edge redge;

		public Edge(String u, String v, Integer w) {
			this.u = u;
			this.v = v;
			this.w = w;
		}

		@Override
		public String toString() {
			return u + "->" + v + "=" + w;
		}

	}

	static class FlowNetwork {
		Map<String, List<Edge>> adj = new HashMap<>();
		Map<Edge, Integer> flow = new HashMap<>();

		void addVertex(String v) {
			adj.put(v, new ArrayList<Edge>());
		}

		List<Edge> getEdges(String v) {
			return adj.get(v);
		}

		void addEdge(String u, String v, Integer w) {
			if (w == null) {
				w = 0;
			}
			if (u.equals(v)) {
				throw new RuntimeException("Value Error: u = v");
			}
			Edge edge = new Edge(u, v, w);
			Edge redge = new Edge(v, u, 0);
			edge.redge = redge;
			redge.redge = edge;
			List<Edge> list = adj.get(u);
			list.add(edge);
			list = adj.get(v);
			list.add(redge);
			flow.put(edge, 0);
			flow.put(redge, 0);

		}

		List<Edge> findPath(String source, String sink, List<Edge> path) {
			if (source.equals(sink)) {
				return path;
			}
			for (Edge e : getEdges(source)) {
				List<Edge> ret = new ArrayList<>(path);
				Integer residual = e.w - flow.get(e);
				if (residual > 0 && !ret.contains(e)) {
					ret.add(e);
					List<Edge> result = findPath(e.v, sink, ret);
					if (!result.isEmpty()) {
						return result;
					}
				}
			}
			return Collections.emptyList();
		}

		void printPath(List<Edge> path) {
			System.out.print("[");
			for (int i = 0; i < path.size(); i++) {
				System.out.print(path.get(i));
				System.out.print(" F=" + flow.get(path.get(i)) + (i < path.size() - 1 ? " | " : ""));
			}
			System.out.println("]");
		}
		
		int maxFlow(String source, String sink) {
			List<Edge> path = findPath(source, sink, new ArrayList<Edge>());
			while (!path.isEmpty()) {
				List<Integer> residuals = new ArrayList<Integer>();
				for (Edge e : path) {
					residuals.add(e.w - flow.get(e));
				}
				Integer flw = Collections.min(residuals);
				for (Edge e : path) {
					Integer i = flow.get(e);
					flow.put(e, i + flw);
				}
				for (Edge e : path) {
					Integer j = flow.get(e.redge);
					flow.put(e.redge, j - flw);
				}
				path = findPath(source, sink, new ArrayList<Edge>());
			}
			int sum = 0;
			for (Edge e : getEdges(source)) {
				sum += flow.get(e);
			}
			return sum;
		}
	}
}
