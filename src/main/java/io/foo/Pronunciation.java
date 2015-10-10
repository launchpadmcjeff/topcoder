package io.foo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=3527">Pronunciation</a>
 */
public class Pronunciation {

	public String canPronounce(String[] words) {
		String ret = "";
		Pattern p1 = Pattern.compile("([a-zA-Z&&[^aeiouAEIOU]]{3,})");
//		Pattern p1 = Pattern.compile("([a-zA-Z&&[^aeiouAEIOU]]{3,})|([aeiouAEIOU])(?!\\1)([aeiouAEIOU])");
		Pattern p2 = Pattern.compile("([aeiouAEIOU])(?!\\1)([aeiouAEIOU])", Pattern.CASE_INSENSITIVE);
//		Pattern p2 = Pattern.compile("([aeiou])(?!\\1)([aeiou])", Pattern.CASE_INSENSITIVE);
		
		for (int i = 0; i < words.length; i++) {
			Matcher m = p1.matcher(words[i]);
			if (m.find()) {
				ret = words[i];
				break;
			}
			Matcher m2 = p2.matcher(words[i]);
			if (m2.find()) {
				ret = words[i];
				break;
			}
		}
		return ret;
	}
}
