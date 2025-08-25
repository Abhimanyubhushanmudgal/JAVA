import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int maxHandshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes: " + maxHandshakes);
        scanner.close();
    }
}
