package io.bar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CodeKata01Test {

	Integer[] unsorted;
	Integer[] sorted;
	CodeKata01 sut;
	
	@Before
	public void setUp() throws Exception {
		unsorted = new Integer[] {1, 22, 99, 1024, 3, 6, 99, 823, 42, 31, 65, 70};
		sorted   = new Integer[] {1, 3, 6, 22, 31, 42, 65, 70, 99, 99, 823, 1024};
		sut = new CodeKata01();
		
	}

	@Test
	public void testBinarySearch() {
		int actual_42 = sut.binarySearch(42, sorted);
		assertEquals(5, actual_42);
		int actual_1 = sut.binarySearch(1, sorted);
		assertEquals(0, actual_1);
		int actual_999 = sut.binarySearch(999, sorted);
		assertEquals(-11, actual_999);
		int actual_0 = sut.binarySearch(0, sorted);
		assertEquals(0, actual_0);
	}

	@Test
	public void testQuickSort() {
		sut.quickSort(unsorted);
		assertArrayEquals(sorted, unsorted);
	}

	@Test
	public void testMergeSort() {
		sut.mergeSort(unsorted);
		assertArrayEquals(sorted, unsorted);
	}

	@Test
	public void testInsertionSort() {
		sut.insertionSort(unsorted);
		assertArrayEquals(sorted, unsorted);
	}

	@Test
	public void testSwap() {
		Integer[] x0 = new Integer[] {0, 42};
		Integer[] x1 = new Integer[] {42, 0};
		sut.swap(x0, 0, 1);
		assertArrayEquals(x1, x0);
	}

	@Test
	public void testHeapSort() {
		sut.heapSort(unsorted);
		assertArrayEquals(sorted, unsorted);
	}

	@Test
	public void testSelectionSort() {
		sut.selectionSort(unsorted);
		assertArrayEquals(sorted, unsorted);
	}

	@Ignore
	@Test
	public void testRadixSort() {
		int[] actuals = new int[] {682,957,181,648,123,471,814,991,379,668,517,506,825,934,263,980};
		int[] expecteds = new int[] {123,181,263,379,471,506,517,648,668,682,814,825,934,957,980,991};
		sut.radixSort(actuals);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testCountingSort() {
		int[] actuals = new int[] {2,7,1,8,3,1,4,1,9,8,7,6,5,4,3,0};
		int[] expecteds = new int[] {0,1,1,1,2,3,3,4,4,5,6,7,7,8,8,9};
		sut.countingSort(actuals, 10);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testFizzBuzz() {
		sut.fizzBuzz();
	}
	
	@Test
	public void testMinCoins00() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 0);
		int expected = 0;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins01() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 1);
		int expected = 1;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins02() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 2);
		int expected = 2;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins03() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 3);
		int expected = 1;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins04() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 4);
		int expected = 2;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins05() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 5);
		int expected = 1;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins06() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 6);
		int expected = 2;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins07() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 7);
		int expected = 3;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins08() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 8);
		int expected = 2;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins09() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 9);
		int expected = 3;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins10() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 10);
		int expected = 2;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMinCoins11() {
		int actual = sut.minCoins(new int[] {1,  3, 5}, 11);
		int expected = 3;
		assertEquals(expected , actual);
	}
	
	@Test
	public void testMaxFlow() {
		CodeKata01.FlowNetwork g = new CodeKata01.FlowNetwork();
		g.addVertex("s");
		g.addVertex("o");
		g.addVertex("p");
		g.addVertex("q");
		g.addVertex("r");
		g.addVertex("t");
		
		g.addEdge("s", "o", 3);
		g.addEdge("s", "p", 3);
		g.addEdge("o", "p", 2);
		g.addEdge("o", "q", 3);
		g.addEdge("p", "r", 2);
		g.addEdge("r", "t", 3);
		g.addEdge("q", "r", 4);
		g.addEdge("q", "t", 2);
		
//		System.out.println(g.adj);
//		System.out.println(g.flow);
		int maxFlow = g.maxFlow("s", "t");
		System.out.println(maxFlow);
		assertEquals(5L, maxFlow);
		
	}
	
	@Test
	public void testMaxFlow2() {
		CodeKata01.FlowNetwork g = new CodeKata01.FlowNetwork();
		g.addVertex("x");
		g.addVertex("a");
		g.addVertex("b");
		g.addVertex("c");
		g.addVertex("d");
		g.addVertex("e");
		g.addVertex("y");
		
		g.addEdge("x", "a", 3);
		g.addEdge("x", "b", 1);
		g.addEdge("a", "c", 3);
		g.addEdge("b", "c", 5);
		g.addEdge("b", "d", 4);
		g.addEdge("c", "y", 2);
		g.addEdge("d", "e", 2);
		g.addEdge("e", "y", 3);
		
		int maxFlow = g.maxFlow("x", "y");
		System.out.println(maxFlow);
		assertEquals(3L, maxFlow);
	}
	
	@Test
	public void testFloydWashallAllPairsShortestPaths01() {
		int[][] G = new int[4][4];
		for (int i = 0; i < G[0].length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				G[i][j] = 1000;
			}
		}
		
		G[0][1] = 1;
		G[0][2] = 2;
		G[1][2] = 4;
		G[1][3] = 3;
		G[2][3] = 1;
		sut.floydWashallAllPairsShortestPaths(G);
		for (int i = 0; i < G[0].length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				System.out.print(G[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void testFloydWashallAllPairsShortestPathsWithPathReconstruction() {
		int[][] G = new int[4][4];
		for (int i = 0; i < G[0].length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				G[i][j] = 1000;
			}
		}
		
		G[0][1] = 1;
		G[0][2] = 2;
		G[1][2] = 4;
		G[1][3] = 3;
		G[2][3] = 1;
		sut.floydWashallAllPairsShortestPathsWithPathReconstruction(G);
		for (int i = 0; i < G[0].length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				System.out.print(G[i][j] + " ");
			}
			System.out.println();
		}
		
		List<Integer> path = sut.path(0, 3);
		System.out.println(path);
	}
}
