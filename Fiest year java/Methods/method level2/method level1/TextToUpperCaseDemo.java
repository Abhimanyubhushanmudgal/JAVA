import java.util.Scanner;

public class TextToUpperCaseDemo {

    // Method to convert text to uppercase using charAt() method
    public static String convertToUpperCaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert lowercase character to uppercase
                result.append((char) (currentChar - 32));
            } else {
                // If it's not a lowercase letter, add it as is
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Convert text to uppercase using charAt()
        String upperCaseUsingCharAt = convertToUpperCaseUsingCharAt(inputText);

        // Convert text to uppercase using built-in method toUpperCase()
        String upperCaseUsingBuiltIn = inputText.toUpperCase();

        // Compare the two uppercase strings
        boolean isEqual = compareStrings(upperCaseUsingCharAt, upperCaseUsingBuiltIn);

        // Display the results
        System.out.println("\nConverted to uppercase using charAt(): " + upperCaseUsingCharAt);
        System.out.println("Converted to uppercase using toUpperCase(): " + upperCaseUsingBuiltIn);
        System.out.println("\nAre both uppercase texts equal? " + isEqual);

        scanner.close();
    }
}
