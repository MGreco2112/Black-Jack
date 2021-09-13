package com.company;

import card.*;

public class Main {

    public static void main(String[] args) {
        Deck deck = new StandardDeck();

        deck.shuffle();
        deck.printDeck();
    }
}
