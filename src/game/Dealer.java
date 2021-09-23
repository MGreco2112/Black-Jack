package game;

public class Dealer implements Actor{
    protected final String NAME;
    protected final int BALANCE = 0;

    public Dealer(String name) {
        this.NAME = name;
    }


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getBalance() {
        return BALANCE;
    }

    @Override
    public String getBet(int Wallet) {
        return "The Dealer cannot bet";
    }

    @Override
    public void getActon(int choice) {
        switch (choice) {
            case 1 -> takeBet();

            case 2 -> hitPlayer();

            default -> System.out.println("Invalid choice");
        }
    }

    public void takeBet() {

    }

    public void hitPlayer() {

    }
}
