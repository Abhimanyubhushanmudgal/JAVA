import java.util.Scanner;

public class EmployeeManagementProcedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        double[] salaries = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter salary of " + names[i] + ": ");
            salaries[i] = scanner.nextDouble();
        }

        
        double maxSalary = salaries[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
                maxIndex = i;
            }
        }

        System.out.println("\nHighest Paid Employee: " + names[maxIndex]);
        System.out.println("Salary: " + maxSalary);

        scanner.close();
    }
}
