package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=8244">TurningLightOn</a>
 */
public class TurningLightOn {

	class Board {
		int[][] lights;
		
		Board(String[] board) {
			int rows = board.length;
			int cols = board[0].length();
			lights = new int[rows][cols];
			
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					int lit = board[i].charAt(j) - '0';
					lights[i][j] = lit;
				}
			}
		}
		
		boolean isLit() {
			boolean ret = true;
			for (int i = 0; i < lights.length; i++) {
				for (int j = 0; j < lights[0].length; j++) {
					if (lights[i][j] == 0) {
						return false;
					}
				}
			}
			return ret;
		}
		int[] furthestZero() {
			int[] ret = {-1, -1};
			for (int i = lights.length - 1; i >= 0; i--) {
				for (int j = lights[0].length - 1; j >= 0; j--) {
					if (lights[i][j] == 0) {
						ret[0] = i;
						ret[1] = j;
						return ret;
					}
				}
			}
			return ret;
		}
		
		void flip(int row, int col) {
			for (int i = 0; i <= row; i++) {
				for (int j = 0; j <= col; j++) {
					int luz = lights[i][j];
					if (luz == 0) {
						lights[i][j] = 1;
					} else {
						lights[i][j] = 0;
					}
				}
			}
		}
	}
	
	
	public int minFlips(String[] board) {
		int ret = 0;
		
		Board b = new Board(board);
		
		while (!b.isLit()) {
			int[] sw = b.furthestZero();
			b.flip(sw[0], sw[1]);
			ret++;
		}
		
		
		return ret;
	}
}
