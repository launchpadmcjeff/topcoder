package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=10033">PrimeSoccer</a>
 */
public class PrimeSoccer {

	public double getProbability(int skillOfTeamA, int skillOfTeamB) {
		double ret = 0.0;
		int[] primesInRange = new int[] {2, 3, 5, 7, 11, 13, 17}; //length = 7
		int[] nonprimesInRg = new int[] {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18}; // length = 12
		
		for (int i = 0; i <= 18; i++) {
			
			// calculate probability of final result i for each team and sum results?
			
		}
		
		return ret;
	}
}
