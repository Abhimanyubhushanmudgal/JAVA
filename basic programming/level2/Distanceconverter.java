import java.util.Scanner;


public class Distanceconverter {
    public static void main(String[] args) {
        System.out.println("Enter the distance in feet");
        Scanner s=new Scanner(System.in);
        int feet = s.nextInt();
        double yard = feet/3;
        double miles= feet/5280;
        System.out.println("the distanve in yards is "+yard+" the distance in miles is "+miles);
    }
}
