package game;

import java.util.*;

public class BlackJack {
    //         -BlackJack (HashMap scoringTable, int numOfPlayers, List players, round, turn, endOfGame, score)

    protected final int NUM_OF_PLAYERS;
    protected final List<Player> PLAYERS = new ArrayList<>();
    private final Map<String, Integer> SCORING_CHART = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public BlackJack() {
        System.out.println("Dealer: Welcome to the Table, how many will be joining us?\nEnter a number");
        NUM_OF_PLAYERS = Integer.parseInt(scanner.nextLine());

        while (PLAYERS.size() < NUM_OF_PLAYERS) {
            System.out.println("Enter the name of the player:");
            String name = scanner.nextLine();
            PLAYERS.add(new Player(name));
        }
    }
}
