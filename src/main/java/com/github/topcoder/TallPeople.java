package com.github.topcoder;


public class TallPeople {

	public int[] getPeople(String[] people) {
		int[] ret = new int[2];
		int cols = people[0].split(" ").length;
		int[] shrts = new int[people.length];
		int[] talls = new int[cols];
		
		int[][] f = new int[people.length][cols];
		
		for (int i = 0; i < people.length; i++) {
			String[] t = people[i].split(" ");
			for (int j = 0; j < cols; j++) {
				f[i][j] = Integer.parseInt(t[j]);
			}
		}
		
		int sir = 0;
		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < cols; j++) {
				if (sir == 0 || f[i][j] < sir) {
					sir = f[i][j];
				}
			}
			shrts[i] = sir;
			sir = 0;
		}
		
		int tic = 0;
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < people.length; j++) {
				if (tic == 0 || f[j][i] > tic) {
					tic = f[j][i];
				}
			}
			talls[i] = tic;
			tic = 0;
		}
		
		for (int i = 0; i < shrts.length; i++) {
			if (ret[0] == 0 || ret[0] < shrts[i]) {
				ret[0] = shrts[i];
			}
		}
		
		for (int i = 0; i < talls.length; i++) {
			if (ret[1] == 0 || ret[1] > talls[i]) {
				ret[1] = talls[i];
			}
		}
		
		return ret;
	}
}
