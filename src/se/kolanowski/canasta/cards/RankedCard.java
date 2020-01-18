package se.kolanowski.canasta.cards;

class RankedCard implements Card {

    private Rank rank;
    private Suit suit;

    public RankedCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int points() {
        if (rank == Rank.ACE) {
            return 20;
        } else {
            return 10;
        }
    }

    public String toString() {
        String suit, rank;

        rank = this.rank.toString().toLowerCase();
        suit = this.suit.toString().toLowerCase();

        return rank + " of " + suit;
    }

}