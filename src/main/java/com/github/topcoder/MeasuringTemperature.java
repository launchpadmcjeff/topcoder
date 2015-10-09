package com.github.topcoder;

import java.util.ArrayList;
import java.util.List;


public class MeasuringTemperature {

	public double averageTemperature(int[] measuredValues) {
		double ret = 0.0;
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < measuredValues.length; i++) {
			if (measuredValues[i] < -273) {
				continue;
			} else if (i >= 2 && i < measuredValues.length - 2) {
				if (Math.abs(measuredValues[i - 2] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i - 1] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i + 1] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i + 2] - measuredValues[i]) <= 2) {
					sum += measuredValues[i];
					cnt++;
				}
				continue;
			} else if (i == 1) {
				if (Math.abs(measuredValues[i - 1] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i + 1] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i + 2] - measuredValues[i]) <= 2) {
					sum += measuredValues[i];
					cnt++;
				}
				continue;
			} else if (i == 0) {
				if (Math.abs(measuredValues[i + 1] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i + 2] - measuredValues[i]) <= 2) {
					sum += measuredValues[i];
					cnt++;
				}
				continue;
			} else if (i == measuredValues.length - 1) {
				if (Math.abs(measuredValues[i - 2] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i - 1] - measuredValues[i]) <= 2) {
					sum += measuredValues[i];
					cnt++;
				}
				continue;
			} else if (i == measuredValues.length - 2) {
				if (Math.abs(measuredValues[i - 2] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i - 1] - measuredValues[i]) <= 2
						|| Math.abs(measuredValues[i + 1] - measuredValues[i]) <= 2) {
					sum += measuredValues[i];
					cnt++;
				}
				continue;
			}
		}
		ret = (double) sum / (double) cnt;
		
		return Double.isNaN(ret) || Double.isInfinite(ret) ? -300.0 : ret;
	}
}
