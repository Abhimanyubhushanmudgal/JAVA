import java.util.Scanner;

public class PoundstoKilogramsConverter {
    
    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = poundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
        scanner.close();
    }
}