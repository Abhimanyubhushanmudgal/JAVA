import java.util.Scanner;

public class CharArrayComparison {

    // Method to get characters from a string without using toCharArray()
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get characters using user-defined method
        char[] customCharArray = getCharsUsingCharAt(input);

        // Get characters using built-in toCharArray()
        char[] builtInCharArray = input.toCharArray();

        // Compare the two arrays
        boolean result = compareCharArrays(customCharArray, builtInCharArray);

        // Display results
        System.out.print("Characters using user-defined method: ");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both character arrays equal? " + result);

        scanner.close();
    }
}
