public class ScoreCalculator {
    public static double calculateMatchScore(String resume, String jobDescription) {
        // Simple scoring logic (you can improve this)
        int matches = 0;

        // Split job description into words
        String[] jobWords = jobDescription.split(" ");
        for (String word : jobWords) {
            if (resume.toLowerCase().contains(word.toLowerCase())) {
                matches++;
            }
        }

        // Calculate score as a percentage (matches / total words in job description)
        double score = (double) matches / jobWords.length * 100;
        return score;
    }
}
