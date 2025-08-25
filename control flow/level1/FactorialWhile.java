
import java.util.Scanner;

public class FactorialWhile {
    


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=1;
        int factorial = 1;
        System.out.println("enter the number till you want factorial");
        int num = s.nextInt();
        while (i<=num)
        {
             factorial = factorial*i;
             i++;
        }
    System.out.println("factorial is: " + factorial);
    s.close();


    
}
    
}
