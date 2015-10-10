package io.foo;

import static org.junit.Assert.*;
import io.foo.BlackjackWinner;

import org.junit.Before;
import org.junit.Test;


public class BlackjackWinnerTest {

	private BlackjackWinner sut;

	@Before
	public void setUp() throws Exception {
		sut = new BlackjackWinner();
	}

	@Test
	public void testWinnings0() {
		int bet = 10;
		int dealer = 20;
		int dealerBlackjack = 0;
		int player = 21;
		int blackjack = 0;
		int expected = 10;
		int actual = sut.winnings(bet, dealer, dealerBlackjack, player,
				blackjack);
		assertEquals(expected, actual);
	}

	@Test
	public void testWinnings1() {
		int bet = 26;
		int dealer = 21;
		int dealerBlackjack = 1;
		int player = 21;
		int blackjack = 0;
		int expected = -26;
		int actual = sut.winnings(bet, dealer, dealerBlackjack, player,
				blackjack);
		assertEquals(expected, actual);
	}

	@Test
	public void testWinnings2() {
		int bet = 100;
		int dealer = 25;
		int dealerBlackjack = 0;
		int player = 21;
		int blackjack = 1;
		int expected = 150;
		int actual = sut.winnings(bet, dealer, dealerBlackjack, player,
				blackjack);
		assertEquals(expected, actual);
	}

	@Test
	public void testWinnings3() {
		int bet = 78;
		int dealer = 22;
		int dealerBlackjack = 0;
		int player = 23;
		int blackjack = 0;
		int expected = -78;
		int actual = sut.winnings(bet, dealer, dealerBlackjack, player,
				blackjack);
		assertEquals(expected, actual);
	}

}
