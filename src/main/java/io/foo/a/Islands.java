package io.foo.a;

import java.util.ArrayList;
import java.util.List;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=10874">Islands</a>
 */
public class Islands {
	HexArea[][] map;
	enum Topo {LAND, SEA};
	class HexArea {
		@Override
		public String toString() {
			return "HexArea [type=" + type + ", i=" + i + ", j=" + j + "]";
		}
		Topo type;
		int i;
		int j;
		public HexArea(int i, int j) {
			this.i = i;
			this.j = j;
		}

		HexArea get1() {
			HexArea ret = null;
			if (i % 2 == 0) {
				if (i - 1 >= 0) {
					ret = map[i - 1][j];
				}
			} else {
				if (i - 1 >= 0 && j + 1 < map[0].length) {
					ret = map[i - 1][j + 1];
				}
			}
			return ret;
		}
		HexArea get2() {
			HexArea ret = null;
			if (j + 1 < map[0].length) {
				ret = map[i][j + 1];
			}
			return ret;
		}
		HexArea get3() {
			HexArea ret = null;
			if (i % 2 == 0) {
				if (i + 1 < map.length) {
					ret = map[i + 1][j];
				}
			} else {
				if (i + 1 < map.length && j + 1 <= map[0].length) {
					ret = map[i + 1][j + 1];
				}
			}
			return ret;
		}

		HexArea get4() {
			HexArea ret = null;
			if (i % 2 == 0) {
				if (i + 1 < map.length && j - 1 >= 0) {
					ret = map[i + 1][j - 1];
				}
			} else {
				if (i + 1 < map.length) {
					ret = map[i + 1][j];
				}
			}
			return ret;
		}
		HexArea get5() {
			HexArea ret = null;
			if (j - 1 >= 0) {
				ret = map[i][j - 1];
			}
			return ret;
		}
		HexArea get6() {
			HexArea ret = null;
			if (i % 2 == 0) {
				if (i - 1 >= 0 && j - 1 >= 0) {
					ret = map[i - 1][j - 1];
				}
			} else {
				if (i - 1 >= 0) {
					ret = map[i - 1][j];
				}
			}
			return ret;
		}
	}
	int beachLength(String[] kingdom) {
		int ret = 0;
		map = new HexArea[kingdom.length][kingdom[0].length()];
		
		for (int i = 0; i < kingdom.length; i++) {
			char[] ch = kingdom[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				HexArea t = new HexArea(i, j);
				if (ch[j] == '.') {
					t.type = Topo.SEA;
				} else {
					t.type = Topo.LAND;
				}
				map[i][j] = t;
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				HexArea t = map[i][j];
				if (t.type == Topo.LAND) {
					if (t.get1() != null && t.get1().type == Topo.SEA) {
						ret++;
					}
					if (t.get2() != null && t.get2().type == Topo.SEA) {
						ret++;
					}
					if (t.get3() != null && t.get3().type == Topo.SEA) {
						ret++;
					}
					if (t.get4() != null && t.get4().type == Topo.SEA) {
						ret++;
					}
					if (t.get5() != null && t.get5().type == Topo.SEA) {
						ret++;
					}
					if (t.get6() != null && t.get6().type == Topo.SEA) {
						ret++;
					}
				}
			}
		}
		
		return ret;
	}
}
