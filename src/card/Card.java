package card;

public class Card {
    public final String SUIT;
    public final int VALUE;


    public Card(String suit, int value) {
        this.SUIT = suit;
        this.VALUE = value;

    }

    public String display() {
        String value = "";

        switch (VALUE) {
            case 1 -> value = "Ace";
            case 11 -> value = "Jack";
            case 12 -> value = "Queen";
            case 13 -> value = "King";
            default -> value = Integer.toString(VALUE);
        }

        return value + " of " + SUIT;
    }


}
