package com.topcoder.tuts.graphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @see <a href="https://community.topcoder.com/stat?c=problem_statement&pm=1593&rd=4494">Circuits.java</a>
 *
 */
public class Circuits {

	class Edge {
		Integer v;
		int cost;
		public Edge(Integer v, int cost) {
			this.v = v;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "Edge [v=" + v + ", cost=" + cost + "]";
		}
	}
	
	Map<Integer, List<Edge>> adj = new HashMap<>();
	
	public int howLong(String[] connects, String[] costs) {
		for (int i = 0; i < connects.length; i++) {
			String[] x = connects[i].split("\\s+");
			String[] y = costs[i].split("\\s+");
			LinkedList<Edge> adjList = new LinkedList<>();
			adj.put(i, adjList);
			for (int j = 0; j < x.length; j++) {
				if (x[j].equals("")) {
					continue;
				}
				Integer v = Integer.valueOf(x[j]);
				int cost = Integer.parseInt(y[j]);
				Edge t = new Edge(v, cost);
				adjList.add(t);
			}
		}
		
		List<List<Integer>> topsort = topSortDfs();
		int ret = -1;
		for (int i = 0; i < topsort.size(); i++) {
			int t = longestPath(topsort.get(i));
			if (t > ret) {
				ret = t;
			}
		}
		return ret;
	}

	private int longestPath(List<Integer> topsort) {
		Map<Integer, Integer> d = new LinkedHashMap<>();
		
		d.put(topsort.get(0), 0);
		for (int i = 1; i < topsort.size(); i++) {
			d.put(topsort.get(i), Integer.MIN_VALUE);
		}
		for (int i = 0; i < topsort.size(); i++) {
			for (Edge e : adj.get(topsort.get(i))) {
				if (d.get(topsort.get(i)) + e.cost > d.get(e.v)) {
					d.put(e.v, d.get(topsort.get(i)) + e.cost);
				}
			}
		}
		return d.get(topsort.get(topsort.size() - 1));
	}

	private List<List<Integer>> topSortDfs() {
		List<List<Integer>> ret = new LinkedList<>();
		Map<Integer, Integer> indeg = new HashMap<>();
		for (Integer i : adj.keySet()) {
			indeg.put(i, 0);
		}
		for (List<Edge> i : adj.values()) {
			for (Edge j : i) {
				Integer t = indeg.get(j.v);
				indeg.put(j.v, t + 1);
			}
		}
		for (Integer i : indeg.keySet()) {
			if (indeg.get(i) == 0) {
				dfs(i);
				List<Integer> t = new LinkedList<>();
				while (!stack.isEmpty()) {
					t.add(stack.pop());
				}
				ret.add(t);
			}
		}
		return ret;
	}
	
	Deque<Integer> stack = new LinkedList<>();
	Map<Integer, Boolean> found = new HashMap<>();
	private void dfs(Integer i) {
		found.put(i, true);
		for (Edge e : adj.get(i)) {
			if (found.get(e.v) == null || found.get(e.v) == false) {
				dfs(e.v);
			}
		}
		stack.push(i);
	}

	/**
	 * @deprecated "Replaced with topSortDfs"
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private List<Integer> topsort() {
		List<Integer> ret = new LinkedList<>();
		Map<Integer, Integer> indeg = new HashMap<>();
		for (Integer i : adj.keySet()) {
			indeg.put(i, 0);
		}
		for (List<Edge> i : adj.values()) {
			for (Edge j : i) {
				Integer t = indeg.get(j.v);
				indeg.put(j.v, t + 1);
			}
		}
		while (!indeg.isEmpty()) {
			Iterator<Integer> it = indeg.keySet().iterator();
			while (it.hasNext()) {
				Integer i = it.next();
				if (indeg.get(i) == 0) {
					ret.add(i);
					for (Edge e : adj.get(i)) {
						Integer t = indeg.get(e.v);
						indeg.put(e.v, t - 1);
					}
					it.remove();
				}
			}
		}
		
		return ret;
	}
}
