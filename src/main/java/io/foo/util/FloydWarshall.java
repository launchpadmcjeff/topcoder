package io.foo.util;

public class FloydWarshall {

	/*
	 * Floyd-Warshall All-Pairs Shortest Path algorithm to find the shortest
	 * paths from all source to all target nodes.  Runtime complexity O^3
	 */
	public void allPairsShortestPath(int[][] adj) {
		int n = adj.length;
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}
	}
}
