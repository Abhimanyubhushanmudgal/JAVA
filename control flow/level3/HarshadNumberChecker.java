import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number to check if it is a Harshad number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        
       
        while (originalNumber > 0) {
            sum += originalNumber % 10; 
            originalNumber /= 10; 
        }
        
       
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
        
        scanner.close();
    }
}
