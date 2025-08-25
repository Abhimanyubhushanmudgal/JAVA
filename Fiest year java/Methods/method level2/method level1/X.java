import java.util.Scanner;

public class X {

    // Custom method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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

        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String input1 = scanner.next();

        System.out.print("Enter the second string: ");
        String input2 = scanner.next();

        // Compare using charAt
        boolean customComparison = compareUsingCharAt(input1, input2);

        // Compare using built-in equals
        boolean builtInComparison = input1.equals(input2);

        // Display both results
        System.out.println("Comparison using charAt(): " + customComparison);
        System.out.println("Comparison using equals(): " + builtInComparison);

        // Check if both methods give the same result
        if (customComparison == builtInComparison) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println("Methods returned different results.");
        }

        scanner.close();
    }
}
