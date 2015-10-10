package io.foo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2911">MatchMaking</a>
 */
public class MatchMaking {

	private class Dater implements Comparable<Dater> {
		public Dater(String name, String answ, int ord) {
			this.name = name;
			this.answers = answ.toCharArray();
			this.ord = ord;
		}
		String name;
		char[] answers;
		int ord;
		Dater match;
		@Override
		public int compareTo(Dater o) {
			return name.compareTo(o.name);
		}
	}
	
	public String makeMatch(String[] namesWomen, String[] answersWomen,
			String[] namesMen, String[] answersMen, String queryWoman) {
		String ret = null;
		
		List<Dater> wom = new LinkedList<>();
		List<Dater> men = new LinkedList<>();
		for (int i = 0; i < namesWomen.length; i++) {
			wom.add(new Dater(namesWomen[i], answersWomen[i], i));
			men.add(new Dater(namesMen[i], answersMen[i], i));
		}
		Collections.sort(wom);
		Collections.sort(men);
		for (Dater f : wom) {
			int bestCnt = 0;
			ListIterator<Dater> it = men.listIterator();
			while (it.hasNext()) {
				Dater man = it.next();
				int cnt = 0;
				for (int i = 0; i < f.answers.length; i++) {
					if (f.answers[i] == man.answers[i]) {
						cnt++;
					}
				}
				if (cnt > bestCnt) {
					f.match = man;
					bestCnt = cnt;
				}
			}
			men.remove(f.match);
		}
		for (Dater f : wom) {
			if (f.name.equals(queryWoman)) {
				ret = f.match.name;
				break;
			}
		}
		return ret;
	}
	
	public String makeMatch0(String[] namesWomen, String[] answersWomen,
			String[] namesMen, String[] answersMen, String queryWoman) {
		String ret = null;

		String[] sortedWomen = new String[namesWomen.length];
		System.arraycopy(namesWomen, 0, sortedWomen, 0, namesWomen.length);
		Arrays.sort(sortedWomen);
		
		for (int i = 0; i < sortedWomen.length; i++) {
			for (int j = 0; j < namesWomen.length; j++) {
				if (sortedWomen[i].equals(namesWomen[j])) {
					String ansW = answersWomen[j];
					
					for (int k = 0; k < answersMen.length; k++) {
						String ansM = answersMen[k];
						
						int totalMatch = 0;
						for (int l = 0; l < ansW.length(); l++) {
							if (ansW.charAt(l) == ansM.charAt(l)) {
								totalMatch++;
							}
						}
					}
					
					break;
				}
			}
		}
		return ret;
	}

}
