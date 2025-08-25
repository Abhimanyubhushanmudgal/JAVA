import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexException(String text) {
        // Attempt to access an invalid index (length is text.length(), so this is out of bounds)
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleStringIndexException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index accessed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        System.out.println("\nCalling method that generates exception:");
        try {
            generateStringIndexException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception internally:");
        handleStringIndexException(userInput);

        scanner.close();
    }
}
