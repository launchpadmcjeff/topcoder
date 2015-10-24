package io.foo.a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * <a href="http://community.topcoder.com/stat?c=problem_statement&pm=12837">
 * ColorfulRoad</a>
 */
class ColorfulRoad {
	class Node {
		char color;
		int spot;
		int cost;
		List<Node> steps = new ArrayList<>();

		Node(char color, int spot, int cost) {
			this.color = color;
			this.spot = spot;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return String.format("color: %s, spot: %d, cost: %d", this.color,
					this.spot, this.cost);
		}
	}

	Map<Character, Character> seq = new HashMap<>();
	{
		seq.put('R', 'G');
		seq.put('G', 'B');
		seq.put('B', 'R');
	}

	public int getMin(String road) {
		// System.out.println(road);
		Node root = new Node(road.charAt(0), 0, 0);
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.remove();
			for (int i = n.spot + 1; i < road.length(); i++) {
				if (road.charAt(i) == seq.get(n.color)) {
					n.steps.add(new Node(road.charAt(i), i, n.cost
							+ (i - n.spot) * (i - n.spot)));
				}
			}
			q.addAll(n.steps);
		}
		// dumpTreeDFS(root);
		int t = Integer.MAX_VALUE;
		Deque<Node> stack = new LinkedList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node n = stack.pop();
			for (Node i : n.steps) {
				stack.push(i);
			}
			if (n.spot == road.length() - 1) {
				if (n.cost < t) {
					t = n.cost;
				}
			}
		}
		return t == Integer.MAX_VALUE ? -1 : t;
	}

	private void dumpTreeDFS(Node x) {
		Deque<Node> stack = new ArrayDeque<ColorfulRoad.Node>();
		stack.push(x);
		while (!stack.isEmpty()) {
			Node e = stack.pop();
			System.out.println(e);
			for (Node i : e.steps) {
				stack.push(i);

			}
		}
	}

	private void dumpTreeBFS(Node x) {
		Deque<Node> q = new ArrayDeque<ColorfulRoad.Node>();
		q.add(x);
		while (!q.isEmpty()) {
			Node e = q.remove();
			System.out.println(e);
			for (Node i : e.steps) {
				q.add(i);

			}
		}
	}

	public int getMin1(String road) {
		int ret = -1;
		char[] rgb = { 'R', 'G', 'B' };
		int rgbPtr = 0;
		int cost = 0;

		for (int i = 0; i < road.length(); i++) {
			rgbPtr++;
			if (rgbPtr == 3) {
				rgbPtr = 0;
			}
			char next = rgb[rgbPtr];
			int j = i;
			while (j < road.length() - 1 && road.charAt(j) != next) {
				j++;
			}
			if (!(j < road.length())) {
				return -1;
			}
			cost += (j - i) * (j - i);
			if (i == road.length() - 1) {
				return cost;
			}
		}

		return ret;
	}

	// RGGGB
	public static int getMinTop(String road) {
		int n = road.length();
		char[] s = road.toCharArray();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('R', 'G');
		map.put('G', 'B');
		map.put('B', 'R');
		int min = Integer.MAX_VALUE;
		int left = (int) Math.round(Math.pow(2, n - 1));
		int right = (int) Math.round(Math.pow(2, n));
		for (int i = left; i < right; i++) {
			String status = Integer.toBinaryString(i);
			if (status.charAt(status.length() - 1) == '0') {
				continue;
			}
			int cost = 0;
			int prev = 0;
			char prevC = 'R';
			boolean valid = true;
			for (int j = status.indexOf("1", 1); j < n && j > 0; j = status
					.indexOf("1", j + 1)) {
				if (s[j] == map.get(prevC)) {
					cost += (j - prev) * (j - prev);
					prevC = s[j];
					prev = j;
				} else {
					valid = false;
					break;
				}
			}

			if (valid) {
				min = Math.min(min, cost);
			}
		}
		if (min == Integer.MAX_VALUE) {
			return -1;
		}
		return min;
	}
}