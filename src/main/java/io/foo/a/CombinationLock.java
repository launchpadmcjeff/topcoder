package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1945">CombinationLock</a>
 */
public class CombinationLock {

	class Master {
		boolean dir;
		int sz;
		int strt;
		int n;

		Master(int sz, int strt, int n) {
			this.sz = sz;
			this.strt = strt;
			this.n = n;
		}

		double putCombo(int combo) {
			double ret = 0.0;

			ret += 360.0 * n;
			if (!dir) {
				if (combo > strt) {
					ret += (combo - strt) * (360 / sz);
				} else {
					ret += (sz - strt) * (360 / sz) + combo * (360 / sz);
				}
			} else {
				if (combo < strt) {
					ret += (strt - combo) * (360 / sz);
				} else {
					ret += strt * (360 / sz) + (sz - combo) * (360 / sz);
				}
			}

			strt = combo;
			n--;
			dir = !dir;

			return ret;
		}
	}

	public double degreesTurned(int[] combo, int size, int start) {
		double ret = 0.0;
		Master lock = new Master(size, start, combo.length);

		for (int i : combo) {
			ret += lock.putCombo(i);
		}

		return ret;
	}
}
