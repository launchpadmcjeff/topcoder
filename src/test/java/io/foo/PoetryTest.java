package io.foo;

import static org.junit.Assert.*;
import io.foo.Poetry;

import org.junit.Before;
import org.junit.Test;


public class PoetryTest {

	private Poetry sut;
	
	@Before
	public void setup() {
		sut = new Poetry();
	}
	@Test
	public void testRhymeScheme0() {
		String actual = sut.rhymeScheme(new String[] { "I hope this problem",
				"is a whole lot better than", "this stupid haiku" });
		assertEquals("abc", actual);
	}
	@Test
	public void testRhymeScheme1() {
		String actual = sut.rhymeScheme(new String[] {"     ",
				"Measure your height",
				"AND WEIGHT      ",
				"said the doctor",
				"",
				"And make sure to take your pills",
				"   to   cure   your    ills",
				"Every",
		"DAY"});
		assertEquals(" aab ccde", actual);
	}
	@Test
	public void testRhymeScheme2() {
		String actual = sut.rhymeScheme(new String[] {"One bright day in the middle of the night",
				"Two dead boys got up to fight",
				"Back to back they faced each other",
				"Drew their swords and shot each other",
				"",
				"A deaf policeman heard the noise",
				"And came to arrest the two dead boys",
				"And if you dont believe this lie is true",
		"Ask the blind man he saw it too"});
		assertEquals("aabb cdef", actual);
	}
	@Test
	public void testRhymeScheme3() {
		String actual = sut.rhymeScheme(new String[] {"",
				"",
				"",
		""});
		assertEquals("    ", actual);
	}
	@Test
	public void testRhymeScheme4() {
		String actual = sut.rhymeScheme(new String[] {"This poem has uppercase letters",
				 "In its rhyme scheme",
				 "Alpha", "Blaster", "Cat", "Desert", "Elephant", "Frog", "Gulch", 
				 "Horse", "Ireland", "Jam", "Krispy Kreme", "Loofah", "Moo", "Narf",
				 "Old", "Pink", "Quash", "Rainbow", "Star", "Tour", "Uvula", "Very",
				 "Will", "Xmas", "Young", "Zed", "deception", "comic", "grout",
				 "oval", "cable", "rob", "steal", "steel", "weak"});
		assertEquals("abcdefghibjkblmnopqrstcuvwxyzABCbDEFG", actual);
	}
	@Test
	public void testRhymeScheme5() {
		String actual = sut.rhymeScheme(new String[] {" ",
				 "     ",
				 "This poem",
				 "         ",
				 " ",
				 " ",
				 "",
				 "Has lots of blank lines",
				 " ",
				 "      ",
				 "                                            ",
				 "         ",
				 " ",
				 "              ",
				 "                                                  ",
				 "  in      it           "});
		assertEquals("  a    b       c", actual);
	}
	@Test
	public void testRhymeScheme6() {
		String actual = sut.rhymeScheme(new String[] {"too bad   your",
		 "     solution went   sour"});
		assertEquals("aa", actual);
	}

}
