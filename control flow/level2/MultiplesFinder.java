import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        scanner.close();
        
        
        for (int i = 1; i <= 100; i++) {
           
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
