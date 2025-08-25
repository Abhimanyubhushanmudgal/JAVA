import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() only
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        if (start < 0 || end > str.length() || start > end) {
            return result; // return empty string for invalid range
        }
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Validate indices before using built-in substring
        String substringByBuiltIn = "";
        if (start >= 0 && end <= mainString.length() && start <= end) {
            substringByBuiltIn = mainString.substring(start, end);
        }

        // Create custom substring and compare
        String substringByCharAt = createSubstringUsingCharAt(mainString, start, end);
        boolean comparisonResult = compareStringsUsingCharAt(substringByCharAt, substringByBuiltIn);

        // Output
        System.out.println("Substring using charAt(): " + substringByCharAt);
        System.out.println("Substring using built-in substring(): " + substringByBuiltIn);
        System.out.println("Are both substrings equal? " + comparisonResult);

        scanner.close();
    }
}
