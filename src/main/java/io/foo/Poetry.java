package io.foo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1835">Poetry</a>
 */
public class Poetry {

	public String rhymeScheme(String[] poem) {
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("([aeiou]+[^aeiou]*\\s*$)|(^\\wy\\w$)");
		Map<String, Character> endings = new HashMap<>();
		String nl = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int nlIdx = 0;

		for (int i = 0; i < poem.length; i++) {
			if (poem[i].matches("^\\s*$")) {
				sb.append(" ");
				continue;
			}
			String[] foo = poem[i].split("\\s+");
			String lw = foo[foo.length - 1].toLowerCase().trim();
			Matcher m = p.matcher(lw);
			if (m.find()) {
				String found = m.group(0);
				if (!endings.containsKey(found)) {
					endings.put(found, nl.charAt(nlIdx));
					sb.append(nl.charAt(nlIdx++));
				} else {
					sb.append(endings.get(found).charValue());
				}
			}
		}
		return sb.toString();
	}
}
//An ending pattern is a substring of a word such that:
//
//The word ends with that substring,
//The substring contains exactly one contiguous string of vowels,
//The first letter of the substring is a vowel, and
//The substring must either be the whole string, or the letter immediately preceding the start of 
//the substring must be a nonvowel.
//For example, the ending pattern of "bought" is "ought", the ending pattern of "spying" would be 
//"ying", and the ending pattern of "all" would be "all". (Note that "spy" has no vowels, and thus 
//is not a legal word.)
