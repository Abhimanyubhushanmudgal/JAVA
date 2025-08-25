class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "Ravi Kumar";
        account.accountNumber = "1234567890";
        account.balance = 10000.50;

        account.displayBalance();
    }
}
