import java.util.Scanner;

 class VotingEligibility {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = s.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
            System.out.println("You need to be at least 18 years old."); 
            
        }

        s.close(); 
    }
}