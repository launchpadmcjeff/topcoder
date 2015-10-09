package com.github.topcoder;



public class Time {

	public String whatTime(int seconds) {
		int hrs = 0;
		int mins = 0;
		while (seconds >= 3600) {
			hrs++;
			seconds -= 3600;
		}
		while (seconds >= 60) {
			mins++;
			seconds -= 60;
		}
		return String.format("%d:%d:%d", hrs, mins, seconds);
	}
}
