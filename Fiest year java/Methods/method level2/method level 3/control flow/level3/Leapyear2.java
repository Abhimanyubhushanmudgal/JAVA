import java.util.Scanner;

public class Leapyear2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the year: ");
        int year = s.nextInt();
        if(year>=1582)
        {
           if(year%4==0)
           {
             if(year%100!=0||year%400==0)
             {
               System.out.println("yes it is a leap year");
             }
             else
             {
                System.out.println("not a leap year");
             }
           }
           else
           {
            System.out.println("it is not a leap year");
           }
        }
        else
        {
            System.out.println("enter a valid year after 1582");
        }
        s.close();
    }
    
    
}
