package io.foo.codekata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AmazonTest {

	private Amazon sut;
	private Amazon.Node root;
	private Amazon.Node a;
	private Amazon.Node b;
	private Amazon.Node c;
	private Amazon.Node d;
	private Amazon.Node e;
	
	@Before
	public void setUp() throws Exception {
		sut = new Amazon();
		root = sut.new Node("root");
		a = sut.new Node("a");
		b = sut.new Node("b");
		c = sut.new Node("c");
		d = sut.new Node("d");
		e = sut.new Node("e");
		root.left = a;
		root.right = b;
		a.left = c;
		a.right = d;
		d.right = e;
	}

	@Test
	public void testPrintTree() {
		sut.printTree(root);
	}

}
