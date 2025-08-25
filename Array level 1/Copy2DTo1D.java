import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

      
        int[][] matrix = new int[rows][columns];

        System.out.println("\nEnter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        int[] oneDArray = new int[rows * columns];
        int index = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index] = matrix[i][j];
                index++;
            }
        }

       
        System.out.println("\n1D Array (Copied from 2D Array):");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }

        scanner.close();
    }
}
