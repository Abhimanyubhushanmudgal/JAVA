public class IncrementDemo {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Original value of i: " + i);

        // Post-increment: use the value first, then increment
        System.out.println("Post-increment (i++): " + (i++));
        System.out.println("Value of i after post-increment: " + i);

        // Resetting i for clarity
        i = 5;

        // Pre-increment: increment the value first, then use it
        System.out.println("Pre-increment (++i): " + (++i));
        System.out.println("Value of i after pre-increment: " + i);
    }
}
