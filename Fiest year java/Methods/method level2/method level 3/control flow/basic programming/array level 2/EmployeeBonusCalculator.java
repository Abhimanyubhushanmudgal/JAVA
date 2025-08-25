import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            while (true) {
                try {
                    System.out.print("Enter salary: ");
                    salary[i] = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter years of service: ");
                    years[i] = Double.parseDouble(scanner.nextLine());

                    if (salary[i] <= 0 || years[i] < 0) {
                        System.out.println("Invalid input. Salary must be > 0 and years >= 0. Try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                }
            }
        }


        for (int i = 0; i < EMP_COUNT; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        
        System.out.println("\n----- Summary Report -----");
        System.out.printf("Total old salary of all employees: $%.2f\n", totalOldSalary);
        System.out.printf("Total bonus payout: $%.2f\n", totalBonus);
        System.out.printf("Total new salary after bonus: $%.2f\n", totalNewSalary);
    }
}
