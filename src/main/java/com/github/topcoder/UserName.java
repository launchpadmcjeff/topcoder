package com.github.topcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;


public class UserName {

	public String newMember(String[] existingNames, String newName) {
		Set<String> names = new HashSet<>();
		String ret = newName;
		for (String i : existingNames) {
			names.add(i);
		}
		int i = 1;
		while (names.contains(ret)) {
			ret = newName + i++;
		}
		return ret;
	}
	
	public String newMemberFail2(String[] existingNames, String newName) {

		SortedSet<String> names = new TreeSet<>();
		for (String i : existingNames) {
			names.add(i);
		}
		SortedSet<String> tailNames = names.tailSet(newName);
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		return null;
	}

	public String newMemberFail(String[] existingNames, String newName) {
		Map<String, AtomicInteger> names = new HashMap<>(existingNames.length);
		for (String i : existingNames) {
			String baseName = i;
			char lastC = i.charAt(i.length() - 1);
			if (lastC >= '0' && lastC <= '9') {
				char last2C = i.charAt(i.length() - 2);
				if (last2C >= '0' && last2C <= '9') {
					baseName = i.substring(0, i.length() - 2);
				} else {
					baseName = i.substring(0, i.length() - 1);
				}
			}
			if (names.containsKey(baseName)) {
				names.get(baseName).incrementAndGet();
			} else {
				names.put(baseName, new AtomicInteger(1));
			}
		}
		if (names.containsKey(newName)) {
			return newName + names.get(newName).getAndIncrement();
		} else {
			return newName;
		}
	}
}
