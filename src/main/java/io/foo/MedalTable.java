package io.foo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2922">MedalTable</a>
 */
public class MedalTable {
	String[] generate(String[] results) {
		// Take the passed in String[] and create new ScoreCount objects
		Set<ScoreCount> resSet = new HashSet<>();
		for (String i : results) {
			// add results to set, incrementing counts along the way
			// split each string on whitespace
			String[] t = i.split("\\s+"); // maybe use Pattern and Matcher for
											// better performance
			ScoreCount gld = new ScoreCount(t[0]);
			ScoreCount slv = new ScoreCount(t[1]);
			ScoreCount brz = new ScoreCount(t[2]);
			if (!resSet.contains(gld)) {
				resSet.add(gld);
			}
			if (!resSet.contains(slv)) {
				resSet.add(slv);
			}
			if (!resSet.contains(brz)) {
				resSet.add(brz);
			}
			Iterator<ScoreCount> it = resSet.iterator();
			while (it.hasNext()) {
				ScoreCount j = it.next();
				if (j.equals(gld)) {
					j.gold++;
				}
				if (j.equals(slv)) {
					j.silv++;
				}
				if (j.equals(brz)) {
					j.bron++;
				}
			}
		}

		// sort the results in map by count of gold medals
		List<ScoreCount> ret = new ArrayList<>(resSet);
		Collections.sort(ret);
		// return the sorted map as String[] {"key G S B"...}
		List<String> stringList = new ArrayList<>();
		for (ScoreCount i : ret) {
			stringList.add(i.toString());
		}

		return stringList.toArray(new String[0]);

	}

	class ScoreCount implements Comparable<ScoreCount> {
		String name;
		int gold;
		int silv;
		int bron;

		public ScoreCount(String name) {
			super();
			this.name = name;
		}

		@Override
		public String toString() {
			return String.format("%s %d %d %d", name, gold, silv, bron);
		}

		@Override
		public int compareTo(ScoreCount o) {
			if (gold - o.gold != 0) {
				return o.gold - gold;
			} else if (silv - o.silv != 0) {
				return o.silv - silv;
			} else if (bron - o.bron != 0) {
				return o.bron - bron;
			} else {
				return name.compareTo(o.name);
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof ScoreCount)) {
				return false;
			}
			ScoreCount other = (ScoreCount) obj;
			if (!getOuterType().equals(other.getOuterType())) {
				return false;
			}
			if (name == null) {
				if (other.name != null) {
					return false;
				}
			} else if (!name.equals(other.name)) {
				return false;
			}
			return true;
		}

		private MedalTable getOuterType() {
			return MedalTable.this;
		}

	}
}
