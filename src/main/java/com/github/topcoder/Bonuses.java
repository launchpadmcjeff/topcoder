package com.github.topcoder;

import java.util.Arrays;


public class Bonuses {

	public int[] getDivision(int[] points) {
		int[] ret = new int[points.length];
		int[] pointsSorted = new int[points.length];
		int pool = 0;
		for (int i : points) {
			pool += i;
		}
		for (int i = 0; i < points.length; i++) {
			ret[i] = (int)((float)points[i] / (float) pool * 100);
		}
		int remainder = 100;
		for (int i : ret) {
			remainder -= i;
		}
		if (remainder > 0) {
			System.arraycopy(points, 0, pointsSorted, 0, pointsSorted.length);
			Arrays.sort(pointsSorted);
			
			for (int j = pointsSorted.length - 1; j >= pointsSorted.length - remainder; j--) {
				for (int i = 0; i < points.length; i++) {
					if (points[i] == pointsSorted[j]) {
						ret[i]++;
						points[i] = -1;
						break;
					}
				}
			}
			
		}
		return ret;
	}
	
	public int[] getDivision0(int[] points) {
		float pool = 0;
		int remainder = 100;
		int[] ret = new int[points.length];
		for (int i : points) {
			pool += i;
		}
		if (pool == 0) {
			return ret; // Just in case to avoid div/0
		}
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (int) (points[i] / pool * 100);
		}
		for (int i : ret) {
			remainder -= i;
		}
		
		int[] ret1 = new int[ret.length];
		System.arraycopy(ret, 0, ret1, 0, ret.length);
		
		int[] ret2 = new int[ret.length];
		System.arraycopy(ret, 0, ret2, 0, ret.length);
		Arrays.sort(ret2);
		
		for (int i = 0; i < ret2.length - remainder; i++) {
			ret2[i] = -1;
		}
		
		for (int i = 0; i < ret.length; i++) {
			for (int j = ret2.length - 1; j > ret2.length - remainder - 1; j--) {
				if (ret[i] == ret2[j]) {
					ret1[i]++;
					ret2[j] = -1;
					break;
				}
			}
		}
		
		return ret1;
	}
}
