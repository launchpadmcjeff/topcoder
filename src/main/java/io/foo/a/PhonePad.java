package io.foo.a;

import java.util.HashMap;
import java.util.Map;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=4464">PhonePad</a>
 */
public class PhonePad {

	class Pair {
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int dist(Pair pair) {
			int ret = 0;
			ret += Math.abs(this.x - pair.x);
			ret += Math.abs(this.y - pair.y);
			return ret;
		}
	}
	
	Map<Character, Pair> map = new HashMap<>();
	{
		map.put('1', new Pair(0,0));
		map.put('2', new Pair(0,1));
		map.put('3', new Pair(0,2));
		map.put('4', new Pair(1,0));
		map.put('5', new Pair(1,1));
		map.put('6', new Pair(1,2));
		map.put('7', new Pair(2,0));
		map.put('8', new Pair(2,1));
		map.put('9', new Pair(2,2));
		map.put('*', new Pair(3,0));
		map.put('0', new Pair(3,1));
		map.put('#', new Pair(3,2));
	}
	public int fingerMovement(String phoneNumber) {
		int ret = 0;
		
		Pair p = map.get('5');
		for (int i = 0; i < phoneNumber.length(); i++) {
			Pair t = map.get(phoneNumber.charAt(i));
			ret += p.dist(t);
			p = t;
		}
		
		
		return ret;
	}
}
