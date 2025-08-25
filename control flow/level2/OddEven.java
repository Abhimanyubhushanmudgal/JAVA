import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number till you want to print odd and even digits");
        int num = s.nextInt();
        if(num>0)
        {

        
        for(int i = 1;i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" is an even number");
            }
            else
            {
                System.out.println(i+" is an odd number");
            }
        }
    }
    else
    {
        System.out.println("enter a valid number");

    }
        s.close();
    }
    
}
