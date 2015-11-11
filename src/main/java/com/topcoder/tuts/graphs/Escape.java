package com.topcoder.tuts.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * @see <a href="http://community.topcoder.com/tc?module=ProblemDetail&rd=4371&pm=1170">Escape Stats</a>
 * @see <a href="https://community.topcoder.com/stat?c=problem_statement&pm=1170&rd=4371">Escape.java</a>
 *
 */
public class Escape {

	V[][] nodes = new V[501][501];
	int DEADLY = -1;
	int HARMFL = 1;
	
	public Escape() {
		for (int i = 0; i <= 500; i++) {
			for (int j = 0; j <= 500; j++) {
				nodes[i][j] = new V(j, i);
			}
		}
	}

	private void updateEdges() {
		for (int i = 0; i <= 500; i++) {
			for (int j = 0; j <= 500; j++) {
				nodes[i][j].nbrs = new ArrayList<V>();
				if (i - 1 >= 0 && nodes[i - 1][j].w != -1) {
					nodes[i][j].nbrs.add(nodes[i - 1][j]);
				}
				if (j + 1 <= 500 && nodes[i][j + 1].w != -1) {
					nodes[i][j].nbrs.add(nodes[i][j + 1]);
				}
				if (i + 1 <= 500 && nodes[i + 1][j].w != -1) {
					nodes[i][j].nbrs.add(nodes[i + 1][j]);
				}
				if (j - 1 >= 0 && nodes[i][j - 1].w != -1) {
					nodes[i][j].nbrs.add(nodes[i][j - 1]);
				}
			}
		}
	}
	
	class V implements Comparable<V> {
		int x;
		int y;
		int w;
		List<V> nbrs;
		boolean inTree;
		int dist = Integer.MAX_VALUE;;
		
		public V(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		List<V> nbrs() {
			if (nbrs == null) {
				nbrs = new ArrayList<V>(4);
				
			}
			return nbrs;
		}
		@Override
		public String toString() {
			return "V [x=" + x + ", y=" + y + ", w=" + w + "]";
		}

		@Override
		public int compareTo(V o) {
			return this.dist - o.dist;
		}
	}
	
	public int lowest(String[] harmful, String[] deadly) {
		updateMap(harmful, HARMFL);
		updateMap(deadly, DEADLY);
		updateEdges();
		dijkstra(nodes[0][0]);
//		dijkstra2(nodes[0][0]);
		if (nodes[500][500].dist == Integer.MAX_VALUE) {
			return -1;
		} else {
			return nodes[500][500].dist;
		}
	}
	
	private void dijkstra2(V start) {
		start.dist = 0;
		V u = start;
		while (!u.inTree) {
			if (u.x == 500 && u.y == 500) {
				break;
			}
			u.inTree = true;
			for (V v : u.nbrs()) {
				if (v.dist > u.dist + v.w) {
					v.dist = u.dist + v.w;
				}
			}
			int shrtDist = Integer.MAX_VALUE;
			for (int i = 0; i <= 500; i++) {
				for (int j = 0; j <= 500; j++) {
					if (nodes[i][j].inTree == false && shrtDist > nodes[i][j].dist) {
						shrtDist = nodes[i][j].dist;
						u = nodes[i][j];
					}
				}
			}
		}
	}
	
	private void dijkstra(V start) {
		start.dist = 0;
		PriorityQueue<V> q = new PriorityQueue<>();
		q.add(start);
		while (!q.isEmpty()) {
			V u = q.remove();
			if (u.x == 500 && u.y == 500) {
				break;
			}
			u.inTree = true;
			for (V v : u.nbrs()) {
				if (v.dist > u.dist + v.w) {
					v.dist = u.dist + v.w;
//					q.remove(v);
					q.add(v);
				}
			}
		}
	}

	public void updateMap(String[] harmfulOrDeadly, int which) {
		for (int i = 0; i < harmfulOrDeadly.length; i++) {
			String[] parsed = harmfulOrDeadly[i].split("\\s+");
			int x1 = Integer.parseInt(parsed[0]);
			int y1 = Integer.parseInt(parsed[1]);
			int x2 = Integer.parseInt(parsed[2]);
			int y2 = Integer.parseInt(parsed[3]);
			if (x1 < x2) {
				if (y1 < y2) {
					for (int x = x1; x <= x2; x++) {
						for (int y = y1; y <= y2; y++) {
							nodes[y][x].w = which;
						}
					}
				} else {
					for (int x = x1; x <= x2; x++) {
						for (int y = y2; y <= y1; y++) {
							nodes[y][x].w = which;
						}
					}
				}
			} else {
				if (y1 < y2) {
					for (int x = x2; x <= x1; x++) {
						for (int y = y1; y <= y2; y++) {
							nodes[y][x].w = which;
						}
					}
				} else {
					for (int x = x2; x <= x1; x++) {
						for (int y = y2; y <= y1; y++) {
							nodes[y][x].w = which;
						}
					}
				}
			}
		}
	}
}
