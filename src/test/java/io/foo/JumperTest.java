package io.foo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class JumperTest {

	private Jumper sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Jumper();
	}

	@Test
	public void testMinTime01() {
		String[] patterns = {"###..", "..###"};
		int[] speeds = {5,5};
		String rows = "01";
		int actual = sut.minTime(patterns, speeds, rows);
		int expected = 5;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinTime02() {
		String[] patterns = {"....#", "....#"};
		int[] speeds = {4,5};
		String rows = "0111";
		int actual = sut.minTime(patterns, speeds, rows);
		int expected = 9;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinTime03() {
		String[] patterns = {"#....", "#...."};
		int[] speeds = {-4,-5};
		String rows = "0111";
		int actual = sut.minTime(patterns, speeds, rows);
		int expected = 24;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinTime04() {
		String[] patterns = {"#####","#####"};
		int[] speeds = {10,10};
		String rows = "01";
		int actual = sut.minTime(patterns, speeds, rows);
		int expected = -1;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinTime05() {
		String[] patterns = {"#####","#####","....."};
		int[] speeds = {1,-1,1};
		String rows = "01010101010101010102";
		int actual = sut.minTime(patterns, speeds, rows);
		int expected = -1;
		assertEquals(expected , actual);
	}
	@Test
	public void testMinTime06() {
		String[] patterns = {"#....", "#....", "#...."};
		int[] speeds = {5,-5,6};
		String rows = "2012";
		int actual = sut.minTime(patterns, speeds, rows);
		int expected = 12;
		assertEquals(expected , actual);
	}
}
