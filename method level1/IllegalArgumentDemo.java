import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgument(String text) {
        // Intentionally setting start > end
        System.out.println("Substring with start=5 and end=2: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleIllegalArgument(String text) {
        try {
            // Same invalid indices
            System.out.println("Substring with start=5 and end=2: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.println("\nCalling method that generates exception:");
        try {
            generateIllegalArgument(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception internally:");
        handleIllegalArgument(input);

        scanner.close();
    }
}
