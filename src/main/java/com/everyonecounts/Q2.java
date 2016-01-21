package com.everyonecounts;

import java.util.Arrays;

public class Q2 {

//	1. Write a function to determine if two strings of unknown length (but
//
//			not longer than 100 MB each) are anagrams of each other, that is, 
//
//			contain exactly the same number of each letter of the alphabet. It should 
//
//			be case insensitive, should ignore all characters but the 26 letters of the 
//
//			English alphabet, should be very time-efficient, and should be space-
//			efficient. Include a brief explanation of why and how it works 
//
//			efficiently. Include tests if you have time.
	/**
	 * The algorithm simply scans the strings a few times taking advantage of
	 * expected cpu cache hits associated with sequential scanning, resulting
	 * in an overall complexity of O(n) in the length of the input strings.
	 */
	public boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) { // reduce constant factor for some inputs
			return false;
		}
		if (s1.length() > (100 * (1 << 19))) { // reduce constant factor for some inputs
			// this was stipulated in the description of not longer than 100MB
			throw new RuntimeException("maxlength must be less than 100MB");
		}
		
		// space complexity could be reduced here by dispensing with the arrays
		// and using String.charAt(); the tradeoff being additional function call overhead.
		// Simple testing shows a few millis better time with the arrays on the largest
		// possible inputs.
		char[] s1bytes = s1.toCharArray(); // O(|s1|)
		char[] s2bytes = s2.toCharArray(); // O(|s2|)
		
		int[] s1CharCnt = new int[26]; // O(1)
		int[] s2CharCnt = new int[26]; // O(1)
		
		for (int i = 0; i < s1bytes.length; i++) { // O(|s1|)
			int c = -1;
			if (s1bytes[i] >= 'A' && s1bytes[i] <= 'Z') {
				c = s1bytes[i] - 'A';
			} else if (s1bytes[i] >= 'a' && s1bytes[i] <= 'z') {
				c = s1bytes[i] - 'a';
			} else {
				continue;
			}
			s1CharCnt[c]++;
		}
		
		for (int i = 0; i < s2bytes.length; i++) { // O(|s2|)
			int c = -1;
			if (s2bytes[i] >= 'A' && s2bytes[i] <= 'Z') {
				c = s2bytes[i] - 'A';
			} else if (s2bytes[i] >= 'a' && s2bytes[i] <= 'z') {
				c = s2bytes[i] - 'a';
			} else {
				continue;
			}
			s2CharCnt[c]++;
		}
		
		for (int i = 0; i < 26; i++) { // O(1) in relation to input size
			if (s1CharCnt[i] != s2CharCnt[i]) {
				return false;
			}
		}
		return true;
	}
	
	/*
	2. Given a 2 dimensional array of arbitrary size representing a bitmap 
	
	image (0=white, 1=black) you are promised that it is all white except for 
	
	one solid filled black circle, of unknown size, completely included in the 
	
	bitmap somewhere. Write a function that efficiently finds the center of 
	
	the circle and returns its xy coordinates. Include a brief explanation of 
	
	why and how it works efficiently. Include tests if you have time.
	*/
	/**
	 * This algorithm works by scanning the bits of the bitmap arg and noting
	 * the most extreme values for the top, bottom, left, and right black bits.
	 * It then computes and returns the midpoints in the horizontal and vertical.
	 * Despite the nested loops, it is only examining each bit once, so it is
	 * O(n) in the number of bits in bitmap.  It is space efficient by using
	 * the smallest possible representation for the bitmap bits.  The constant
	 * factor might possibly be reduced by performing a fill starting from the
	 * first black node found, thus eliminating some fraction of the search space.
	 */
	public Point circleCenter(byte[][] bitmap) {
		Point ret = new Point(0, 0);
		
		Point top = null;
		Point bot = null;
		Point lft = null;
		Point rgt = null;
		
		int width = bitmap[0].length;
		int height = bitmap.length;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				byte c = bitmap[i][j];
				for (int k = 0; k < 8; k++) {
					Point p = null;
					if ((c & 0x80 >> k) > 0) {
						p = makePoint(i, j, k, width * 8);
					} else {
						continue;
					}
					if (top == null || top.y > p.y) {
						top = p;
					}
					if (bot == null || bot.y < p.y) {
						bot = p;
					}
					if (lft == null || lft.x > p.x) {
						lft = p;
					}
					if (rgt == null || rgt.x < p.x) {
						rgt = p;
					}
				}
			}
		}
		ret.x = (lft.x + rgt.x) / 2;
		ret.y = (top.y + bot.y) / 2;
		
		return ret;
	}
	
	public Point circleCenter2(byte[][] bitmap) {
		Point ret = new Point(-1, -1);
		if (bitmap.length == 0) {
			return ret;
		}
		int mid = bitmap.length / 2;
		int left = -1;
		int rght = -1;
		for (int i = 0; i < bitmap[mid].length; i++) {
			byte c = bitmap[mid][i];
			for (int j = 0; j < 8; j++) {
				if ((c & 0x80 >>> j) > 0) {
					if (left == -1) {
						left = i * 8 + j;
					}
				} else if (left != -1) {
					if (rght == -1) {
						rght = i * 8 + j - 1;
					}
				}
			}
		}
		
		if (left != -1 && rght != -1) {
			int cntr = (left + rght) / 2;
			int top = -1;
			int bot = -1;
			for (int i = 0; i < bitmap.length; i++) {
				byte c = bitmap[i][cntr / 8];
				if ((c & 0xff) != 0) {
					if (top == -1) {
						top = i;
					} else if (i == bitmap.length - 1) {
						bot = i;
					}
				} else if (top != -1) {
					if (bot == -1) {
						bot = i - 1;
					}
				}
			}
			ret = new Point(cntr, (top + bot) / 2);
		} else {
			if (mid > 0) {
				Point a = circleCenter2(Arrays.copyOfRange(bitmap, 0, mid));
				// a.x++;
				// a.y++;
				if (!a.equals(ret)) {
					return a;
				}
			}
			if (bitmap.length > mid) {
				Point b = circleCenter2(Arrays.copyOfRange(bitmap, mid,
						bitmap.length));
				// b.x++;
				// b.y++;
				if (!b.equals(ret)) {
					return b;
				}
			}
		}
		
		return ret;
	}

	private Point makePoint(int i, int j, int k, int width) {
		int x = (j * 8 + k) % width;
		int y = i;
		
		return new Point(x, y);
	}

	public static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
	}
}
