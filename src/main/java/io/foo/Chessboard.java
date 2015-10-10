package io.foo;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=7576">Chessboard</a>
 */
public class Chessboard {

	public String changeNotation(String cell) {
		String ret = "";
		if (cell.matches("\\d\\d?")) {
			int c = Integer.parseInt(cell);
			switch (c) {
			case 1: ret = "a1"; break;
			case 2: ret = "b1"; break;
			case 3: ret = "c1"; break;
			case 4: ret = "d1"; break;
			case 5: ret = "e1"; break;
			case 6: ret = "f1"; break;
			case 7: ret = "g1"; break;
			case 8: ret = "h1"; break;
			case 9: ret = "a2"; break;
			case 10: ret = "b2"; break;
			case 11: ret = "c2"; break;
			case 12: ret = "d2"; break;
			case 13: ret = "e2"; break;
			case 14: ret = "f2"; break;
			case 15: ret = "g2"; break;
			case 16: ret = "h2"; break;
			case 17: ret = "a3"; break;
			case 18: ret = "b3"; break;
			case 19: ret = "c3"; break;
			case 20: ret = "d3"; break;
			case 21: ret = "e3"; break;
			case 22: ret = "f3"; break;
			case 23: ret = "g3"; break;
			case 24: ret = "h3"; break;
			case 25: ret = "a4"; break;
			case 26: ret = "b4"; break;
			case 27: ret = "c4"; break;
			case 28: ret = "d4"; break;
			case 29: ret = "e4"; break;
			case 30: ret = "f4"; break;
			case 31: ret = "g4"; break;
			case 32: ret = "h4"; break;
			case 33: ret = "a5"; break;
			case 34: ret = "b5"; break;
			case 35: ret = "c5"; break;
			case 36: ret = "d5"; break;
			case 37: ret = "e5"; break;
			case 38: ret = "f5"; break;
			case 39: ret = "g5"; break;
			case 40: ret = "h5"; break;
			case 41: ret = "a6"; break;
			case 42: ret = "b6"; break;
			case 43: ret = "c6"; break;
			case 44: ret = "d6"; break;
			case 45: ret = "e6"; break;
			case 46: ret = "f6"; break;
			case 47: ret = "g6"; break;
			case 48: ret = "h6"; break;
			case 49: ret = "a7"; break;
			case 50: ret = "b7"; break;
			case 51: ret = "c7"; break;
			case 52: ret = "d7"; break;
			case 53: ret = "e7"; break;
			case 54: ret = "f7"; break;
			case 55: ret = "g7"; break;
			case 56: ret = "h7"; break;
			case 57: ret = "a8"; break;
			case 58: ret = "b8"; break;
			case 59: ret = "c8"; break;
			case 60: ret = "d8"; break;
			case 61: ret = "e8"; break;
			case 62: ret = "f8"; break;
			case 63: ret = "g8"; break;
			case 64: ret = "h8"; break;
			}
			
		} else {
			switch (cell) {
			case "a1": ret = "1"; break;
			case "b1": ret = "2"; break;
			case "c1": ret = "3"; break;
			case "d1": ret = "4"; break;
			case "e1": ret = "5"; break;
			case "f1": ret = "6"; break;
			case "g1": ret = "7"; break;
			case "h1": ret = "8"; break;
			case "a2": ret = "9"; break;
			case "b2": ret = "10"; break;
			case "c2": ret = "11"; break;
			case "d2": ret = "12"; break;
			case "e2": ret = "13"; break;
			case "f2": ret = "14"; break;
			case "g2": ret = "15"; break;
			case "h2": ret = "16"; break;
			case "a3": ret = "17"; break;
			case "b3": ret = "18"; break;
			case "c3": ret = "19"; break;
			case "d3": ret = "20"; break;
			case "e3": ret = "21"; break;
			case "f3": ret = "22"; break;
			case "g3": ret = "23"; break;
			case "h3": ret = "24"; break;
			case "a4": ret = "25"; break;
			case "b4": ret = "26"; break;
			case "c4": ret = "27"; break;
			case "d4": ret = "28"; break;
			case "e4": ret = "29"; break;
			case "f4": ret = "30"; break;
			case "g4": ret = "31"; break;
			case "h4": ret = "32"; break;
			case "a5": ret = "33"; break;
			case "b5": ret = "34"; break;
			case "c5": ret = "35"; break;
			case "d5": ret = "36"; break;
			case "e5": ret = "37"; break;
			case "f5": ret = "38"; break;
			case "g5": ret = "39"; break;
			case "h5": ret = "40"; break;
			case "a6": ret = "41"; break;
			case "b6": ret = "42"; break;
			case "c6": ret = "43"; break;
			case "d6": ret = "44"; break;
			case "e6": ret = "45"; break;
			case "f6": ret = "46"; break;
			case "g6": ret = "47"; break;
			case "h6": ret = "48"; break;
			case "a7": ret = "49"; break;
			case "b7": ret = "50"; break;
			case "c7": ret = "51"; break;
			case "d7": ret = "52"; break;
			case "e7": ret = "53"; break;
			case "f7": ret = "54"; break;
			case "g7": ret = "55"; break;
			case "h7": ret = "56"; break;
			case "a8": ret = "57"; break;
			case "b8": ret = "58"; break;
			case "c8": ret = "59"; break;
			case "d8": ret = "60"; break;
			case "e8": ret = "61"; break;
			case "f8": ret = "62"; break;
			case "g8": ret = "63"; break;
			case "h8": ret = "64"; break;
			}
		}
		
		
		return ret;
	}
}
