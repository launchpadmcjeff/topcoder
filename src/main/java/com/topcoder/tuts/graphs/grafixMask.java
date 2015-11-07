package com.topcoder.tuts.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @see <a href="https://community.topcoder.com/stat?c=problem_statement&pm=2998&rd=5857">grafixMask.java</a>
 *
 */
public class grafixMask {
	final int ROWS = 400;
	final int COLS = 600;
	final int MASKED = 0x01;
	final int FOUND = 0x02;
	int[][] mask = new int[ROWS][COLS]; // bit0 is masked; bit1 is discovered
	class Node {
		int row;
		int col;
		public Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
		public List<Node> getNodes() {
			List<Node> ret = new ArrayList<>();
			if (row > 0) {
				ret.add(new Node(row - 1, col));
			}
			if (col < COLS - 1) {
				ret.add(new Node(row, col + 1));
			}
			if (row < ROWS - 1) {
				ret.add(new Node(row + 1, col));
			}
			if (col > 0) {
				ret.add(new Node(row, col - 1));
			}
			return ret;
		}
	}
	
	public int[] sortedAreas(String[] rectangles) {
		for (int a = 0; a < rectangles.length; a++) {
			String[] rect = rectangles[a].split("\\s+");
			int row1 = Integer.parseInt(rect[0]);
			int col1 = Integer.parseInt(rect[1]);
			int row2 = Integer.parseInt(rect[2]);
			int col2 = Integer.parseInt(rect[3]);
			
			for (int i = row1; i <= row2; i++) {
				for (int j = col1; j <= col2; j++) {
					mask[i][j] |= MASKED;
				}
			}
		}
		List<Integer> areas = new ArrayList<>();
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if ((mask[i][j] & MASKED) == 0 && (mask[i][j] & FOUND) == 0) {
					areas.add(bfsFill(new Node(i, j)));
				}
			}
		}
		Collections.sort(areas);
		int[] ret = new int[areas.size()];
		for (int i = 0; i < areas.size(); i++) {
			ret[i] = areas.get(i);
		}
		return ret;
	}
	
	private Integer bfsFill(Node s) {
		int ret = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(s);
		mask[s.row][s.col] |= FOUND;
		while (!q.isEmpty()) {
			Node n = q.remove();
			ret++;
			for (Node i : n.getNodes()) {
				if ((mask[i.row][i.col] & MASKED) == 0 && (mask[i.row][i.col] & FOUND) == 0) {
					q.add(i);
					mask[i.row][i.col] |= FOUND;
				}
			}
		}
		return ret;
	}
}
