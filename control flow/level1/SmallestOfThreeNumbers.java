import java.util.Scanner;

public class SmallestOfThreeNumbers {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1 = s.nextInt();
    System.out.println("Enter Second number: ");
    int num2 = s.nextInt();
    System.out.println("Enter Third number: ");
    int num3 = s.nextInt();
    if (num1<=num2 && num1<=num3)
    {
        System.out.println("The First number is the smallest number");

    }
    else
    {
        System.out.println("thi first number is not the smallest one");

    }
    s.close();
}    

}
