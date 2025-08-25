import java.util.Scanner;



public class Squareside

{
    public static void main(String[] args) {
        System.out.println("enter the  parameter of the sqaure");
        Scanner s= new Scanner(System.in);
        int parameter = s.nextInt();
        int side = parameter/4;
        System.out.println("the side of the square is " +side);
        s.close();

    }
}
