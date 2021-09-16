package com.company;

import card.*;

import java.util.Scanner;

public class Main {

    /*
    Plan of Attack:
    Classes
        -Card (int Value, String suit, boolean isFaceUp)
        -Deck [Interface] (draw, shuffle, displayDeck)
        -StandardDeck (String[] Suits, int[] Values, shuffle, draw, displayDeck)
        -BlackJack (HashMap scoringTable, int numOfPlayers, List players, round, turn, endOfGame, score)
        -Player (String name, int score, List hand)
     */


    public static void main(String[] args) {
        Deck deck = new StandardDeck();
        Scanner scanner = new Scanner(System.in);

        deck.shuffle();

//        while (((StandardDeck) deck).getCARDSSize() > 0) {
//            int dealtCards = -1;
//            System.out.println("How many cards would you like to deal?");
//
//            try {
//
//                dealtCards = Integer.parseInt(scanner.nextLine());
//            } catch (Exception e) {
//                System.out.println("Invalid choice");
//                dealtCards = 0;
//            }
//
//            for (int i = 0; i < dealtCards; i++) {
//
//                if (((StandardDeck) deck).getCARDSSize() > 0) {
//                    System.out.println(deck.deal());
//                } else {
//                    break;
//                }
//            }
//        }
    }
}
