import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseHandler dbHandler = new DatabaseHandler();

        // Get job description
        System.out.print("Enter the job description: ");
        String jobDescription = scanner.nextLine();

        // Get resume content
        System.out.print("Enter the resume content: ");
        String resumeContent = scanner.nextLine();

        // Calculate score
        double score = ScoreCalculator.calculateMatchScore(resumeContent, jobDescription);
        System.out.println("Score: " + score);

        // Check if score is above 80
        if (score > 80) {
            // Get candidate's name and email
            System.out.print("Enter candidate's name: ");
            String candidateName = scanner.nextLine();

            System.out.print("Enter candidate's email: ");
            String candidateEmail = scanner.nextLine(); // you may want to save the email in the DB as well

            // Save to database
            dbHandler.saveShortlistedResume(candidateName, resumeContent, score);
        } else {
            System.out.println("Resume not shortlisted.");
        }

        scanner.close();
    }
}
