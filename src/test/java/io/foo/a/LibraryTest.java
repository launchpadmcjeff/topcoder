package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.Library;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

	private Library sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Library();
	}

	@Test
	public void testDocumentAccess0() {
		String[] records = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] userGroups = {"employee","editor","author"};
		String[] roomRights = {"history","cars","computers"};
		int expected = 2;
		int actual = sut.documentAccess(records, userGroups, roomRights);
		assertEquals(expected, actual);
	}
	@Test
	public void testDocumentAccess1() {
		String[] records = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] userGroups = {"employee","editor","author","librarian"};
		String[] roomRights = {"history","cars","computers"};
		int expected = 2;
		int actual = sut.documentAccess(records, userGroups, roomRights);
		assertEquals(expected, actual);
	}
	@Test
	public void testDocumentAccess2() {
		String[] records = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
		String[] userGroups = {"employee","editor","author","librarian"};
		String[] roomRights = {};
		int expected = 0;
		int actual = sut.documentAccess(records, userGroups, roomRights);
		assertEquals(expected, actual);
	}
	@Test
	public void testDocumentAccess3() {
		String[] records = {"a b c","a b d","b b c","b b d","e c d","e c b","e c c","t d e"};
		String[] userGroups = {"c","d","x"};
		String[] roomRights = {"a","b","c"};
		int expected = 3;
		int actual = sut.documentAccess(records, userGroups, roomRights);
		assertEquals(expected, actual);
	}

}
