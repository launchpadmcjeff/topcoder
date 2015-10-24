package io.foo.a;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=8157">CountExpressions</a>
 */
public class CountExpressions {

	public int calcExpressions(int x, int y, int val) {
		int ret = 0;
		int[] nums = new int[] { x, y };
		char[] ops = new char[] { '+', '-', '*' };
		List<Integer[]> numExp = new ArrayList<>();
		List<Character[]> oprExp = new ArrayList<>();

		for (int i = 0; i < 16; i++) {
			Integer[] as = new Integer[4];
			if (Integer.bitCount(i) != 2) {
				continue;
			}
			for (int j = 0; j < 4; j++) {
				as[j] = nums[i >>> j & 1];
			}
			numExp.add(as);
		}

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				for (int c = 0; c < 3; c++) {
					Character[] ca = new Character[3];
					ca[0] = ops[a];
					ca[1] = ops[b];
					ca[2] = ops[c];
					oprExp.add(ca);
				}
			}
		}
		for (int i = 0; i < numExp.size(); i++) {
			for (int j = 0; j < oprExp.size(); j++) {
				Deque<Integer> stack = new LinkedList<>();
				for (Integer ii : numExp.get(i)) {
					stack.addLast(ii);
				}
				Character[] o = oprExp.get(j);
				for (int oi = 0; oi < o.length; oi++) {
					int l = stack.pop();
					int r = stack.pop();
					int e = 0;
					switch (o[oi]) {
					case '+':
						e = l + r;
						break;
					case '-':
						e = l - r;
						break;
					case '*':
						e = l * r;
						break;
					
					}
					stack.push(e);
				}
				if (stack.pop() == val) {
					ret++;
				}
			}
		}
		return ret;
	}
}
