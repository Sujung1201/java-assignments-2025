import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private Date dateCreated;

    public Account() {
        this(0, 0.0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account\nID: " + id + "\nBalance: $" + balance + "\nDate Created: " + dateCreated;
    }
}