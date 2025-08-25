import java.util.Scanner;

public class TEmpratureConversion {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double tempFahrenheit = s.nextDouble();
        s.close();

        double tempCelsius = fahrenheitToCelsius(tempFahrenheit);
        System.out.printf("%.2f°F is equal to %.2f°C%n", tempFahrenheit, tempCelsius);
    }
}
