package BankTransactionSystem;

import java.util.Scanner;


public class BankAccountSystem {

    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance is
        BankAccount account = new BankAccount(1000.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account System");

        // Taking withdrawal amount as input from the user
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            // Attempting to withdraw
            account.withdraw(amount);
            System.out.println("Withdrawal successful, new balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            // Handle insufficient balance exception
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid amount exception
            System.out.println(e.getMessage());
        } finally {
            // Always print this message, regardless of success or failure
            System.out.println("Operation completed.");
        }

        // Close the scanner
        scanner.close();
    }
}
