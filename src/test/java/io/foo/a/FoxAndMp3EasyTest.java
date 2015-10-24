package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.FoxAndMp3Easy;

import org.junit.Before;
import org.junit.Test;

public class FoxAndMp3EasyTest {

	private FoxAndMp3Easy sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FoxAndMp3Easy();
	}

	@Test
	public void testPlayList0() {
		int n = 3;
		String[] expecteds = { "1.mp3", "2.mp3", "3.mp3" };
		String[] actuals = sut.playList(n);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPlayList1() {
		int n = 10;
		String[] expecteds = {"1.mp3",
				"10.mp3",
				"2.mp3",
				"3.mp3",
				"4.mp3",
				"5.mp3",
				"6.mp3",
				"7.mp3",
				"8.mp3",
				"9.mp3" };
		String[] actuals = sut.playList(n);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPlayList2() {
		int n = 16;
		String[] expecteds = {"1.mp3",
				"10.mp3",
				"11.mp3",
				"12.mp3",
				"13.mp3",
				"14.mp3",
				"15.mp3",
				"16.mp3",
				"2.mp3",
				"3.mp3",
				"4.mp3",
				"5.mp3",
				"6.mp3",
				"7.mp3",
				"8.mp3",
				"9.mp3" };
		String[] actuals = sut.playList(n);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPlayList3() {
		int n = 32;
		String[] expecteds = {"1.mp3",
				"10.mp3",
				"11.mp3",
				"12.mp3",
				"13.mp3",
				"14.mp3",
				"15.mp3",
				"16.mp3",
				"17.mp3",
				"18.mp3",
				"19.mp3",
				"2.mp3",
				"20.mp3",
				"21.mp3",
				"22.mp3",
				"23.mp3",
				"24.mp3",
				"25.mp3",
				"26.mp3",
				"27.mp3",
				"28.mp3",
				"29.mp3",
				"3.mp3",
				"30.mp3",
				"31.mp3",
				"32.mp3",
				"4.mp3",
				"5.mp3",
				"6.mp3",
				"7.mp3",
				"8.mp3",
				"9.mp3" };
		String[] actuals = sut.playList(n);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testPlayList4() {
		int n = 109;
		String[] expecteds = {"1.mp3",
				"10.mp3",
				"100.mp3",
				"101.mp3",
				"102.mp3",
				"103.mp3",
				"104.mp3",
				"105.mp3",
				"106.mp3",
				"107.mp3",
				"108.mp3",
				"109.mp3",
				"11.mp3",
				"12.mp3",
				"13.mp3",
				"14.mp3",
				"15.mp3",
				"16.mp3",
				"17.mp3",
				"18.mp3",
				"19.mp3",
				"2.mp3",
				"20.mp3",
				"21.mp3",
				"22.mp3",
				"23.mp3",
				"24.mp3",
				"25.mp3",
				"26.mp3",
				"27.mp3",
				"28.mp3",
				"29.mp3",
				"3.mp3",
				"30.mp3",
				"31.mp3",
				"32.mp3",
				"33.mp3",
				"34.mp3",
				"35.mp3",
				"36.mp3",
				"37.mp3",
				"38.mp3",
				"39.mp3",
				"4.mp3",
				"40.mp3",
				"41.mp3",
				"42.mp3",
				"43.mp3",
				"44.mp3",
				"45.mp3" };
		String[] actuals = sut.playList(n);
		assertArrayEquals(expecteds, actuals);
	}

}