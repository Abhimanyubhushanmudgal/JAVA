import java.util.Scanner;

public class AreaOfTrinangle { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter base:");
        float base = s.nextFloat();
        float inchBase = base / 2.54f; 

        System.out.println("Enter height:");
        float height = s.nextFloat();
        float inchHeight = height / 2.54f;

        float area = 0.5f * inchBase * inchHeight; 

        System.out.printf("The area in square inches is: %.2f%n", area); 

        s.close();
    }
}
