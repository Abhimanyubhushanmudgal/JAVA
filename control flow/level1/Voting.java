import java.util.Scanner;
public class Voting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if (age < 18)
        {
            System.out.print("The person cannot vote");
        }
        else
        {
            System.out.print("The person can vote");
        }
    }
}