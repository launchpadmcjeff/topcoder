package io.foo;

import static org.junit.Assert.*;
import io.foo.CondorcetVoting;

import org.junit.Before;
import org.junit.Test;


public class CondorcetVotingTest {

	private CondorcetVoting sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new CondorcetVoting();
	}

	@Test
	public void testWinner0() {
		String[] votes = { "acbd", "bacd", "bdca" };
		int expected = 0;
		int actual = sut.winner(votes);
		assertEquals(expected, actual);
	}
	@Test
	public void testWinner1() {
		String[] votes = {"abc", 
				 "bca", 
				 "cab"};
		int expected = -1;
		int actual = sut.winner(votes);
		assertEquals(expected, actual);
	}
	@Test
	public void testWinner2() {
		String[] votes = {"cezdqcw"};
		int expected = -1;
		int actual = sut.winner(votes);
		assertEquals(expected, actual);
	}
	@Test
	public void testWinner3() {
		String[] votes = {"abcd", "abcd", "abcd", "abcd", "abcd", "abcd",
				 "cbad", "cbad", "cbad", "cbad", "cbad",
				 "dbca", "cbda", "cbda"};
		int expected = 1;
		int actual = sut.winner(votes);
		assertEquals(expected, actual);
	}
	@Test
	public void testWinner4() {
		String[] votes = {"abbcbbbaaccaaccbbacbbbaacbccbccacaaacaacaaacbccaac",
				 "accbabcaacacbcccbbccbbcaccccccbbcbbcbaccbcbcacbcbc",
				 "acacaaabccaaaccabbaaaacabaaabacacbaacbcccbccbcbacb",
				 "acbcbabaabbcaababaacbabcacbaccabbaaacccbcabbbcacba",
				 "cbbbacbbacccbbabbbcbaabaaaacaacbcbccbaaccbcaaccbcb",
				 "cbacbbcbbcbcaaabccabcabbcbacaaabccabbcbacbbacbbaca",
				 "cacaabccbbbaaacccacbbcacababbcaaabccbbacbbbccacbaa",
				 "bccbbabaaaababcbabbbbcbcacbcbcbacccacacacacacacaab",
				 "bccabcaabcabbccaaccbcabaaabbbcaabaaabbbbabbbaabaac",
				 "accccbabaaaabcbacabbcbbacaacaaaacccbbbcacaccccaaac",
				 "cccbcaababbaacaaabbbaabbccccacaacbacaacbbbaacccbbb",
				 "bccccaccbcbbaaaaaaaaccbababcabaaccacbbabbbcabbaaca",
				 "cbacacaabbccacaabbbbbbccabcbbaccacbcacacacbccbcbcc",
				 "baabcabccaaaaccbaacaaccacccbcbbaaacacaccbcaacbbbba",
				 "bccaaaabcbbcbbbbbcaabaacccbccbbcbabacaaccbccaababb",
				 "cacbbbbcabbcbaabbccbaccbaacbbcbbbbcabababccabbbcab",
				 "bccbcacbccaacacccccaacabacbacbbbcaabacacccbbbccaac",
				 "aaaccbbbacacbaaaacacaabbaacccbcccbcabbccbcacabbacb",
				 "bcabcbbacbacacbbaaccabcabcbbaabacacccbbbcabbbcaacb",
				 "bacbbbbaccbaabbbbbcaccbbcbcabbbccbcacccbabbbcaaacc",
				 "bababcacbacacacccccbbcacccbbcbccaccaacbbcacabcabba",
				 "aaabaccbbcacaacbabccccabbbcbcccccccbaacbccbaacbbbc",
				 "abacbaaaaaccacbbbaccbbbabaacbcbccacccabaaaacbaabbb",
				 "cbbcacbaccabbbcaacbcbabbcabcbaccabcbbbcabcbcbaacca",
				 "babbacaaacbbcbbbabbaabcbabcbbaacaacbbbaaaabbcabcca",
				 "cbabaacabcccaabbbacccaccbacabbaacaaabcbcccbcbcccaa",
				 "aabbbcbacabbcabcbcccbccaccbcacbaacabbbccaabaabcbba",
				 "caccabcccabbaacbabbaaaccccccccaaccbcaccacaabacccba",
				 "bbbcabcababaabacaccacabcbccacccbbbbcbbbaccabcabaab",
				 "bbbcaababbbbababababcbbbbaaabbacaabcacbbccbcaaaaaa",
				 "bcbacccaaaabbcbcabbbcababbcacaabbbbcbbacbaabcbaccb",
				 "bbcaccaaccacbbaaccaaaabccbbacbcbacaacbacbccaaccbba",
				 "abaaacbccbbabbcaccbaccccbaaacaccccababcbccccbabcca",
				 "acccaccababababacbbaccbcabcaccbabaabacbaacaaacabca",
				 "aaabababccabccbcbabcabcacbbcacbcbbbabcabacbcaacacb",
				 "ccacbaabbcbaccaccbbabbabbabaacccabcaaccacacccbbcab",
				 "bbaabcbabbbaacacabaabcbaaabacbccccaccaaaacbacabbbc",
				 "abaaaccaacbbcacacbcbccbaaacbbcbacabbbccabbbccaaaac",
				 "bbacbabbcacbbacccaccbcbcabbcbaacabbbbabbaaabaacacb",
				 "cacbacbccbcbabacccacabcacacabbcabbccaacacbaaacaacb",
				 "bacbbacbccccabcbabcbbcbacacaaabcbaccccaabaabbacbcb",
				 "abcaaccccabccaaaaccbabccacbcaaaacaccaccccccaaaabaa",
				 "bacabcbccbacccbaaaabcbbaabbabaabcabacccbcabacccbcc",
				 "babaccbbcbcbacccabccbcccbaaaaacccabcbccbbbbcbabcbc",
				 "cccbbaccbabbbbcbcbcbaaacbbcacbcaacacacccbcabccbcaa",
				 "caacbcacbccaaaaacaaababbcccacbabaaabcaacaaababacba",
				 "cccccaccabcaacababbacbcbabbcaacbacbabbbccbabcbabbb",
				 "ccbcababcabcbcccaccccacabcbaaacaabccbbaabaccbaccab",
				 "abbbcacaccabcbccbacabbbccaccaaaacccabbcbacbbccabcb",
				 "bacabccabcbbcaacbcacabcbccacbcccbcbcaaaabbaabccabb"};
		int expected = 12;
		int actual = sut.winner(votes);
		assertEquals(expected, actual);
	}
	@Test
	public void testWinner5() {
		String[] votes = {"h", "e", "l", "l", "o"};
		int expected = 0;
		int actual = sut.winner(votes);
		assertEquals(expected, actual);
	}

}
