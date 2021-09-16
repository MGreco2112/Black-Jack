package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements Deck{
    private final List<Card> CARDS = new ArrayList<>();
    public final String[] SUITS = new String[] {"Clubs", "Hearts", "Diamonds", "Spades"};
    public final int[] VALUES = new int[] {1, 2, 3,4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public StandardDeck() {
        for (String suit : SUITS) {
            for (int value : VALUES) {
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
        Card dealtCard = null;

        if (CARDS.size() > 0) {
            dealtCard = CARDS.remove(CARDS.size() - 1);
        } else {
            System.out.println("The deck is empty");
        }

        return dealtCard;
    }

    public int getCARDSSize() {
        return CARDS.size();
    }

    public void printDeck() {
        System.out.println(CARDS);
    }
}
