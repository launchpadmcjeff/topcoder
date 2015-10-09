package com.github.topcoder;

public class BinaryCode {

	public String[] decode(String message) {
		String[] ret = new String[2];
		int[] Q = new int[message.length()];
		int[] P0 = new int[message.length()];
		int[] P1 = new int[message.length()];
		for (int i = 0; i < message.length(); i++) {
			Q[i] = message.charAt(i) - '0';
		}

		P0[0] = 0; // First assumption
		for (int i = 1; i < message.length(); i++) {
			if (i == 1) {
				P0[i] = Q[i - 1] - P0[i - 1];
				if (P0[i] < 0 || P0[i] > 2) {
					ret[0] = "NONE";
					break;
				}
			} else {
				P0[i] = Q[i - 1] - P0[i - 2] - P0[i - 1];
				if (P0[i] < 0 || P0[i] > 3) {
					ret[0] = "NONE";
					break;
				}
			}
		}
		if (ret[0] == null) {
			try {
				ret[0] = Q[message.length() - 1] == P0[message.length() - 2]
						+ P0[message.length() - 1] ? intArr2String(P0) : "NONE";

			} catch (Exception e) {
				ret[0] = "NONE";
			}
		}

		P1[0] = 1; // Second Assumption
		for (int i = 1; i < message.length(); i++) {
			if (i == 1) {
				P1[i] = Q[i - 1] - P1[i - 1];
				if (P1[i] < 0 || P1[i] > 2) {
					ret[1] = "NONE";
					break;
				}
			} else {
				P1[i] = Q[i - 1] - P1[i - 2] - P1[i - 1];
				if (P1[i] < 0 || P1[i] > 3) {
					ret[1] = "NONE";
					break;
				}
			}
		}
		if (ret[1] == null) {
			try {
				ret[1] = Q[message.length() - 1] == P1[message.length() - 2]
						+ P1[message.length() - 1] ? intArr2String(P1) : "NONE";
			} catch (Exception e) {
				ret[1] = "NONE";
			}
		}
		return ret;
	}

	private String intArr2String(int[] in) {
		StringBuilder sb = new StringBuilder();
		for (int i : in) {
			sb.append(i);
		}
		return sb.toString();
	}
}
