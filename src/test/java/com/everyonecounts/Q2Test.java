package com.everyonecounts;

import static org.junit.Assert.*;
import com.everyonecounts.Q2.Point;

import org.junit.Before;
import org.junit.Test;

public class Q2Test {

	private Q2 sut;
	
	@Before
	public void setUp(){
		sut = new Q2();
	}

	@Test
	public void testAnagram1() {
		String s1 = "foobar";
		String s2 = "raboof";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testAnagram2() {
		String s1 = "foobar";
		String s2 = "oof";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testAnagram3() {
		char[] value1 = new char[100 * (1 << 19)];
		char[] value2 = new char[100 * (1 << 19)];
		for (int i = 0; i < value1.length; i++) {
			value1[i] = 'a';
			value2[i] = 'b';
		}
		
		String s1 = new String(value1);
		String s2 = new String(value2);
		boolean actual = sut.anagram(s1, s2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagram4() {
		String s1 = "hydroxydeoxycorticosterones";
		String s2 = "hydroxydesoxycorticosterone";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagram5() {
		String s1 = "conversationalists";
		String s2 = "conservationalists";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagram6() {
		String s1 = "basiparachromatin";
		String s2 = "marsipobranchiata";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagram7() {
		String s1 = "";
		String s2 = "";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testAnagram8() {
		String s1 = "HYDROXYDEOXYCORTICOSTERONES";
		String s2 = "hydroxydesoxycorticosterone";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagram9() {
		String s1 = "CONSERVATIONALISTS";
		String s2 = "conservationalists";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagramA() {
		String s1 = "BASIPARACHROMATIN";
		String s2 = "marsipobranchiata";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAnagramB() {
		String s1 = "FOOBAR";
		String s2 = "foobar";
		boolean actual = sut.anagram(s1, s2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleCenter1() {
		byte[][] bitmap = new byte[8][1];
		bitmap[3][0] = 0x10;
		Point actual = sut.circleCenter(bitmap);
		Point expected = new Point(3, 3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter2() {
		byte[][] bitmap = new byte[64][8];
		bitmap[3][0] = 0x10;
		Point actual = sut.circleCenter(bitmap);
		Point expected = new Point(3, 3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter3() {
		// 00000000
		// 00011000
		// 00111100
		// 00011000
		// 00000000
		byte[][] bitmap = {
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x18, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x3c, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x18, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}
		};
		Point actual = sut.circleCenter(bitmap);
		Point expected = new Point(3, 2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter4() {
		// 00000000
		// 00011000
		// 00111100
		// 00011000
		// 00000000
		byte[][] bitmap = {
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x3c, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}
		};
		Point actual = sut.circleCenter(bitmap);
		Point expected = new Point(35, 5);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter5() {
		// 00011000
		// 00111100
		// 01111110
		// 00111100
		// 00011000
		byte[][] bitmap = {
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x3c, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x7e, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x3c, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00}
		};
		printBitmap(bitmap);
		Point actual = sut.circleCenter(bitmap);
		Point expected = new Point(35, 5);
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void testCircleCenter21() {
		byte[][] bitmap = new byte[8][1];
		bitmap[3][0] = 0x10;
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(3, 3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter22() {
		byte[][] bitmap = new byte[64][8];
		bitmap[3][0] = 0x10;
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(3, 3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter23() {
		// 00000000
		// 00011000
		// 00111100
		// 00011000
		// 00000000
		byte[][] bitmap = {
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x18, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x3c, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x18, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}
		};
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(3, 2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter24() {
		// 00000000
		// 00011000
		// 00111100
		// 00011000
		// 00000000
		byte[][] bitmap = {
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x3c, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}
		};
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(35, 5);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter25() {
		// 00011000
		// 00111100
		// 01111110
		// 00111100
		// 00011000
		byte[][] bitmap = {
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x3c, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x7e, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x3c, 0x00, 0x00, 0x00},
				{0x00, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00}
		};
		printBitmap(bitmap);
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(35, 5);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCircleCenter2a() {
		byte[][] bitmap = makeBitmap(8, 8, 3, 3, 2);
		printBitmap(bitmap);
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(3, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleCenter2b() {
		byte[][] bitmap = makeBitmap(24, 24, 12, 12, 7);
		printBitmap(bitmap);
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(12, 12);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleCenter2c() {
		byte[][] bitmap = makeBitmap(50, 50, 25, 25, 10);
		printBitmap(bitmap);
		Point actual = sut.circleCenter2(bitmap);
		Point expected = new Point(25, 25);
		assertEquals(expected, actual);
	}
	
	private byte[][] makeBitmap(int width, int height, int x, int y, int r) {
		int[][] map = new int[height][width];
		int r2 = r * r;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int y1 = Math.abs(y - i);
				int x1 = Math.abs(x - j);
				int xy2 = x1 * x1 + y1 * y1;
				if (xy2 <= r2) {
					map[i][j] = 1;
				} else {
					map[i][j] = 0;
				}
				
			}
		}
		
		byte[][] ret = new byte[height][width / 8 + 1];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				ret[i][j / 8] |= map[i][j] << 7 - j % 8;
			}
		}
		
		return ret;
	}

	private void printBitmap(byte[][] bitmap) {
		for (int i = 0; i < bitmap.length; i++) {
			for (int j = 0; j < bitmap[i].length; j++) {
				byte c = bitmap[i][j];
				for (int k = 0; k < 8; k++) {
					if ((c & 0x80 >>> k) > 0) {
						System.out.print("o");
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}
}
