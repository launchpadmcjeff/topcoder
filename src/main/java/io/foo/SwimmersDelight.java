package io.foo;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=4821">SwimmersDelight</a>
 */
public class SwimmersDelight {

	public int longestJump(int[] x, int[] y) {
		int ret = 100;
		double sts[] = new double[4];
		double t = 0.0;
		// 0,y0 -> x0,y0 -> 10,y0
		sts[0] = x[0];
		if (10 - x[0] > sts[0]) {
			sts[0] = 10 - x[0];
		}
		// 0,y1 -> x1,y1 -> 10,y1
		sts[1] = x[1];
		if (10 - x[1] > sts[1]) {
			sts[1] = 10 - x[1];
		}
		// 0,y0 -> x0,y0 -> x1,y1 -> 10,y1
		sts[2] = x[0];
		double hyp0 = Math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]));
		if (hyp0 > sts[2]) {
			sts[2] = hyp0;
		}
		if (10 - x[1] > hyp0) {
			sts[2] = 10 - x[1];
		}
		// 0,y1 -> x1,y1 -> x0,y0 -> 10,y0
		sts[3] = x[1];
		double hyp1 = Math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]));
		if (hyp1 > sts[3]) {
			sts[3] = hyp1;
		}
		if (10 - x[0] > hyp1) {
			sts[3] = 10 - x[0];
		}
		for (int i = 0; i < sts.length; i++) {
			if (Math.round(sts[i]) < ret) {
				ret = (int) Math.round(sts[i]);
			}
		}
		return ret;
	}
}
