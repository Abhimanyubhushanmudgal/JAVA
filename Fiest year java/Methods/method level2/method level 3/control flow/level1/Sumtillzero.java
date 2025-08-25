import java.util.Scanner;
public class Sumtillzero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i =1;
        int sum = 0;
        while (true) { 
            System.out.println("enter "+i+" number");
            int num = s.nextInt();
            if(num == 0)
            {
                break;
            }
            sum = sum+num;
            i++;


        }
        System.out.println("the sum of all the numbers is: "+sum);
    }
}
