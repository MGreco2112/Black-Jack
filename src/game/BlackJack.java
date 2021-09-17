package game;

import card.Card;
import card.Deck;
import card.StandardDeck;

import java.util.*;

public class BlackJack {
    //         -BlackJack (HashMap scoringTable, int numOfPlayers, List players, round, turn, endOfGame, score)

    protected final int NUM_OF_PLAYERS;
    protected Player activePlayer;
    protected final List<Player> PLAYERS = new ArrayList<>();
    private final Map<String, Integer> SCORING_CHART = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);
    private final Deck DECK = new StandardDeck();
    private final List<Card> DISCARD = new ArrayList<>();

    public BlackJack() {
        System.out.println("Dealer: Welcome to the Table, how many will be joining us?\nEnter a number");
        NUM_OF_PLAYERS = Integer.parseInt(scanner.nextLine());

        while (PLAYERS.size() < NUM_OF_PLAYERS) {
            System.out.println("Enter the name of the player:");
            String name = scanner.nextLine();
            PLAYERS.add(new Player(name));
        }
    }

    public void start() {
        setupGame();
    }

    public void setupGame() {
        for (Player player : PLAYERS) {
            activePlayer = player;
            drawCard(2);
        }
    }

    private void drawCard() {
        activePlayer.addCard(DECK.deal());
    }

    private void drawCard(int numCards) {
        for (int i = 0; i < numCards; i++) {
            activePlayer.addCard(DECK.deal());
        }
    }

}
