import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();
        double totalMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            double marks = sc.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--;
                continue;
            }
            totalMarks += marks;
        }
        double averagePercentage = totalMarks / subjects;
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
