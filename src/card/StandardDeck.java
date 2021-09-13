package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements Deck{
    private final List<Card> CARDS = new ArrayList<>();
    public final String[] SUITS = new String[] {"Clubs, Hearts, Diamonds, Spades"};
    public final String[] VALUES = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King"};

    public StandardDeck() {
        for (String suit : SUITS) {
            for (String value : VALUES) {
                CARDS.add(new Card(suit, value));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(CARDS);
    }

    @Override
    public Card deal() {
        return CARDS.remove(CARDS.size() - 1);
    }
}
