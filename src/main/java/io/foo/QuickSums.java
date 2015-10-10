package io.foo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2829">QuickSums</a>
 */
public class QuickSums {

	Map<String, Integer> nums = new HashMap<>();
	
	public int minSums(String numbers, int sum) {
		long num = Long.parseLong(numbers);
		if (num < sum) {
			return -1;
		}
		if (sum == num) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for (int j = 1; j <= numbers.length(); j++) {
			int a = Integer.parseInt(numbers.substring(0, j));
			if (a == 0) {
				continue;
			}
			if (a > sum) {
				break;
			}
			int t = minSums(numbers.substring(j), sum - a);
			if (t != -1) {
				if (t + 1 < min) {
					min = t + 1;
				}
			}
		}

		return min < Integer.MAX_VALUE ? min : -1;
	}
		
	public int minSums3(String numbers, int sum) {
		if ("".equals(numbers)) {
			return -1;
		}

		try {
			int parseInt = Integer.parseInt(numbers);
			if (parseInt == sum) {
				return 0;
			}
			if (parseInt > sum) {
				return 0;
			}
		} catch (NumberFormatException e) {
			// ignore
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length(); i++) {
			for (int j = i + 1; j <= numbers.length(); j++) {
				int a = Integer.parseInt(numbers.substring(i, j));
				if (a > sum ) {
					break;
				}
				if (a == 0) {
					continue;
				}
				int t = minSums(numbers.substring(j), sum - a);
				if (t != -1) {
					if (t + 1 < min) {
						min = t + 1;
					}
				}
			}
		}

		return min < Integer.MAX_VALUE ? min : -1;
	}
	
	public int minSums2(String numbers, int sum) {
		if (numbers.equals("") && sum != 0) {
			return -1;
		}
		int a = Integer.parseInt(numbers);
		if (a == sum) {
			return 0;
		}
		int b = 0;
		for (int i = 1; i < numbers.length(); i++) {
			b = Integer.parseInt(numbers.substring(numbers.length() - i));
			
		}
		return minSums(numbers.substring(0, numbers.length() - 1), sum - b);
	}
	
	public int minSums1(String numbers, int sum) {
		int ret = 0;
		List<List<Long>> nums = new ArrayList<>();
		for (int i = 0; i < numbers.length(); i++) {
			nums.add(new ArrayList<Long>());
			for (int j = i + 1; j <= numbers.length(); j++) {
				String v = numbers.substring(i, j);
				Long num = Long.valueOf(v);
				if (num > sum) {
					break;
				}
				nums.get(i).add(num);
			}
		}
		return ret;
	}
}
