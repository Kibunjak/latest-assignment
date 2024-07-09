public class Assignment {

    // Static variables to store grades
    static int[] courseworkGrades = {85, 75, 80, 70, 65}; // Example coursework grades
    static int examGrade = 85; // Example exam grade

    public static void viewCourseworkResults() {
        System.out.println("Displaying coursework results...");
        int courseworkTotal = calculateCourseworkTotal();
        System.out.println("Coursework Result: " + courseworkTotal + "%");
    }

    public static void viewExamResults() { // Fixed typo in method name
        System.out.println("Displaying exam results...");
        System.out.println("Exam Result: " + examGrade + "%");
    }

    public static void countCourseworkAssessments() {
        String[] assessments = {"Assignment 1", "Assignment 2", "Assignment 3", "CAT 1", "CAT 2"};
        int count = assessments.length;
        System.out.println("Number of coursework assessments done in DIT409 unit: " + count);
    }

    public static void determineCourseworkCompletion() {
        String[] assessments = {"Assignment 1", "Assignment 2", "Assignment 3", "CAT 1", "CAT 2"};
        int count = assessments.length;
        double threshold = (2.0 / 3.0) * count;
        if (count >= threshold) {
            System.out.println("The student has completed 2/3 of the coursework.");
        } else {
            System.out.println("The student has not completed 2/3 of the coursework and is required to repeat the course irrespective of the final exam grade.");
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        int choice;
        char ch;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Count coursework assessments");
            System.out.println("4. Determine coursework completion");
            System.out.println("5. Exit the program");

            System.out.print("Please enter your choice (1-5): ");
            choice = System.in.read() - '0';  // Read a single character and convert it to an integer
            // Consume any remaining characters in the input buffer
            do {
                ch = (char) System.in.read();
            } while (ch != '\n' && ch != -1);

            switch (choice) {
                case 1:
                    viewCourseworkResults();
                    break;
                case 2:
                    viewExamResults();
                    break;
                case 3:
                    countCourseworkAssessments();
                    break;
                case 4:
                    determineCourseworkCompletion();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
    }

    public static int calculateCourseworkTotal() {
        // Calculate and return coursework total
        int total = 0;
        for (int grade : courseworkGrades) {
            total += grade;
        }
        return total / courseworkGrades.length;
    }

    public static int calculateFinalExamScore() {
        // Return the final exam score
        return examGrade;
    }

    public static int calculateTotalScore() {
        // Calculate and return the total score
        return calculateFinalExamScore() + calculateCourseworkTotal();
    }
}
