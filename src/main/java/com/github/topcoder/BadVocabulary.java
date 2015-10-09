package com.github.topcoder;

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
