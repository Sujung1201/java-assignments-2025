public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount() {
        this(0, 0.0, 0.0);
    }

    public CheckingAccount(int id, double balance, double overdraft) {
        super(id, balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "Checking Account\nID: " + getID() + "\nBalance: $" + getBalance() +
                "\nOverdraft: $" + overdraft + "\nDate Created: " + getDateCreated();
    }
}
