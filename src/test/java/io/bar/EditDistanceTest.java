package io.bar;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class EditDistanceTest {

	EditDistance sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new EditDistance();
	}

	@Test
	public void testStringCompare0() {
		String s = "foo";
		String t = "too";
		int actual = sut.stringCompare(s, t, s.length(), t.length());
		assertEquals(1, actual);
	}
	
	@Test
	public void testStringCompare1() {
		String s = "f";
		String t = "t";
		int actual = sut.stringCompare(s, t, s.length(), t.length());
		assertEquals(1, actual);
	}
	
	@Test
	public void testStringCompare2() {
		String s = "o";
		String t = "o";
		int actual = sut.stringCompare(s, t, s.length(), t.length());
		assertEquals(0, actual);
	}
	
	@Test
	public void testStringCompare3() {
		String s = "aaa";
		String t = "bbb";
		int actual = sut.stringCompare(s, t, s.length(), t.length());
		assertEquals(3, actual);
	}
	
	@Test
	public void testStringCompare4() {
		String s = "aaaaaaaaaaaa";
		String t = "bbbbbbbbbbbb";
		int actual = sut.stringCompare(s, t, s.length(), t.length());
		assertEquals(12, actual);
	}

	@Test
	public void testStringCompare5() {
		String s = "aaaaaaaaaaaaa";
		String t = "bbbbbbbbbbbbb";
		int actual = sut.stringCompare(s, t, s.length(), t.length());
		assertEquals(13, actual);
	}
	
	@Test
	public void testStringCompareDP0() {
		String s = "foo";
		String t = "too";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(1, actual);
	}
	
	@Test
	public void testStringCompareDP1() {
		String s = "f";
		String t = "t";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(1, actual);
	}
	
	@Test
	public void testStringCompareDP2() {
		String s = "o";
		String t = "o";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(0, actual);
	}
	
	@Test
	public void testStringCompareDP3() {
		String s = "aaa";
		String t = "bbb";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(3, actual);
	}
	
	@Test
	public void testStringCompareDP4() {
		String s = "aaaaaaaaaaaa";
		String t = "bbbbbbbbbbbb";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(12, actual);
	}
	
	@Test
	public void testStringCompareDP5() {
		String s = "aaaaaaaaaaaaa";
		String t = "bbbbbbbbbbbbb";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(13, actual);
	}
	
	@Test
	public void testStringCompareDP6() {
		String s = "foo";
		String t = "d";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(3, actual);
	}
	
	
	@Test
	public void testStringCompareDP7() {
		String s = "bdcab";
		String t = "abcb";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(4, actual);
	}
	
	@Test
	public void testStringCompareDP8() {
		String s = "aaaaaaaaaaaaa";
		String t = "bbbbbbabbbbbb";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(13, actual);
	}
	
	@Test
	public void testStringCompareDP9() {
		String s = "thou shalt not";
		String t = "you should not";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(13, actual);
	}
	
	@Test
	public void testStringCompareDPA() {
		String t = "you should not";
		String s = "thou shalt not";
		int actual = sut.stringCompareDP(s, t);
		sut.reconstructPath(s, t, s.length(), t.length());
		assertEquals(13, actual);
	}
}

