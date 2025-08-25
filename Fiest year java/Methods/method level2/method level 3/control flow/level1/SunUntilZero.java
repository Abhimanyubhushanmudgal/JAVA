import java.util.Scanner;

public class SunUntilZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0;
        
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            if (s.hasNextDouble()) {
                double num = s.nextDouble();
                if (num == 0) {
                    break;
                }
                total = total + num;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                s.next(); 
            }
        }
        
        System.out.println("Total sum: " + total);
        s.close();
    }
}
