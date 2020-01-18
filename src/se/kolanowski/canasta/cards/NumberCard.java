package se.kolanowski.canasta.cards;

public class NumberCard implements Card {

    private final int value;
    private final Suit suit;

    public NumberCard(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int points() {
        if (value < 6) {
            return value;
        }

        return 10;
    }

    public String toString() {
        return value + " of " + suit.toString().toLowerCase();
    }

}