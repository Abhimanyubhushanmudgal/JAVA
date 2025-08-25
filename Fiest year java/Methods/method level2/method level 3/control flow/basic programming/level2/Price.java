import java.util.Scanner;


public class Price {
    public static void main(String[] args) {
        System.out.println("Enter the unit price");
        Scanner s=new Scanner(System.in);
        int price = s.nextInt();
        System.out.println("enter the quantity");
        int quantity = s.nextInt();
        int total=price * quantity;
        System.out.println("the total price of the items are "+ total);
        s.close();
    }
}
