import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number to count its digits: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int originalNumber = number;
        
        if (number == 0) {
            count = 1; 
        } else {
            while (originalNumber != 0) {
                originalNumber /= 10; 
                count++;
            }
        }
        
        System.out.println("The number " + number + " has " + count + " digits.");
        
        scanner.close();
    }
}
