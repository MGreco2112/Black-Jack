package com.company;

import card.*;

public class Main {

    public static void main(String[] args) {
        Deck deck = new CheatersDeck();

        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            System.out.println(deck.deal());
        }
    }
}
