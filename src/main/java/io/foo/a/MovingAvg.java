package io.foo.a;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=3495">MovingAvg</a>
 */
public class MovingAvg {
	public double difference(int k, double[] data) {
		double lrg = 0.0;
		double sml = -1.0;
		
		for (int i = 0; i + k <= data.length; i++) {
			double t = 0.0;
			for (int j = 0; j < k; j++) {
				t += data[i + j];
			}
			
			double u = 0.0;
			u = t / k;
			
			if (u < sml || i == 0) {
				sml = u;
			}
			if (u > lrg) {
				lrg = u;
			}
		}
		
		
		return lrg - sml;
	}
}