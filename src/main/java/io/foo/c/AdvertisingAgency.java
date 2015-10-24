package io.foo.c;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=7558">AdvertisingAgency</a>
 */
public class AdvertisingAgency {
	public int numberOfRejections(int[] requests) {
		int ret = 0;
		boolean[] bbs = new boolean[101];
		for (int i = 0; i < requests.length; i++) {
			int bb = requests[i];
			if (bbs[bb] == false) {
				bbs[bb] = true;
			} else {
				ret++;
			}
		}
		
		return ret;
	}
}
