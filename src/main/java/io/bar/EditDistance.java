package io.bar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EditDistance {

	public int stringCompare(String s, String t, int i, int j) {
		Map<String, Integer> opt = new HashMap<>();
		
		if (i == 0) {
			return j * indel(' ');
		}
		if (j == 0) {
			return i * indel(' ');
		}
		opt.put("MATCH", stringCompare(s, t, i - 1, j - 1) + match(s.charAt(i - 1), t.charAt(j - 1)));
		opt.put("INSERT", stringCompare(s, t, i, j - 1) + indel(t.charAt(j - 1)));
		opt.put("DELETE", stringCompare(s, t, i - 1, j) + indel(s.charAt(i - 1)));



		int lowestCost = opt.get("MATCH");
		if (opt.get("INSERT") < lowestCost) {
			lowestCost = opt.get("INSERT");
		}
		if (opt.get("DELETE") < lowestCost) {
			lowestCost = opt.get("DELETE");
		}
		return lowestCost;
	}

	private int match(char charAt, char charAt2) {
		return charAt == charAt2 ? 0 : 1;
	}

	private int indel(char c) {
		return 1;
	}
	
	public class Cell {
		int cost;
		String parent;
		@Override
		public String toString() {
			return cost + "/" + parent;
		}
	}
	
	Cell[][] m;
	
	public int stringCompareDP(String s, String t) {
		Map<String, Integer> opt = new HashMap<>();
		
		int maxlen = Math.max(s.length(), t.length());
		initM(maxlen);
		for (int i = 0; i <= maxlen; i++) {
			rowInit(i);
			colInit(i);
		}
		
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				opt.put("MATCH", m[i - 1][j - 1].cost + match(s.charAt(i - 1), t.charAt(j - 1)));
				opt.put("INSERT", m[i][j - 1].cost + indel(t.charAt(j - 1)));
				opt.put("DELETE", m[i - 1][j].cost + indel(s.charAt(i - 1)));
				
				m[i][j].cost = opt.get("MATCH");
				m[i][j].parent = "MATCH";
				for (String k : new String[]{"INSERT", "DELETE"}) {
					if (opt.get(k) < m[i][j].cost) {
						m[i][j].cost = opt.get(k);
						m[i][j].parent = k;
					}
				}
			}
		}
		
		
		return m[s.length()][t.length()].cost;
	}
	
	private void initM(int maxlen) {
		m = new Cell[maxlen + 1][maxlen + 1];
		for (int i = 0; i <= maxlen; i++) {
			for (int j = 0; j <= maxlen; j++) {
				m[i][j] = new Cell();
			}
		}
	}
	
	public void rowInit(int i) {
		m[0][i].cost = i;
		if (i > 0) {
			m[0][i].parent = "INSERT";
		} else {
			m[0][i].parent = null;
		}
	}
	
	public void colInit(int i) {
		m[i][0].cost = i;
		if (i > 0) {
			m[i][0].parent = "DELETE";
		} else {
			m[i][0].parent = null;
		}
	}
	
	public void reconstructPath(String s, String t, int i, int j) {
		if (m[i][j].parent == null) {
			return;
		}
		if ("MATCH".equals(m[i][j].parent)) {
			reconstructPath(s, t, i - 1, j - 1);
			matchOut(s, t, i, j);
			return;
		}
		if ("INSERT".equals(m[i][j].parent)) {
			reconstructPath(s, t, i, j - 1);
			insertOut(t, j);
			return;
		}
		if ("DELETE".equals(m[i][j].parent)) {
			reconstructPath(s, t, i - 1, j);
			deleteOut(s, i);
			return;
		}
	}

	private void deleteOut(String s, int i) {
		System.out.print("D");
	}

	private void insertOut(String t, int j) {
		System.out.print("I");
	}

	private void matchOut(String s, String t, int i, int j) {
		if (s.charAt(i - 1) == t.charAt(j - 1)) {
			System.out.print("M");
		} else {
			System.out.print("S");
		}
	}
}
