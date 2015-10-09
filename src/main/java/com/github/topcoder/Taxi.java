package com.github.topcoder;


public class Taxi {

	public double maxDis(int maxX, int maxY, int taxiDis) {
		double ret = 0.0;
		if (maxX + maxY < taxiDis) {
			return -1.0;
		}
		if (taxiDis < maxX || taxiDis < maxY) {
			return taxiDis;
		}
		if (maxX > maxY) {
			long adj = maxX;
			long opp = taxiDis - maxX;
			ret = Math.sqrt(adj * adj + opp * opp);
		} else {
			long adj = maxY;
			long opp = taxiDis - maxY;
			ret = Math.sqrt(adj * adj + opp * opp);
		}
		return ret;
	}
}
