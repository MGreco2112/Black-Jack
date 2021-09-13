package card;

public class Card {
    public final String SUIT;
    public final String VALUE;

    public Card(String suit, String value) {
        this.SUIT = suit;
        this.VALUE = value;
    }

    public String toString() {
        return VALUE + " of " + SUIT;
    }

}
