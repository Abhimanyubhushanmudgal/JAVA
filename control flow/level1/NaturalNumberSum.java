import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            s.close(); 
            return; 
        }
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        System.out.println("Sum of natural numbers up to " + n + " (using loop): " + sum1);
        
        s.close(); 
    }
}