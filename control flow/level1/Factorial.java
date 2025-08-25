import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int factorial = 1;
        System.out.println("enter the number till you want factorial");
        int num = s.nextInt();
        for (i=1;i<=num;i++)
        {
             factorial = factorial*i;
        }
    System.out.println("factorial is: " + factorial);


    }
}