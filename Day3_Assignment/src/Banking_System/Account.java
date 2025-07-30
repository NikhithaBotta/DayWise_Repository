package Banking_System;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements BankOperations {
    protected String accountNumber;
    protected double balance;
    protected List<String> transactionHistory = new ArrayList<>();

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void transfer(Account target, double amount) {
        this.balance -= amount;
        target.balance += amount;
        addTransaction("➡ Transferred to Account " + target.accountNumber + ": ₹" + amount);
        target.addTransaction("➡ Received from Account " + this.accountNumber + ": ₹" + amount);
    }

    public double checkBalance() {
        return balance;
    }

    public void addTransaction(String info) {
        transactionHistory.add(info);
    }

    public void showTransactionHistory() {
        System.out.println("^ Transaction History:");
        System.out.println("Account: " + accountNumber);
        for (String entry : transactionHistory) {
            System.out.println(" - " + entry);
        }
    }
}
