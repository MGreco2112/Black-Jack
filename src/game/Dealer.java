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
    public String getBet() {
        return "The Dealer cannot bet";
    }

    @Override
    public void getActon() {

    }
}
