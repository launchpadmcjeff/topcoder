package com.github.topcoder;


public class BlackjackWinner {

	public int winnings(int bet, int dealer, int dealerBlackjack, int player,
			int blackjack) {
		int ret = 0;
		if (dealerBlackjack == 0 && blackjack == 0) {
			if (player <= 21) {
				if (dealer <= 21) {
					if (player > dealer) {
						ret = bet;
					} else if (player == dealer) {
						ret = 0;
					} else if (player < dealer) {
						ret = -bet;
					}
				} else {
					ret = bet;
				}
			} else {
				ret -= bet;
			}
		} else if (dealerBlackjack == 0 && blackjack == 1) {
			ret = bet + bet / 2;
		} else if (dealerBlackjack == 1 && blackjack == 0) {
			ret = -bet;
		} else if (dealerBlackjack == 1 && blackjack == 1) {
			ret = 0;
		}

		return ret;
	}
}
