package io.foo.a;

import java.util.HashSet;
import java.util.Set;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=7659">Library</a>
 */
public class Library {

	public int documentAccess(String[] records, String[] userGroups, String[] roomRights) {
		int ret = 0;
		Set<String> groups = new HashSet<>();
		Set<String> rights = new HashSet<>();
		Set<String> docs = new HashSet<>();
		
		for (String i : userGroups) {
			groups.add(i);
		}
		for (String i : roomRights) {
			rights.add(i);
		}
		
		for (int i = 0; i < records.length; i++) {
			String[] s = records[i].split("\\s+");
			if (docs.contains(s[0])) {
				continue;
			} 

			if (rights.contains(s[1]) && groups.contains(s[2])) {
				docs.add(s[0]);
				ret++;
				continue;
			}
		}
		
		return ret;
	}
}
