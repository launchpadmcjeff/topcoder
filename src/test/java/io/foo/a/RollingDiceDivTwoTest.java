package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.RollingDiceDivTwo;

import org.junit.Before;
import org.junit.Test;

public class RollingDiceDivTwoTest {

	private RollingDiceDivTwo sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new RollingDiceDivTwo();
	}

	@Test
	public void testMinimumFaces0() {
		String[] rolls = {"137", "364", "115", "724"};
		int actual = sut.minimumFaces(rolls);
		int expected = 14;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinimumFaces1() {
		String[] rolls = {"1112", "1111", "1211", "1111"};
		int actual = sut.minimumFaces(rolls);
		int expected = 5;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinimumFaces2() {
		String[] rolls = {"24412", "56316", "66666", "45625"};
		int actual = sut.minimumFaces(rolls);
		int expected = 30;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinimumFaces3() {
		String[] rolls = {"931", "821", "156", "512", "129", "358", "555"};
		int actual = sut.minimumFaces(rolls);
		int expected = 19;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinimumFaces4() {
		String[] rolls = {"3", "7", "4", "2", "4"};
		int actual = sut.minimumFaces(rolls);
		int expected = 7;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinimumFaces5() {
		String[] rolls = {"281868247265686571829977999522", "611464285871136563343229916655",
				 "716739845311113736768779647392", "779122814312329463718383927626",
				 "571573431548647653632439431183", "547362375338962625957869719518",
				 "539263489892486347713288936885", "417131347396232733384379841536"};
		int actual = sut.minimumFaces(rolls);
		int expected = 176;
		assertEquals(expected , actual);
	}

}
