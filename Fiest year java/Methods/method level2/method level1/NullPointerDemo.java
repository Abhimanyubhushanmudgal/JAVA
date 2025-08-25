public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleNullPointerException() {
        String text = null;
        try {
            // This line may throw NullPointerException
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: text is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method that generates exception:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception internally:");
        handleNullPointerException();
    }
}

