package com.github.topcoder;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=11190">BadVocabulary</a>
 */
public class BadVocabulary {

	public int count(String badPrefix, String badSuffix, String badSubstring,
			String[] vocabulary) {
		int ret = 0;

		for (int i = 0; i < vocabulary.length; i++) {
			if (vocabulary[i].startsWith(badPrefix)) {
				ret++;
			} else if (vocabulary[i].endsWith(badSuffix)) {
				ret++;
			} else if (vocabulary[i].matches(".+" + badSubstring + ".+")) {
				ret++;
			}
		}

		return ret;
	}
}
