package io.bar;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class G2 {
	public class Edge {
		Integer y;
		int weight;
		int flow;
		int residual;

		@Override
		public String toString() {
			return "Edge [y=" + y + ", weight=" + weight + ", flow=" + flow
					+ ", residual=" + residual + "]";
		}
	}

	public enum VertexState {
		UNDISCOVERED, DISCOVERED, PROCESSED;
		Integer parent;

		public void setParent(Integer p) {
			this.parent = p;
		}

		public Integer getParent() {
			return this.parent;
		}
	}

	private Map<Integer, List<Edge>> adj = new HashMap<>();
	private boolean directed;

	public int degree(Integer vertex) {
		if (adj.containsKey(vertex)) {
			return adj.get(vertex).size();
		} else {
			return -1;
		}
	}

	public int nvertices() {
		return adj.size();
	}

	public int nedges() {
		int ret = 0;
		for (Map.Entry<Integer, List<Edge>> e : adj.entrySet()) {
			ret += e.getValue().size();
		}
		if (!this.directed) {
			ret /= 2;
		}
		return ret;
	}

	public G2(boolean directed, boolean weighted, int[] edges) {
		this.directed = directed;
		for (int i = 0; i < edges.length - 1; i = i + 2) {
			insertEdge(edges[i], edges[i + 1], directed);
		}
	}

	private void insertEdge(int x, int y, boolean directed) {
		Edge e = new Edge();
		e.y = y;
		if (adj.get(x) == null) {
			List<Edge> t = new LinkedList<>();
			t.add(e);
			adj.put(x, t);
		} else {
			List<Edge> t = adj.get(x);
			t.add(e);
		}
		if (!directed) {
			insertEdge(y, x, true);
		}
	}

	public void printGraph() {
		for (Map.Entry<Integer, List<Edge>> e : adj.entrySet()) {
			System.out.print(e.getKey() + ": ");
			for (Edge i : e.getValue()) {
				System.out.print(" " + i.y);
			}
			System.out.println();
		}
	}
	
	public void printGraph(Map<Integer, List<Edge>> graph) {
		for (Map.Entry<Integer, List<Edge>> e : graph.entrySet()) {
			System.out.print(e.getKey() + ": ");
			for (Edge i : e.getValue()) {
				System.out.print(" " + i.y);
			}
			System.out.println();
		}
	}

	Map<Integer, VertexState> state = new HashMap<>();
	Map<Integer, Integer> parent = new HashMap<>();
	private boolean finished;
	private int time;
	private Map<Integer, Integer> entryTime = new HashMap<>();
	private Map<Integer, Integer> exitTime = new HashMap<>();

	public void initializeSearch() {
		state.clear();
		parent.clear();
		for (Integer i : adj.keySet()) {
			state.put(i, VertexState.UNDISCOVERED);
			parent.put(i, null);
		}
		time = 1;
		finished = false;
	}

	public void bfs(Integer start, BfsAction action) {
		initializeSearch();
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		state.put(start, VertexState.DISCOVERED);
		while (!q.isEmpty()) {
			Integer v = q.remove();
			action.processVertexEarly(v);
			state.put(v, VertexState.PROCESSED);
			for (Edge i : adj.get(v)) {
				if (state.get(i.y) != VertexState.PROCESSED || this.directed) {
					action.processEdge(i);
				}
				if (state.get(i.y) == VertexState.UNDISCOVERED) {
					q.add(i.y);
					state.put(i.y, VertexState.DISCOVERED);
					parent.put(i.y, v);
				}
			}
			action.processVertexLate(v);
		}
	}

	public interface BfsAction {
		void processVertexLate(Integer v);

		void processEdge(Edge i);

		void processVertexEarly(Integer v);
	}

	public class DefaultBfsAction implements BfsAction {
		public void processVertexLate(Integer v) {
		}

		public void processEdge(Edge i) {
		}

		public void processVertexEarly(Integer v) {
		}
	}

	public class StandardBfsAction implements BfsAction {
		public void processVertexEarly(Integer v) {
			System.out.println("processed vertex early " + v);
		}

		public void processEdge(Edge i) {
			System.out.println("processed edge " + i);
		}

		public void processVertexLate(Integer v) {
			System.out.println("processed vertex late " + v);
		}
	}

	public void findPath(Integer start, Integer end) {
		if (start == end || end == null) {
			System.out.print("\n" + start);
		} else {
			findPath(start, parent.get(end));
			System.out.print(" " + end);
		}
	}

	public void connectedComponents() {
		initializeSearch();
		int c = 0;
		for (int i = 0; i < adj.keySet().size(); i++) {
			if (state.get(i) == VertexState.UNDISCOVERED) {
				c++;
				System.out.print("Component " + c + ": ");
				bfs(i, new DefaultBfsAction() {
					public void processVertexEarly(Integer v) {
						System.out.print(" " + v);
					}
				});
				System.out.println();
			}
		}
	}
	
	public void dfs(Integer start, BfsAction action) {
		if (finished) {
			return;
		}
		state.put(start, VertexState.DISCOVERED);
		entryTime.put(start, time++);
		action.processVertexEarly(start);
		for (Edge e : adj.get(start)) {
			if (state.get(e.y) == VertexState.UNDISCOVERED) {
				parent.put(e.y, start);
				action.processEdge(e);
				dfs(e.y, action);
			} else if (state.get(e.y) != VertexState.PROCESSED || directed) {
				action.processEdge(e);
				if (finished) {
					return;
				}
			}
		}
		action.processVertexLate(start);
		exitTime.put(start, time++);
		state.put(start, VertexState.PROCESSED);
	}
	
	public void dfsIterative(Integer start, BfsAction action) {
		initializeSearch();
		Deque<Integer> stack = new LinkedList<>();
		stack.push(start);
		while (!stack.isEmpty()) {
			if (finished) {
				return;
			}
			Integer i = stack.pop();
			if (state.get(i) == VertexState.UNDISCOVERED) {
				state.put(i, VertexState.DISCOVERED);
				entryTime.put(i, time++);
				action.processVertexEarly(i);
				for (Edge e : adj.get(i)) {
					if (state.get(e.y) == VertexState.UNDISCOVERED) {
						parent.put(e.y, i);
						action.processEdge(e);
						stack.push(e.y);
					} else if (state.get(e.y) != VertexState.PROCESSED
							|| directed) {
						action.processEdge(e);
						if (finished) {
							return;
						}
					}
				}
				action.processVertexLate(i);
				exitTime.put(i, time++);
				state.put(i, VertexState.PROCESSED);
			}
		}
	}
	
	public Map<Integer, List<Edge>> adjMatrix2AdjList(Integer[][] matrix) {
		Map<Integer, List<Edge>> ret = new HashMap<>();
		for (int i = 0; i < matrix[0].length; i++) {
			ret.put(i + 1, new LinkedList<Edge>());
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					Edge e = new Edge();
					e.y = j + 1;
					ret.get(i + 1).add(e);
				}
			}
		}
		return ret;
	}
}
