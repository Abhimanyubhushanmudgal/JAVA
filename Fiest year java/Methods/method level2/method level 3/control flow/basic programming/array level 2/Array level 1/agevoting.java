import java.util.Scanner;

public class agevoting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ages = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = s.nextInt();
        }

        for (int j=0;j<10;j++) {
            if (ages[j] < 0) {
                System.out.println("Invalid age: " + ages[j]);
            } else if (ages[j] >= 18) {
                System.out.println("The student with the age " + ages[j] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[j] + " cannot vote.");
            }
        }
        
        s.close();
    }
}