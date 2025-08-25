class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Bank {
    private Account[] accounts;
    private int count = 0;

    public Bank(int size) {
        accounts = new Account[size];
    }

    public void addAccount(Account account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        }
    }

    public double calculateTotalBalance() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }
}

public class BankingOOP {
    public static void main(String[] args) {
        Bank bank = new Bank(4);
        bank.addAccount(new Account(1200.50));
        bank.addAccount(new Account(2300.75));
        bank.addAccount(new Account(500.00));
        bank.addAccount(new Account(980.20));

        System.out.println("Total Balance in All Savings Accounts: " + bank.calculateTotalBalance());
    }
}
