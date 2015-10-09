package com.github.topcoder;


public class PassingGrade {

	public int pointsNeeded(int[] pointsEarned, int[] pointsPossible, int finalExam) {
		int ret = 0;
		
		int pe = 0;
		int pt = 0;
		
		for (int i : pointsEarned) {
			pe += i;
		}
				
		for (int i : pointsPossible) {
			pt += i;
		}
		pt += finalExam;
		

		while (((double)(pe + ret) / pt) < 0.65) {
			if (ret > finalExam) {
				ret = -1;
				break;
			}
			ret++;
		}
		
		
		return ret;
	}
}
