import java.util.Scanner;

public class TravelComputation {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = scanner.nextLine();
      System.out.print("Enter from city: ");
      String fromCity = scanner.nextLine();
      System.out.print("Enter via city: ");
      String viaCity = scanner.nextLine();
      System.out.print("Enter to city: ");
      String toCity = scanner.nextLine();
      System.out.print("Enter distance from " + fromCity + " to " + viaCity + ": ");
      double distanceFromToVia = scanner.nextDouble();
      System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = scanner.nextInt();
      System.out.print("Enter distance from " + viaCity + " to " + toCity + ": ");
      double distanceViaToFinalCity = scanner.nextDouble();
      System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = scanner.nextInt();
      
      scanner.close();
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
      System.out.println("\nTraveler: " + name);
      System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
      System.out.println("Total Distance: " + totalDistance + " km");
      System.out.println("Total Travel Time: " + totalTime + " minutes");
   }
}
