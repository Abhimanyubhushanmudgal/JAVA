import java.util.Scanner;

public class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double tempCelsius = s.nextDouble();
        s.close();

        double tempFahrenheit = celsiusToFahrenheit(tempCelsius);
        System.out.printf("%.2f°C is equal to %.2f°F%n", tempCelsius, tempFahrenheit);
    }
}
