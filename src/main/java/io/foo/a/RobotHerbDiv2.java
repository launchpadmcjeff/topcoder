package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=12425">RobotHerbDiv2</a>
 */
public class RobotHerbDiv2 {

	public int getdist(int T, int[] a) {
		int ret = 0;
		int[] dir = {0, 0, 0, 0};
		int rot = 0;
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < a.length; j++) {
				dir[rot] += a[j];
				rot = (rot + a[j]) % 4;
				
			}
		}
		ret = Math.abs(dir[0] - dir[2]) + Math.abs(dir[1] - dir[3]);
		return ret;
	}
}
