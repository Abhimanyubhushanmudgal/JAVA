import java.util.Scanner;

public class TextToLowerCaseDemo {

    // Method to convert text to lowercase using charAt() method
    public static String convertToLowerCaseUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert uppercase character to lowercase
                result.append((char) (currentChar + 32));
            } else {
                // If it's not an uppercase letter, add it as is
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

        // Convert text to lowercase using charAt()
        String lowerCaseUsingCharAt = convertToLowerCaseUsingCharAt(inputText);

        // Convert text to lowercase using built-in method toLowerCase()
        String lowerCaseUsingBuiltIn = inputText.toLowerCase();

        // Compare the two lowercase strings
        boolean isEqual = compareStrings(lowerCaseUsingCharAt, lowerCaseUsingBuiltIn);

        // Display the results
        System.out.println("\nConverted to lowercase using charAt(): " + lowerCaseUsingCharAt);
        System.out.println("Converted to lowercase using toLowerCase(): " + lowerCaseUsingBuiltIn);
        System.out.println("\nAre both lowercase texts equal? " + isEqual);

        scanner.close();
    }
}
