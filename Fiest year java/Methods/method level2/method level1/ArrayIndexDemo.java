import java.util.Scanner;

public class ArrayIndexDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexException(String[] names) {
        // This line will generate ArrayIndexOutOfBoundsException if index exceeds the array length
        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleArrayIndexException(String[] names) {
        try {
            // This line may throw ArrayIndexOutOfBoundsException if index is invalid
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        // Define the array to store the names
        String[] names = new String[n];

        // Take user input for names
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("\nCalling method that generates exception:");
        try {
            generateArrayIndexException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception internally:");
        handleArrayIndexException(names);

        scanner.close();
    }
}
