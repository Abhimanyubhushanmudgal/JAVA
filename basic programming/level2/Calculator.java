
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        System.out.println("sum is "+(a+b));
        System.out.println("the diffence is "+(a-b));
        System.out.println("the product is "+(a*b));
        System.out.println("the division is "+(double)(a/b));
        
    }

    }

        