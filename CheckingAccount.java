package Bank_Account;

public class CheckingAccount extends Bank_Account.Account {

    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(double OVERDRAFT_LIMIT) {
        this.OVERDRAFT_LIMIT = OVERDRAFT_LIMIT;
    }

    public CheckingAccount(String name, int id, double balance, double annualInterestRate, double OVERDRAFT_LIMIT) {
        super(name, id, balance, annualInterestRate);
        this.OVERDRAFT_LIMIT = OVERDRAFT_LIMIT;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                " OVERDRAFT_LIMIT=" + OVERDRAFT_LIMIT +
                '}';
    }
}

