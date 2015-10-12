package io.bar;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import io.bar.G2.Edge;

public class G2Test {

	private G2 sut;

	@Before
	public void setUp() throws Exception {
		sut = new G2(false, false, new int[] { 1, 2, 1, 5, 1, 6, 2, 3, 2, 5, 3,
				4, 4, 5 });
	}

	@Test
	public void testDegree1() {
		int actual = sut.degree(1);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testDegree2() {
		int actual = sut.degree(2);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testDegree3() {
		int actual = sut.degree(3);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testDegree4() {
		int actual = sut.degree(4);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testDegree5() {
		int actual = sut.degree(5);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testDegree6() {
		int actual = sut.degree(6);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testNvertices() {
		int actual = sut.nvertices();
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void testNedges() {
		int actual = sut.nedges();
		int expected = 7;
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintGraph() {
		sut.printGraph();
	}

	@Test
	public void testBfs() {
		sut.bfs(1, sut.new StandardBfsAction());
		sut.findPath(1, 1);
		sut.findPath(1, 3);
	}
	
	@Test
	public void testDfs() {
		sut.initializeSearch();
		sut.dfs(1, sut.new StandardBfsAction());
		sut.findPath(1, 1);
		sut.findPath(1, 3);
	}
	
	@Test
	public void testDfsIterative() {
		sut.dfsIterative(1, sut.new StandardBfsAction());
		sut.findPath(1, 1);
		sut.findPath(1, 3);
	}
	
	@Test
	public void testConnectedComponents() {
		sut.connectedComponents();
	}
	
	@Test
	public void testAdjMatrix2AdjList() {
		Integer[][] matrix = {	{0,1,0,0,1,1},
								{1,0,1,0,1,0},
								{0,1,0,1,0,0},
								{0,0,1,0,1,0},
								{1,1,0,1,0,0},
								{1,0,0,0,0,0}};
		Map<Integer, List<Edge>> adjMatrix2AdjList = sut.adjMatrix2AdjList(matrix);
		sut.printGraph(adjMatrix2AdjList);
		
	}
	
	@Test
	public void testFoo() {
		Date a = null;
		Date b = null;
		Date actual = getEarlierEvent(a, b);
		assertEquals(null, actual);
		a = new Date();
		actual = getEarlierEvent(a, b);
		assertEquals(a, actual);
		a = null;
		b = new Date();
		actual = getEarlierEvent(a, b);
		assertEquals(b, actual);
		a = new Date();
		b = new Date();
		actual = getEarlierEvent(a, b);
		assertEquals(a, actual);
	}
	
	private Date getEarlierEvent(Date a, Date b)
	{
		
		return a == null && b == null ? null : a == null ? b : b == null ? a : a.before(b) ? a : b;
	}
}
