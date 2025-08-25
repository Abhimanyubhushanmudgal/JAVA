import java.util.Scanner;
public class Squareofanumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("enter the number to square root");
        // int n = s.nextInt();
        // double m = Math.sqrt(n);
        // System.out.println("the aquare root of the number is "+ m);
        System.out.println("enter the three numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = Math.min(a,b);
        int e = Math.min(c,d);
        System.out.println("the minimumm of the three numbers is "+ e);
        s.close();
    }
}
