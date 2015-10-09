package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BadVocabularyTest {

	private BadVocabulary sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new BadVocabulary();
	}

	/*
	1)	
	    	
	"a"
	"b"
	"c"
	{"a", "b", "tco"}
	Returns: 3
	"a" is a prefix of "a". "b" is a suffix of "b". "c" is a substring of "tco". So, all words in vocabulary are bad.
	2)	
	    	
	"cut"
	"sore"
	"scar"
	{"scary", "oscar"}
	Returns: 0
	Although "scar" is a substring of "scary", it is also a prefix. Thus, "scary" is not a bad word. Similarly, as "scar" is a suffix of "oscar", "oscar" is not a bad word.
	3)	
	    	
	"bar"
	"else"
	"foo"
	{"foofoofoo", "foobar", "elsewhere"}
	Returns: 1
	Only the word "foofoofoo" is bad.
	4)	
	    	
	"pre"
	"s"
	"all"
	{"all", "coders", "be", "prepared", "for", "the", "challenge", "phase"}
	Returns: 3
	*/
	@Test
	public void testCount0() {
		String badPrefix = "bug";
		String badSuffix = "bug";
		String badSubstring = "bug";
		String[] vocabulary = {"buggy", "debugger", "debug"};
		int expected = 3;
		int actual = sut.count(badPrefix, badSuffix, badSubstring, vocabulary);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount1() {
		String badPrefix = "a";
		String badSuffix = "b";
		String badSubstring = "c";
		String[] vocabulary = {"a", "b", "tco"};
		int expected = 3;
		int actual = sut.count(badPrefix, badSuffix, badSubstring, vocabulary);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount2() {
		String badPrefix = "cut";
		String badSuffix = "sore";
		String badSubstring = "scar";
		String[] vocabulary = {"scary", "oscar"};
		int expected = 0;
		int actual = sut.count(badPrefix, badSuffix, badSubstring, vocabulary);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount3() {
		String badPrefix = "bar";
		String badSuffix = "else";
		String badSubstring = "foo";
		String[] vocabulary = {"foofoofoo", "foobar", "elsewhere"};
		int expected = 1;
		int actual = sut.count(badPrefix, badSuffix, badSubstring, vocabulary);
		assertEquals(expected, actual);
	}
	@Test
	public void testCount4() {
		String badPrefix = "pre";
		String badSuffix = "s";
		String badSubstring = "all";
		String[] vocabulary = {"all", "coders", "be", "prepared", "for", "the", "challenge", "phase"};
		int expected = 3;
		int actual = sut.count(badPrefix, badSuffix, badSubstring, vocabulary);
		assertEquals(expected, actual);
	}

}
