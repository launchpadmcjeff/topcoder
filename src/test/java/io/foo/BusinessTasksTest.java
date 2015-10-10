package io.foo;

import io.foo.BusinessTasks;

import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class BusinessTasksTest {
	/*
	 * 0)
	 * 
	 * {"a","b","c","d"} 2 Returns: "a" We start counting from a. So a is 1, b
	 * is 2. We remove b, so list is now {a,c,d}. We continue from c. So c is 1,
	 * d is 2. We remove d, so list is now {a,c}. We continue from a. So a is 1,
	 * c is 2. We remove c, and now we are left with the last task a. 1)
	 * 
	 * {"a","b","c","d","e"} 3 Returns: "d" We start counting from a. So a is 1,
	 * b is 2, c is 3. We remove c, now list = {a,b,d,e}. We continue from d. So
	 * d is 1, e is 2, a is 3. We remove a, now list = {b,d,e}. We continue from
	 * b. So b is 1, d is 2, e is 3. We remove e, now list = {b,d}. We continue
	 * from b. So b is 1, d is 2 and finally b is 3. We remove b, and now we are
	 * left with just one task d. 2)
	 * 
	 * {"alpha","beta","gamma","delta","epsilon"} 1 Returns: "epsilon" 3)
	 * 
	 * {"a","b"} 1000 Returns: "a" 4)
	 * 
	 * {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"
	 * ,"t", "u","v","w","x","y","z"} 17 Returns: "n" 5)
	 * 
	 * {"zlqamum","yjsrpybmq","tjllfea","fxjqzznvg","nvhekxr","am","skmazcey",
	 * "piklp",
	 * "olcqvhg","dnpo","bhcfc","y","h","fj","bjeoaxglt","oafduixsz","kmtbaxu",
	 * "qgcxjbfx","my","mlhy","bt","bo","q"} 9000000 Returns: "fxjqzznvg"
	 */
	private BusinessTasks sut;

	@Before
	public void setup() {
		sut = new BusinessTasks();
	}

	@Test
	public void testGetTask0() {
		String ans = sut.getTask(new String[] { "a", "b", "c", "d" }, 2);
		assertEquals("a", ans);
	}

	@Test
	public void testGetTask1() {
		String ans = sut.getTask(new String[] { "a", "b", "c", "d", "e" }, 3);
		assertEquals("d", ans);
	}

	@Test
	public void testGetTask2() {
		String ans = sut.getTask(new String[] { "alpha", "beta", "gamma",
				"delta", "epsilon" }, 1);
		assertEquals("epsilon", ans);
	}

	@Test
	public void testGetTask3() {
		String ans = sut.getTask(new String[] { "a", "b" }, 1000);
		assertEquals("a", ans);
	}

	@Test
	public void testGetTask4() {
		String ans = sut.getTask(new String[] { "a", "b", "c", "d", "e", "f",
				"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" }, 17);
		assertEquals("n", ans);
	}

	@Test
	public void testGetTask5() {
		String ans = sut.getTask(new String[] { "zlqamum", "yjsrpybmq",
				"tjllfea", "fxjqzznvg", "nvhekxr", "am", "skmazcey", "piklp",
				"olcqvhg", "dnpo", "bhcfc", "y", "h", "fj", "bjeoaxglt",
				"oafduixsz", "kmtbaxu", "qgcxjbfx", "my", "mlhy", "bt", "bo",
				"q" }, 9000000);
		assertEquals("fxjqzznvg", ans);
	}
}
