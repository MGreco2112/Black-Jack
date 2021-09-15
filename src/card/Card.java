package card;

public class Card {
    public final String SUIT;
    public final String VALUE;
    public final int COMP_VALUE;

    public Card(String suit, String value) {
        this.SUIT = suit;
        this.VALUE = value;

        if (value.equals("Ace")) {
            COMP_VALUE = 1;
        } else if (value.equals("Jack")) {
            COMP_VALUE = 11;
        } else if (value.equals("Queen")) {
            COMP_VALUE = 12;
        } else if (value.equals("King")) {
            COMP_VALUE = 13;
        } else {
            COMP_VALUE = Integer.parseInt(value);
        }
    }

    public String toString() {
        return VALUE + " of " + SUIT + "| Number value: " + COMP_VALUE;
    }

}
