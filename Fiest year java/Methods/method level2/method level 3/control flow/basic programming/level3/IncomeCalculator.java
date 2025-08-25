import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your salary: ");
        double salary = s.nextDouble();
        
        System.out.print("Enter your bonus: ");
        double bonus = s.nextDouble();
        
        s.close();
        
        double totalIncome = salary + bonus;
        
        System.out.printf("Your total income is: %f%n", totalIncome);
    }
}
