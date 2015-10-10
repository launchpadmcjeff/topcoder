package com.github.topcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=8019">SearchBox</a>
 */
public class SearchBox {
	public int find(String text, String search, String wholeWord, int start) {
		int ret = -1;
		Pattern p = null;
		if (wholeWord.equals("Y")) {
			p = Pattern.compile("\\b" + search + "\\b");
		} else {
			p = Pattern.compile(search);
		}
		Matcher m = p.matcher(text);
		if (m.find(start)) {
			ret = m.start();
		}
		return ret;
	}
}
