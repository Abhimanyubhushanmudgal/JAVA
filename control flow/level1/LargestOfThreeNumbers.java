import java.util.Scanner;

 class LargestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = s.nextInt();
        System.out.println("Enter the second number:");
        int num2 = s.nextInt();
        System.out.println("Enter the third number:");
        int num3 = s.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The first number " + num1 + " is the largest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The second number " + num2 + " is the largest.");
        } else {
            System.out.println("The third number " + num3 + " is the largest.");
        }

        s.close(); 
}
}