package io.foo.codekata;

public interface CodeKata {

	<T extends Comparable<T>> int binarySearch(T needle, T[] haystack);
	<T extends Comparable<T>> void quickSort(T[] in);
	<T extends Comparable<T>> void mergeSort(T[] in);
	<T extends Comparable<T>> void insertionSort(T[] in);
	<T extends Comparable<T>> void heapSort(T[] in);
	<T extends Comparable<T>> void selectionSort(T[] in);
	void radixSort(int[] in);
	void countingSort(int[] in, int n);
	
	// hashtable - implementation
	// tree stuff - binary trees, n-ary trees, and trie-trees
	// balanced binary tree - red/black, splay tree, AVL tree (how to implement)
	// Tree traversal - inorder postorder, preorder, BFS, DFS
	// Graphs - implement, Dijkstra and A*, 
	// NP-complete problems, such as traveling salesman and the knapsack problem
}
