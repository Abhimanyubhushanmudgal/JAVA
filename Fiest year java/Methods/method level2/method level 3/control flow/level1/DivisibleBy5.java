import java.util.Scanner;
public class DivisibleBy5{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s.nextInt();
        if (number % 5 == 0 ) 
        {
            System.out.println("number is divible by 5");

            
        }
        else{
            System.out.println("number is not divisible by 5");

        }
        s.close();
    }
}