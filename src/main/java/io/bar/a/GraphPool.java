package io.bar.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GraphPool {
	public static class Node<T> {
		boolean visited;
		T data;

		public Node(T data) {
			super();
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "Node [visited=" + visited + ", data=" + data + "]";
		}
	}

	public static class Edge<V> {
		V u;
		V v;

		public Edge(V u, V v) {
			this.u = u;
			this.v = v;
		}

		@Override
		public String toString() {
			return "Edge [u=" + u + ", v=" + v + "]";
		}
	}

	public static <V, E> Map<Node<V>, List<Edge<Node<V>>>> makeGraphAdjList(List<Node<V>> vertices, List<Edge<Node<V>>> edges) {
		Map<Node<V>, List<Edge<Node<V>>>> map = new HashMap<>();
		for (Node<V> i : vertices) {
			map.put(i, new ArrayList<Edge<Node<V>>>());
		}
		for (Edge<Node<V>> i : edges) {
			List<Edge<Node<V>>> e = map.get(i.u);
			e.add(i);
		}
		return map;
	}

	public static <V> void dumpGraphBFS(Map<Node<V>, List<Edge<Node<V>>>> g, Node<V> s) {
		Queue<Node<V>> q = new LinkedList<>();
		s.visited = true;
		q.add(s);
		while (!q.isEmpty()) {
			Node<V> i = q.remove();
			for (Edge<Node<V>> e : g.get(i)) {
				Node<V> j = e.v;
				j.visited = true;
				q.add(j);
			}
			System.out.println(i.toString());
		}
	}

}
