import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler {
    private final String url = "jdbc:mysql://localhost:3306/ats_db";
    private final String user = "root"; // replace with your MySQL username
    private final String password = "1234"; // replace with your MySQL password

    public void saveShortlistedResume(String candidateName, String resumeText, double score) {
        String sql = "INSERT INTO shortlisted_resumes (candidate_name, resume_text, score) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, candidateName);
            pstmt.setString(2, resumeText);
            pstmt.setDouble(3, score);
            pstmt.executeUpdate();
            System.out.println("Resume saved successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
