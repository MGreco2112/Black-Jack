package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheatersDeck implements Deck{
    private final Scanner scanner = new Scanner(System.in);
    private final List<Card> CARDS = new ArrayList<>();
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
        System.out.println("What Card would you like?\nEnter a Suit (1 - 4): ");
        System.out.println(Arrays.toString(SUITS));
        int suitIndex = Integer.parseInt(scanner.nextLine()) -1 ;
        System.out.println(Arrays.toString(VALUES));
        System.out.println("Of which value (1 - 13)?");
        int valueIndex = Integer.parseInt(scanner.nextLine()) - 1;


        return new Card(SUITS[suitIndex], VALUES[valueIndex]);
    }
}
