import java.util.Scanner;

public class NumberCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10]; 
        double total = 0.0;                
        int index = 0;                     

        System.out.println("Enter up to 10 positive numbers (0 or negative to stop):");

       
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

        
            if (input <= 0) {
                break;
            }

          
            if (index == 10) {
                System.out.println("Array is full. Cannot accept more numbers.");
                break;
            }

            
            numbers[index] = input;
            index++;
        }

       
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        
        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total sum = " + total);

        scanner.close();
    }
}
