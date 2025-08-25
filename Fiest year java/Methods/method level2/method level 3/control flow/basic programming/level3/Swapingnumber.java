import java.util.Scanner;

public class Swapingnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = s.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = s.nextInt();
        int temp;
        s.close();
        
       
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNum);
        System.out.println("Second number: " + secondNum);
    }
}
