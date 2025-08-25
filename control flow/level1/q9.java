import java.util.Scanner;
public class q9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Seconds: ");
        n = sc.nextInt();
        for (int i = n; i > 0; i--)
        {
            System.out.print(i+" ");
        }
    }    
}