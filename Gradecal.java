import java.util.Scanner;
class Gradecal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter marks for subject out of 100:");
            int numSubjects = 0;
            int totalMarks = 0;
            while (true) {
                System.out.print("Subject " + (numSubjects + 1) + ": ");
                int marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Marks should be between 0 and 100");
                    continue;
                }
                totalMarks += marks;
                numSubjects++;
                if (numSubjects >= 3) {
                    break;
                }
            }
            double averagePercentage = (double) totalMarks / numSubjects;
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
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);
        }
    }
}
