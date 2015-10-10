package com.github.topcoder;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1694">QuipuReader</a>
 */
public class QuipuReader {
	public int[] readKnots(String[] knots) {
		return readKnotsTopSubmission(knots);
	}
	
	public int[] readKnots5(String[] knots) {
		int[] ret = new int[knots.length];
		boolean[] inU = new boolean[knots.length];
		boolean[] inV = new boolean[knots.length];
		int allDash = 0;

		for (int i = 0; i < knots[0].length(); i++) {
//			for (int j = 0; j < knots.length; j++) {
//				if (knots[j].charAt(i) == 'X') {
//					allDash = 0;
//					break;
//				}
//				if (j == knots.length - 1) {
//					allDash++;
//				}
//			}
//			if (allDash == 1) {
//				mb10(ret);
//				continue;
//			}
			if (i > 0) {
				for (int j = 0; j < knots.length; j++) {
					if (knots[j].charAt(i - 1) == 'X'
							&& knots[j].charAt(i) == '-') {
						inU[j] = true;
					} else if (knots[j].charAt(i - 1) == '-'
							&& knots[j].charAt(i) == 'X') {
						inU[j] = true;
					} else if (knots[j].charAt(i - 1) == '-'
							&& knots[j].charAt(i) == '-') {
						inU[j] = true;
					} else if (knots[j].charAt(i - 1) == 'X'
							&& knots[j].charAt(i) == 'X') {
						inU[j] = false;
					}
				}
				for (int j = 0; j < knots.length; j++) {
					if (!inU[j]) {
						break;
					}
					if (j == knots.length - 1) {
						mb10(ret);
					}
				}
			}
			for (int j = 0; j < knots.length; j++) {
				if (knots[j].charAt(i) == '-') {

				}
				if (knots[j].charAt(i) == 'X') {
					ret[j]++;
				}
			}
		}

		return ret;
	}
	
	public int[] readKnots4(String[] knots) {
		int[] ret = new int[knots.length];
		int allDash = 0;
		boolean[] inD = new boolean[knots.length];
		boolean[] inU = new boolean[knots.length];
		
		for (int i = 0; i < knots[0].length(); i++) {
			if (allDash == 1) {
				mb10(ret);
			}
			for (int j = 0; j < knots.length; j++) {
				if (knots[j].charAt(i) == 'X') {
					allDash = 0;
					break;
				}
				if (j == knots.length - 1) {
					allDash++;
				}
			}
			if (i > 0) {
				for (int j = 0; j < knots.length; j++) {
					if (knots[j].charAt(i - 1) == 'X' && knots[j].charAt(i) == '-') {
						inU[j] = false;
					}
				}
				
			}
			for (int j = 0; j < knots.length; j++) {
				if (knots[j].charAt(i) == '-') {
					
				}
				if (knots[j].charAt(i) == 'X') {
					ret[j]++;
				}
			}
			
		}
		
		return ret;
	}
	
	public int[] readKnots3(String[] knots) {
		int[] ret = new int[knots.length];
		boolean[] inM = new boolean[knots.length];
		boolean lastInM = false;
		
		for (int i = 0; i < knots[0].length(); i++) {
			if (lastInM) {
				for (int j = 0; j < inM.length; j++) {
					if (inM[j]) {
						break;
					}
					if (j == inM.length - 1) {
						for (int k = 0; k < ret.length; k++) {
							ret[k] = ret[k] * 10;
						}
						lastInM = true;
					}
				}
			}
			for (int j = 0; j < knots.length; j++) {
				if (knots[j].charAt(i) == 'X') {
					inM[j] = true;
					ret[j]++;
				}
				if (knots[j].charAt(i) == '-') {
					inM[j] = false;
				}
			}
		}
		
		return ret;
	}
	
	public int[] readKnots2(String[] knots) {
		int[] ret = new int[knots.length];
		int ll = -1;
		
		int qpLen = knots[0].length();
		for (int i = 0; i < qpLen; i++) {
			int j = 0;
			if (ll != -1) {
				j = ll;
			}
			while (j < knots.length) {
				if (knots[j].charAt(i) == 'X') {
					if (ll == -1) {
						ll = j;
					}
					ret[j]++;
				}
				if (knots[j].charAt(i) == '-') {
					if (ll == j) {
						ll = -1;
						if (i < qpLen - 1) {
							mb10(ret);
						}
					}
				}
			
				j++;
				if (j == knots.length && ll != -1) {
					j = 0;
				}
			}
		}
		
		
		return ret;
	}
	public int[] readKnots1(String[] knots) {
		int[] ret = new int[knots.length];
		boolean[] pz = new boolean[knots[0].length()];
		int[][] t = new int[knots.length][7];
		
		for (int i = 0; i < knots[0].length(); i++) {
			for (int j = 0; j < knots.length; j++) {
				if (knots[j].charAt(i) == 'X') {
					pz[i] = true;
				}
			}
		}
		
		return ret;
	}
	
	public int[] readKnots0(String[] knots) {
		int[] ret = new int[knots.length];
		int[][] t = new int[knots.length][7];
		
		boolean f = false;
		for (int j = 0; j < knots[0].length(); j++) {
			for (int i = 0; i < knots.length; i++) {

				if (!f && knots[i].charAt(j) == 'X') {
					f = true;
				}
//				if (f )
			}
		}
		
		return ret;
	}

	private void mb10(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = x[i] * 10;
		}
	}
	
	public int[] readKnotsTopSubmission(String[] knots) {
		int[] result = new int[knots.length];
		int[] curdig = new int[knots.length];
		boolean[] last = new boolean[knots.length];

		for (int i = 0; i < knots[0].length(); i++) {
			boolean newDig = true;
			for (int j = 0; j < knots.length; j++) {
				// if (!(!last[j] || (last[j] && knots[j].charAt(i) == '-'))) {
//				if (last[j] && (knots[j].charAt(i) != '-')) {
				if (last[j] && (knots[j].charAt(i) == 'X')) {
					newDig = false;
					break;
				}
			}

			boolean worthit = false;
			for (int j = 0; j < knots.length; j++) {
				if (curdig[j] != 0) {
					worthit = true;
					break;
				}
			}

			if (newDig && worthit) {
				for (int j = 0; j < knots.length; j++) {
					result[j] *= 10;
					result[j] += curdig[j];
					curdig[j] = 0;
				}
			}

			for (int j = 0; j < knots.length; j++) {
				if (knots[j].charAt(i) == 'X') {
					last[j] = true;
					curdig[j]++;
				} else {
					last[j] = false;
				}
			}
		}

		for (int j = 0; j < knots.length; j++) {
			if (knots[j].charAt(knots[0].length() - 1) == 'X') {
				for (int i = 0; i < knots.length; i++) {
					result[i] *= 10;
					result[i] += curdig[i];
				}
				break;
			}
		}

		return result;
	}
}
