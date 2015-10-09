package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MatchMakingTest {

	private MatchMaking sut;
	
	@Before
	public void setup() {
		sut = new MatchMaking();
	}
	@Test
	public void testMakeMatch0() {
		String[] namesWomen = {"Constance", "Bertha", "Alice"};
		String[] answersWomen = {"aaba", "baab", "aaaa"};
		String[] namesMen = {"Chip", "Biff", "Abe"};
		String[] answersMen = {"bbaa", "baaa", "aaab"};
		String queryWoman ="Bertha";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("Biff", actual);
	}
	@Test
	public void testMakeMatch1() {
		String[] namesWomen = {"Constance", "Bertha", "Alice"};
		String[] answersWomen = {"aaba", "baab", "aaaa"};
		String[] namesMen = {"Chip", "Biff", "Abe"};
		String[] answersMen = {"bbaa", "baaa", "aaab"};
		String queryWoman ="Constance";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("Chip", actual);
	}
	@Test
	public void testMakeMatch2() {
		String[] namesWomen = {"Constance", "Alice", "Bertha", "Delilah", "Emily"};
		String[] answersWomen = {"baabaa", "ababab", "aaabbb", "bababa", "baabba"};
		String[] namesMen = {"Ed", "Duff", "Chip", "Abe", "Biff"};
		String[] answersMen = {"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"};
		String queryWoman ="Constance";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("Duff", actual);
	}
	@Test
	public void testMakeMatch3() {
		String[] namesWomen = {"Constance", "Alice", "Bertha", "Delilah", "Emily"};
		String[] answersWomen = {"baabaa", "ababab", "aaabbb", "bababa", "baabba"};
		String[] namesMen = {"Ed", "Duff", "Chip", "Abe", "Biff"};
		String[] answersMen = {"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"};
		String queryWoman ="Delilah";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("Chip", actual);
	}
	@Test
	public void testMakeMatch4() {
		String[] namesWomen = {"Constance", "Alice", "Bertha", "Delilah", "Emily"};
		String[] answersWomen = {"baabaa", "ababab", "aaabbb", "bababa", "baabba"};
		String[] namesMen = {"Ed", "Duff", "Chip", "Abe", "Biff"};
		String[] answersMen = {"aabaab", "babbab", "bbbaaa", "abbbba", "abaaba"};
		String queryWoman ="Emily";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("Ed", actual);
	}
	@Test
	public void testMakeMatch5() {
		String[] namesWomen = {"anne", "Zoe"};
		String[] answersWomen = {"a", "a"};
		String[] namesMen = {"bob", "chuck"};
		String[] answersMen = {"a", "a"};
		String queryWoman ="Zoe";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("bob", actual);
	}
	@Test
	public void testMakeMatch6() {
		String[] namesWomen = {"F", "M", "S", "h", "q", "g", "r", "N", "U", "x", "H", "P",
					 "o", "E", "R", "z", "L", "m", "e", "u", "K", "A", "w", "Q",
					 "O", "v", "j", "a", "t", "p", "C", "G", "k", "c", "V", "B",
					 "D", "s", "n", "i", "f", "T", "I", "l", "d", "J", "y", "b"};
		String[] answersWomen = {"abaabbbb", "bbaabbbb", "aaabaaab", "aabbaaaa", "baabbaab",
				 "aaababba", "bbabbbbb", "bbbabbba", "aaabbbba", "aabbbaaa",
				 "abbabaaa", "babbabbb", "aaaaabba", "aaaabbaa", "abbbabaa",
				 "babababa", "abbaaaaa", "bbababba", "baaaaaba", "baaaaabb",
				 "bbbbabba", "ababbaaa", "abbbabab", "baabbbaa", "bbbaabbb",
				 "aababbab", "ababbabb", "abbaabba", "baabbabb", "aaabaaab",
				 "aabbbaba", "aabaaabb", "abababba", "aabbaaaa", "aabbabaa",
				 "bababaaa", "aabaaaab", "bbbbaabb", "baaababb", "abaabbab",
				 "aabbbaaa", "baabbaba", "bbabbbaa", "aabbbbaa", "abbbaaab",
				 "abababbb", "ababaaba", "bababaaa"};
		String[] namesMen = {"f", "C", "v", "g", "Q", "z", "n", "c", "B", "o", "M", "F",
				 "u", "x", "I", "T", "K", "L", "E", "U", "w", "A", "d", "t",
				 "e", "R", "D", "s", "p", "q", "m", "r", "H", "j", "J", "V",
				 "l", "a", "k", "h", "G", "y", "i", "P", "O", "N", "b", "S"};
		String[] answersMen = {"bbbaabab", "bbabaabb", "ababbbbb", "bbbababb", "baababaa",
				 "bbaaabab", "abbabbaa", "bbbabbbb", "aabbabab", "abbababa",
				 "aababbbb", "bababaab", "aaababbb", "baabbaba", "abaaaaab",
				 "bbaababa", "babaabab", "abbabbba", "ababbbab", "baabbbab",
				 "babbaaab", "abbbbaba", "bbabbbba", "baaabaab", "ababbabb",
				 "abbbaabb", "bbbbaabb", "bbbaaabb", "baabbaba", "bbabaaab",
				 "aabbbaab", "abbbbabb", "bbaaaaba", "bbbababa", "abbaabba",
				 "bababbbb", "aabaaabb", "babbabab", "baaaabaa", "ababbaba",
				 "aaabaabb", "bbaaabaa", "baaaaabb", "bbaabaab", "bbababab",
				 "aabaaaab", "aaaaabab", "aabbaaba"};
		String queryWoman ="U";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("x", actual);
	}
	@Test
	public void testMakeMatch7() {
		String[] namesWomen = {"q", "M", "w", "y", "p", "N", "s", "r", "a", "H", "o", "n",
					 "F", "m", "l", "b", "D", "j", "C", "u", "f", "I", "g", "L",
					 "i", "x", "A", "G", "O", "k", "h", "d", "c", "E", "B", "v",
					 "J", "z", "K", "e", "t"};
		String[] answersWomen = {"aabbaaabb", "baabababb", "bbaababba", "bbbaaaaaa", "abaaaabaa",
				 "bababbbab", "abbaabbaa", "aabababbb", "bababaaaa", "abbababaa",
				 "aabbbbbba", "bbabbabab", "babaabbba", "babbabbbb", "baaabbbbb",
				 "baaabaaaa", "aaabbaaab", "abbaabbbb", "abbabbbab", "bbaaaabba",
				 "babbaaabb", "aabbabbab", "baaababba", "ababaabab", "bbbaabbab",
				 "aaaabbabb", "babaaaaaa", "abbbbaaab", "aabaaabba", "bbbaaaaba",
				 "bbbbbbaab", "aabbaaabb", "aabaabbab", "aababaaba", "bbabbbbab",
				 "abbabaaab", "babaaabbb", "bababbaaa", "aabbaabaa", "baaabbabb",
				 "bbbbbbbbb"};
		String[] namesMen = {"m", "k", "n", "q", "L", "E", "M", "l", "w", "x", "g", "e",
				 "i", "z", "F", "r", "a", "h", "f", "D", "J", "K", "j", "v",
				 "A", "t", "N", "y", "s", "c", "o", "p", "d", "b", "B", "G",
				 "O", "I", "u", "C", "H"};
		String[] answersMen = {"bbaaabbba", "bbaaaaaab", "abaaababb", "baaaabbbb", "abbbababa",
				 "baaaaaaaa", "aabbbbbab", "aaaaabbba", "baabababb", "babaaabab",
				 "baaababaa", "bbbbaabba", "bbaabbabb", "bbaaababb", "abbabbaba",
				 "aababaaab", "abbbbbbaa", "aabbaabaa", "bbbaabbba", "abbabbaba",
				 "aaabbbaaa", "bbaabaaaa", "aabababbb", "abbbbabab", "baaabbbba",
				 "bababbbba", "aababbaab", "bbaabbaab", "bbbaaabbb", "babbbbabb",
				 "ababababb", "babaaabab", "bbaaaaaba", "aaaaabaaa", "abbaaabbb",
				 "bbbbababb", "baabababb", "bbaabaaaa", "aaababbbb", "abbbbbbba",
				 "bbaabbaaa"};
		String queryWoman ="o";
		String actual = sut.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman);
		assertEquals("C", actual);
	}

}
