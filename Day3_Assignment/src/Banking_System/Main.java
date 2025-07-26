package Banking_System;

public class Main {
    public static void main(String[] args) {
        BankBranch branch = new BankBranch("B001", "Main Branch");

        Customer c1 = new Customer("C001", "Alice");
        System.out.println("~ Customer Created: " + c1.getName() + " [Customer ID: " + c1.getCustomerId() + "]");
        branch.addCustomer(c1);

        SavingsAccount sa = new SavingsAccount("S001", 5000.0);
        CurrentAccount ca = new CurrentAccount("C001", 2000.0);

        c1.addAccount(sa);
        c1.addAccount(ca);

        System.out.println("~ Savings Account [S001] opened with initial balance: ₹5000.0");
        System.out.println("~ Current Account [C001] opened with initial balance: ₹2000.0 and overdraft limit ₹1000.0\n");

        // Deposit to Savings
        System.out.println("-> Deposited ₹2000.0 to Savings Account [S001]");
        sa.deposit(2000.0);
        System.out.println("$ Current Balance: ₹" + sa.checkBalance()+"\n");

        // Withdraw from Current
        System.out.println("-> Withdrawn ₹2500.0 from Current Account [C001]");
        ca.withdraw(2500.0);
        double cb = ca.checkBalance();
        if (cb < 0)
            System.out.println("$ Current Balance: ₹" + cb + " (Using Overdraft)\n");
        else
            System.out.println("$ Current Balance: ₹" + cb+"\n");

        // Transfer
        System.out.println("<=> Transferred ₹1000.0 from Savings Account [S001] to Current Account [C001]");
        sa.transfer(ca, 1000.0);
        System.out.println("$ Savings Balance: ₹" + sa.checkBalance());
        System.out.println("$ Current Balance: ₹" + ca.checkBalance()+"\n");

        // Transaction History
        System.out.println("^ Transaction History:");
        sa.showTransactionHistory();
        ca.showTransactionHistory();
    }
}
