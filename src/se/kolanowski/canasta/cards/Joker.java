package se.kolanowski.canasta.cards;

class Joker implements Card {

    public int points() {
        return 50;
    }

    public String toString() {
        return "joker";
    }
}