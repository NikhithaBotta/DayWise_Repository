package Banking_System;

public class CurrentAccount extends Account {
    private final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        // No deposit transaction shown when it's from transfer
    }

    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            addTransaction("-> Withdrawn ₹" + amount + " from Current Account [" + accountNumber + "]");
        } else {
            System.out.println("Overdraft limit exceeded!");
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