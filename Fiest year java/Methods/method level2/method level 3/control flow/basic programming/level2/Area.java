import java.util.Scanner;
class Area {
        public static void main(String[] args) 
        {
        System.out.println("enter the height of the triangle in centimeters");
        Scanner s=new Scanner(System.in);
        double height = s.nextDouble();
        System.out.println("enter the base in centimeters");
        double base= s.nextDouble();
        double area = (base * height)/2 ;
        System.out.println("the are of triangle is "+area);
        }
    }
        