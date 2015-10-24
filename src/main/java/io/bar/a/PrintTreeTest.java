package io.bar.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrintTreeTest {

	private PrintTree sut;
	private PrintTree.Node root;
	private PrintTree.Node a;
	private PrintTree.Node b;
	private PrintTree.Node c;
	private PrintTree.Node d;
	private PrintTree.Node e;
	private PrintTree.Node f;
	
	@Before
	public void setUp() throws Exception {
		sut = new PrintTree();
		root = new PrintTree.Node("root");
		a = new PrintTree.Node("a");
		b = new PrintTree.Node("b");
		c = new PrintTree.Node("c");
		d = new PrintTree.Node("d");
		e = new PrintTree.Node("e");
		f = new PrintTree.Node("f");
		root.left = a;
		root.right = b;
		a.left = c;
		a.right = d;
		b.right = e;
		e.left = f;
	}

	@Test
	public void testPrint() {
		sut.print(root);
	}

}
