import java.util.Scanner;

public class remainder{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter divident");
        int divident= s.nextInt();
        System.out.println("enter diviser");
        int diviser = s.nextInt();
        int q = divident / diviser;
        int r = divident % diviser;
        System.out.println("the quotient is "+q);
        System.out.println("the remainder is "+r);

        s.close();
        
    }}