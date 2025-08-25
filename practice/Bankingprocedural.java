import java.util.Scanner;

public class Bankingprocedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of savings accounts: ");
        int n = scanner.nextInt();

        double[] balances = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter balance for account " + (i + 1) + ": ");
            balances[i] = scanner.nextDouble();
            total += balances[i];
        }

        System.out.println("Total Balance in All Savings Accounts: " + total);

        scanner.close();
    }
}
