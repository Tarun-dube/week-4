package BankTransactionSystem;

// BankAccount class
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method that handles exceptions
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");  // Negative amount check
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");  // Insufficient balance check
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
