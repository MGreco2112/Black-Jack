package game;

import card.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //        -Player (String name, int score, List hand)
    protected final String NAME;
    protected int score;
    protected final List<Card> HAND = new ArrayList<>();

    public Player(String name) {
        this.NAME = name;
        score = 0;
    }

    protected Card addCard(Card drawnCard) {
        HAND.add(drawnCard);
        return drawnCard;
    }

    protected void hit() {
        // draw card from deck
    }

    protected void stay() {
        // pass turn to next player
    }

}
