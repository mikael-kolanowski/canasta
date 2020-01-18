package se.kolanowski.canasta.cards;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class CanastaDeck {

    private List<Card> cards;

    public CanastaDeck(boolean doShuffle) {
        // Canasta is played with two decks of cards
        cards = new ArrayList<>(2 * 52);
        cards = Stream.concat(generateSingleDeck().stream(), generateSingleDeck().stream())
                .collect(Collectors.toList());

        if (doShuffle) {
            Random rand = new Random();
            for (int i = 0; i < cards.size(); i++) {
                int newIndex = rand.nextInt(cards.size());
                Card tmp = cards.get(i);
                cards.set(i, cards.get(newIndex));
                cards.set(newIndex, tmp);
            }
        }
    }

    private List<Card> generateSingleDeck() {
        List<Card> deck = new ArrayList<>(52);

        for (Suit suit : Suit.values()) {
            // First add all the numeric cards
            for (int i = 2; i <= 10; i++) {
                deck.add(new NumberCard(i, suit));
            }

            // Then add the ranked cards
            for (Rank rank : Rank.values()) {
                deck.add(new RankedCard(rank, suit));
            }
        }

        // Finally, two jokers
        deck.add(new Joker());
        deck.add(new Joker());

        return deck;
    }

    public List<Card> getCards() {
        return cards;
    }

}