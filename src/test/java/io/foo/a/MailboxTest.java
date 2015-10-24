package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.Mailbox;

import org.junit.Before;
import org.junit.Test;

public class MailboxTest {

	private Mailbox sut;

	@Before
	public void setUp() throws Exception {
		sut = new Mailbox();
	}

	@Test
	public void testImpossible0() {
		String collection = "AAAAAAABBCCCCCDDDEEE123456789";
		String[] address = { "123C", "123A", "123 ADA" };
		int expected = 0;
		int actual = sut.impossible(collection, address);
		assertEquals(expected, actual);
	}

	@Test
	public void testImpossible1() {
		String collection = "ABCDEFGHIJKLMNOPRSTUVWXYZ1234567890";
		String[] address = { "2 FIRST ST", " 31 QUINCE ST", "606 BAKER" };
		int expected = 3;
		int actual = sut.impossible(collection, address);
		assertEquals(expected, actual);
	}

	@Test
	public void testImpossible2() {
		String collection = "ABCDAAST";
		String[] address = { "111 A ST", "A BAD ST", "B BAD ST" };
		int expected = 2;
		int actual = sut.impossible(collection, address);
		assertEquals(expected, actual);
	}

}
