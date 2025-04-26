public class SavingsAccount extends Account {
    private double annualInterestRate;

    public SavingsAccount() {
        this(0, 0.0, 0.0);
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return "Savings Account\nID: " + getID() + "\nBalance: $" + getBalance() +
                "\nAnnual Interest Rate: " + annualInterestRate + "\nDate Created: " + getDateCreated();
    }
}