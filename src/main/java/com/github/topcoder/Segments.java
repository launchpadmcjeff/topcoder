package com.github.topcoder;


public class Segments {

	public String intersection(int[] s1, int[] s2) {
		String ret = null;
		Line l1 = new Line(s1);
		Line l2 = new Line(s2);
		if (l1.isVer() && l2.isVer()) {
			if (l1.p1.x == l2.p1.x) {
				if (l1.isYOn(l2.p1.y) || l1.isYOn(l2.p2.y)) {
					if (l1.p1.y == l2.p1.y || l1.p1.y == l2.p2.y || l1.p2.y == l2.p1.y || l1.p2.y == l2.p2.y) {
						ret = "POINT";
					} else {
						ret = "SEGMENT";
					}
				}
			} else {
				ret = "NO";
			}
		} else if (l1.isHor() && l2.isHor()) {
			if (l1.p1.y == l2.p1.y) {
				if (l1.isXOn(l2.p1.x) || l1.isXOn(l2.p2.x)) {
					if (l1.p1.x == l2.p1.x || l1.p1.x == l2.p2.x || l1.p2.x == l2.p1.x || l1.p2.x == l2.p2.x) {
						ret = "POINT";
					} else {
						ret = "SEGMENT";
					}
				}
			} else {
				ret = "NO";
			}
		} else if (l1.isVer() && l2.isHor()) {
			if (l2.isXOn(l1.p1.x) && l1.isYOn(l2.p1.y)) {
				ret = "POINT";
			} else {
				ret = "NO";
			}
		} else if (l1.isHor() && l2.isVer()) {
			if (l1.isXOn(l2.p1.x) && l2.isYOn(l1.p1.y)) {
				ret = "POINT";
			} else {
				ret = "NO";
			}
		}
		return ret;
	}
	
	private static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	private static class Line {
		Point p1;
		Point p2;
		public Line(int[] s1) {
			p1 = new Point(s1[0], s1[1]);
			p2 = new Point(s1[2], s1[3]);
		}
		boolean isVer() {
			return p1.x == p2.x;
		}
		boolean isHor() {
			return p1.y == p2.y;
		}
		boolean isXOn(int x) {
			if (p1.x <= p2.x) {
				return x >= p1.x && x <= p2.x;
			} else {
				return x >= p2.x && x <= p1.x;
			}
		}
		boolean isYOn(int y) {
			if (p1.y <= p2.y) {
				return y >= p1.y && y <= p2.y;
			} else {
				return y >= p2.y && y <= p1.y;
			}
		}
	}
}
