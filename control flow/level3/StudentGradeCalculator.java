import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;
  
        String grade;
        String remarks;
        
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Satisfactory";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        
      
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}
