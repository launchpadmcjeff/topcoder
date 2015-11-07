package com.topcoder.tuts.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @see <a href="https://community.topcoder.com/stat?c=problem_statement&pm=1524&rd=4472">Marketing.java</a>
 *
 */
public class Marketing {
	private static final int EDGE = 0x01;
	private static final int FOUND = 0x02;
	private static final int UNC = 0;
	private static final int RED = 1;
	private static final int BLU = 2;
	int[][] edges;
	int[] color;
	class Node {
		int id;

		public Node(int id) {
			super();
			this.id = id;
		}
		
		public List<Node> getNbrs() {
			List<Node> ret = new ArrayList<>();
			for (int i = 0; i < edges[id].length; i++) {
				if ((edges[id][i] & EDGE) != 0) {
					ret.add(new Node(i));
				}
			}
			return ret;
		}
	}
	
	public long howMany(String[] compete) {
		long ret = 1;
		color = new int[compete.length];
		edges = new int[compete.length][compete.length];
		for (int i = 0; i < compete.length; i++) {
			String[] t = compete[i].split("\\s+");
			for (int j = 0; j < t.length; j++) {
				if (t[j].equals("")) {
					continue;
				}
				int x = Integer.parseInt(t[j]);
				edges[i][x] |= EDGE;
				edges[x][i] |= EDGE;
			}
		}
		
		for (int i = 0; i < compete.length; i++) {
			long t = 0;
			if ((edges[i][0] & FOUND) == 0) {
				t = testBipartite(new Node(i));
			} else {
				continue;
			}
			if (t == -1) {
				return -1;
			} else {
				ret *= 2;
			}
		}
		
		return ret;
	}

	private long testBipartite(Node n) {
		long ret = 2;
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		edges[n.id][0] |= FOUND;
		color[n.id] = RED;
		while (!q.isEmpty()) {
			Node t = q.remove();
			for (Node i : t.getNbrs()) {
				if (color[t.id] == color[i.id]) {
					return -1L;
				} else {
					color[i.id] = color[t.id] == RED ? BLU : RED;
				}
				if ((edges[i.id][0] & FOUND) == 0) {
					q.add(i);
					edges[i.id][0] |= FOUND;
				}
			}
		}
		
		return ret;
	}
}
