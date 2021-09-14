package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheatersDeck implements Deck{
    private final Scanner scanner = new Scanner(System.in);
    public final String[] SUITS = new String[] {"Clubs", "Hearts", "Diamonds", "Spades"};
    public final String[] VALUES = new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King"};


    @Override
    public void shuffle() {

    }

    @Override
    public void printDeck() {

    }

    @Override
    public Card deal() {
        int suitIndex = -1;
        int valueIndex = -1;

        do {
            System.out.println("What Card would you like?\nEnter a Suit (1 - 4): ");
            System.out.println(Arrays.toString(SUITS));

            try {
                suitIndex = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (Exception e) {
                System.out.println("Invalid entry, try again");
                suitIndex = -1;
            }

        } while (suitIndex < 0 || suitIndex > SUITS.length - 1);

        do {
            System.out.println(Arrays.toString(VALUES));
            System.out.println("Of which value (1 - 13)?");

            try {
                valueIndex = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (Exception e) {
                System.out.println("Invalid entry, try again");
                valueIndex = -1;
            }
        } while (valueIndex < 0 || valueIndex > VALUES.length - 1);


        return new Card(SUITS[suitIndex], VALUES[valueIndex]);
    }
}
