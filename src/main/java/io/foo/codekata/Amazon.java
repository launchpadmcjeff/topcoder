package io.foo.codekata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Amazon {

	public class Node {
		public Node(String name) {
			super();
			this.name = name;
		}
		String name;
		Node left;
		Node right;
	}
	
	public void printTree(Node n) {
		Map<Node, Integer> d = new LinkedHashMap<>();
		d.put(n, 0);
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		while (!q.isEmpty()) {
			Node i = q.remove();
			Node left = i.left;
			Node right = i.right;
			if (left != null) {
				q.add(left);
				d.put(left, d.get(i) + 1);
			}
			if (right != null) {
				q.add(right);
				d.put(right, d.get(i) + 1);
			}
		}
		int level = 0;
		List<Node> nodes = new ArrayList<>(d.keySet());
		for (int i = 0; i < nodes.size(); i++) {
			System.out.print(nodes.get(i).name);
			if (i < nodes.size() - 1 && d.get(nodes.get(i + 1)) > level) {
				System.out.println();
				level = d.get(nodes.get(i + 1));
			} else if (i < nodes.size() - 1){
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}
}
