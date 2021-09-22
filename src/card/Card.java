package card;

public class Card {
    public final String SUIT;
    public final int VALUE;
    private boolean isFaceDown = true;


    public Card(String suit, int value) {
        this.SUIT = suit;
        this.VALUE = value;

    }

    public void flip() {
        isFaceDown = !isFaceDown;
    }

    public String display() {
        if (!isFaceDown) {

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

        return "Card is FaceDown";
    }

    public String toString() {
        return display();
    }


}
