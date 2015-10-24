package io.foo.a;

import java.util.ArrayList;
import java.util.List;
/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=4504">PrintScheduler</a>
 */
public class PrintScheduler {

	class Proc {
		String inst;
		int ip;
		
		Proc(String inst) {
			this.inst = inst;
		}
		
		char next() {
			if (ip < inst.length()) {
				return inst.charAt(ip++);
			} else {
				ip = 0;
				return inst.charAt(ip++);
			}
		}
	}
	public String getOutput(String[] threads, String[] slices) {
		StringBuilder ret = new StringBuilder();
		List<Proc> procs = new ArrayList<>();
		for (String i : threads) {
			procs.add(new Proc(i));
		}
		
		for (int i = 0; i < slices.length; i++) {
			String[] tmp = slices[i].split("\\s+");
			int tpc = Integer.parseInt(tmp[0]);
			int cnt = Integer.parseInt(tmp[1]);
			
			for (int j = 0; j < cnt; j++) {
				ret.append(procs.get(tpc).next());
			}
			
		}
		
		return ret.toString();
	}
	
	public String getOutput1(String[] threads, String[] slices) {
		StringBuilder ret = new StringBuilder();
		int[] pcs = new int[threads.length];
		
		for (int i = 0; i < slices.length; i++) {
			String[] tmp = slices[i].split("\\s+");
			int tpc = Integer.parseInt(tmp[0]);
			int cnt = Integer.parseInt(tmp[1]);
			
			int base = 0 + pcs[tpc];
			for (int j = 0; j < cnt; j++) {
				if (j + base >= threads[tpc].length()) {
					base -= threads[tpc].length();
				}
				ret.append(threads[tpc].charAt(base + j));
				if (j == cnt - 1) {
					pcs[tpc] = base + j;
				}
			}
		}
		
		
		return ret.toString();
	}
}
