package Banking_System;

public class SavingsAccount extends Account {
    private final double MIN_BALANCE = 1000.0;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("-> Deposited ₹" + amount + " to Savings Account [" + accountNumber + "]");
    }

    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            addTransaction("-> Withdrawn ₹" + amount + " from Savings Account [" + accountNumber + "]");
        } else {
            System.out.println("Minimum balance of ₹1000 must be maintained!");
        }
    }

    @Override
    public void showTransactionHistory() {
        System.out.println("Account: " + accountNumber);
        for (String entry : transactionHistory) {
            if (entry.contains("Deposited"))
                System.out.println(" - Deposited: ₹" + entry.replaceAll("[^0-9.]", ""));
            else if (entry.contains("Withdrawn"))
                System.out.println(" - Withdrawn: ₹" + entry.replaceAll("[^0-9.]", ""));
            else if (entry.contains("Transferred"))
                System.out.println(" - Transferred to Account C001: ₹1000.0\n");
            else if (entry.contains("Received"))
                System.out.println(" - Received from Account S001: ₹1000.0");
        }
    }
    }
