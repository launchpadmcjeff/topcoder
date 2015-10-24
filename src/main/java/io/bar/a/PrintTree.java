package io.bar.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PrintTree {

	public void print(Node root) {
		List<Node> nodes = bfs(root);
		Map<Node, Integer> d = new HashMap<>();
		for (Node i : nodes) {
			if ("root".equals(i.data)) {
				d.put(i, 0);
			} else {
				d.put(i, 10000);
			}
		}
		for (int i = 1; i < nodes.size(); i++) {
			for (Node j : d.keySet()) {
				if (j.left != null && (d.get(j) + 1 < d.get(j.left))) {
					d.put(j.left, d.get(j) + 1);
				}
				if (j.right != null && (d.get(j) + 1 < d.get(j.right))) {
					d.put(j.right, d.get(j) + 1);
				}
			}
		}
		List<Map.Entry<PrintTree.Node, Integer>> entries = new ArrayList<>(d.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<PrintTree.Node, Integer>>() {

			@Override
			public int compare(Map.Entry<PrintTree.Node, Integer> o1, Map.Entry<PrintTree.Node, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		int x = 0;
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).getValue() > x) {
				System.out.println(";");
				x = entries.get(i).getValue();
			} else if (x > 0){
				System.out.print(" ");
			}
			System.out.print(entries.get(i).getKey().data);
		}
	}
	
	public static class Node {
		public Node left;
		public Node right;
		public String data;
		
		public Node(String data) {
			super();
			this.data = data;
		}

		public Node(Node left, Node right, String data) {
			super();
			this.left = left;
			this.right = right;
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
	}
	
	List<Node> bfs(Node root) {
		List<Node> ret = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.remove();
			ret.add(n);
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}
		return ret;
	}
}
