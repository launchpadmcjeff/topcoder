package io.bar.a;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GraphPoolTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeTree() {
		GraphPool.Node<String> a = new GraphPool.Node<String>("A");
		GraphPool.Node<String> b = new GraphPool.Node<String>("B");
		GraphPool.Node<String> c = new GraphPool.Node<String>("C");
		GraphPool.Node<String> d = new GraphPool.Node<String>("D");
		GraphPool.Node<String> e = new GraphPool.Node<String>("E");
		GraphPool.Node<String> f = new GraphPool.Node<String>("F");
		List<GraphPool.Node<String>> vertices = new ArrayList<>();
		vertices.add(a);
		vertices.add(b);
		vertices.add(c);
		vertices.add(d);
		vertices.add(e);
		vertices.add(f);
		GraphPool.Edge<GraphPool.Node<String>> ab = new GraphPool.Edge<>(a, b);
		GraphPool.Edge<GraphPool.Node<String>> ac = new GraphPool.Edge<>(a, c);
		GraphPool.Edge<GraphPool.Node<String>> bd = new GraphPool.Edge<>(b, d);
		GraphPool.Edge<GraphPool.Node<String>> be = new GraphPool.Edge<>(b, e);
		GraphPool.Edge<GraphPool.Node<String>> ef = new GraphPool.Edge<>(e, f);
		List<GraphPool.Edge<GraphPool.Node<String>>> edgeList = new ArrayList<>();
		edgeList.add(ab);
		edgeList.add(ac);
		edgeList.add(bd);
		edgeList.add(be);
		edgeList.add(ef);
		Map<GraphPool.Node<String>, List<GraphPool.Edge<GraphPool.Node<String>>>> makeGraphAdjList = GraphPool
				.makeGraphAdjList(vertices, edgeList);
		System.out.println(makeGraphAdjList);
		GraphPool.dumpGraphBFS(makeGraphAdjList, a);

	}
}
