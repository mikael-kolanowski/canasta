package se.kolanowski.canasta.cards;

import java.util.ArrayList;
import java.util.List;

class Hand {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public int totalPoints() {
        int total = 0;
        for (Card card : cards) {
            total += card.points();
        }

        return total;
    }
}