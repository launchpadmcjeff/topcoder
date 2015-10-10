package io.foo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 *  <a href="http://community.topcoder.com/stat?c=problem_statement&pm=1585">BusinessTasks</a>
 */
public class BusinessTasks {
	public String getTask(String[] list, int n) {
		List<String> pi = new LinkedList<>();
		for (String i : list) {
			pi.add(i);
		}
		String ret = null;
		Iterator<String> piIt = pi.iterator();
		while (pi.size() > 0) {
			for (int i = 1; i <= n; i++) {
				if (piIt.hasNext()) {
					ret = piIt.next();
				} else {
					piIt = pi.iterator();
					ret = piIt.next();
				}
			}
			piIt.remove();
		}
		return ret;
	}
	
	public String getTaskOrig(String[] list, int n) {
		CircularList<String> roundList = new CircularList<String>(list);
		String ret = null;
		Iterator<String> roundListIterator = roundList.iterator();
		while (roundListIterator.hasNext()) {
			for (int i = 1; i <= n; i++) {
				ret = roundListIterator.next();
			}
			roundListIterator.remove();
		}
		return ret;
	}

	class CircularList<T> {
		List<T> elem = new LinkedList<>();
		int head;
		int tail;

		public int size() {
			return elem.size();
		}

		public CircularList(T[] elems) {
			for (T i : elems) {
				elem.add(i);
			}
		}

		public T remove(int offset) {
			T ret = null;
			int idx = rebase(head + offset) - 1;
			if (idx < 0 || idx >= elem.size()) {
				throw new IndexOutOfBoundsException();
			}
			ret = elem.remove(idx);
			head = idx >= elem.size() ? idx - 1 : idx;
			return ret;
		}

		public Iterator<T> iterator() {
			
			return new Iterator<T>() {
				Iterator<T> it; // = elem.iterator();

				@Override
				public boolean hasNext() {
					return elem.size() > 0;
				}

				@Override
				public T next() {
					if (it == null || !it.hasNext()) {
						it = elem.iterator();
					}
					return it.next();
				}

				@Override
				public void remove() {
					it.remove();
				}
				
			};
		}
		public void addAll(String[] elems) {

		}

		public int rebase(int idx) {
			return elem.size() > 0 ? idx % (elem.size() - 1) : 0;
		}
	}
}
