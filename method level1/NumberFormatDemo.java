import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormat(String text) {
        // This line throws NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormat(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input as a string
        System.out.print("Enter a number (as text): ");
        String userInput = scanner.next();

        System.out.println("\nCalling method that generates exception:");
        try {
            generateNumberFormat(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception internally:");
        handleNumberFormat(userInput);

        scanner.close();
    }
}
