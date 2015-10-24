package io.foo.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=8268">DukeOnChessBoard</a>
 */
public class DukeOnChessBoard {

	private final Logger logger = Logger.getLogger(DukeOnChessBoard.class);
	
	class Poz implements Comparable<Poz> {
		int col;
		int row;
		boolean visited;
		
		public List<Poz> getNbrs() {
			List<Poz> ret = new ArrayList<DukeOnChessBoard.Poz>();
			for (int i = -1; i <= 1; i++) {
				if (i == 0 || col + i < 0 || col + i >= board.length) {
					continue;
				} else {
					ret.add(board[col + i][row]);
				}
				
			}
			for (int i = -1; i <= 1; i++) {
				if (i == 0 || row + i < 0 || row + i >= board.length) {
					continue;
				} else {
					ret.add(board[col][row + i]);
				}
			}
			Collections.sort(ret);
			return ret;
		}

		@Override
		public String toString() {
			return String.format("%c%c", ('a' + col), ('1' + row));
		}

		@Override
		public int compareTo(Poz o) {
			return o.col - this.col == 0 ? o.row - this.row : o.col - this.col;
		}
	}
	Poz[][] board;
	
	public String dukePath(int n, String initPosition) {
		String ret = null;
		
		board = new Poz[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = new Poz();
				board[i][j].col = i;
				board[i][j].row = j;
			}
		}
		int col = initPosition.charAt(0) - 'a';
		int row = initPosition.charAt(1) - '1';
		Poz iPoz = board[col][row];
		iPoz.visited = true;
		
		Deque<Poz> queue = new LinkedList<>();
		queue.addLast(iPoz);
		
		while (!queue.isEmpty()) {
			Poz t = queue.peekLast();
			List<Poz> nbrs = t.getNbrs();
			boolean unvisitedNbrs = false;
			for (int i = 0; i < nbrs.size(); i++) {
				if (nbrs.get(i).visited == false) {
					nbrs.get(i).visited = true;
					queue.addLast(nbrs.get(i));
					unvisitedNbrs = true;
					break;
				}
			}
			if (!unvisitedNbrs) {
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		Iterator<Poz> it = queue.iterator();
		while (it.hasNext()) {
			sb.append(it.next().toString());
			if (it.hasNext()) {
				sb.append("-");
			}
		}
		
		if (sb.length() > 40) {
			sb.replace(20, sb.length() - 20, "...");
		}
		
		ret = sb.toString();
		return ret;
	}
	
	public String dukePath0(int n, String initPosition) {
		String ret = null;
		
		board = new Poz[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = new Poz();
				board[i][j].col = i;
				board[i][j].row = j;
			}
		}
		int col = initPosition.charAt(0) - 'a';
		int row = initPosition.charAt(1) - '1';
		Poz iPoz = board[col][row];
		iPoz.visited = true;
		
		Deque<Poz> path = new LinkedList<>();
		Deque<Poz> stack = new LinkedList<>();
		stack.push(iPoz);
		
		while (!stack.isEmpty()) {
			Poz t = stack.pop();
			path.push(t);
			List<Poz> nbrs = t.getNbrs();
			boolean unvisitedNbrs = false;
			for (int i = 0; i < nbrs.size(); i++) {
				if (nbrs.get(i).visited == false) {
					nbrs.get(i).visited = true;
					stack.push(nbrs.get(i));
					unvisitedNbrs = true;
				}
			}
			logger.debug("t: " + t + " stack: " + stack);
			if (!unvisitedNbrs) {
				logger.debug("path: " + path);
				for (Poz u : stack) {
					u.visited = false;
				}
				path.pop();
				//buildPathFromStack()
			}
		}
		return ret;
	}
}
