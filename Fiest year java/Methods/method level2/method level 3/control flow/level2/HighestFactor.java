import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int max = 0;
        
        

        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                max = i;
            }
        }
        System.out.println("The highest factor is "+max);
        
        scanner.close();
    }
}
