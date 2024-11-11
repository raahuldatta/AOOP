import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecords {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");
            String updateSQL = "UPDATE Registration SET program = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(updateSQL);

            stmt.setString(1, "Data Science");
            stmt.setInt(2, 100);
            stmt.executeUpdate();

            stmt.setString(1, "Aerospace Engineering");
            stmt.setInt(2, 101);
            stmt.executeUpdate();

            System.out.println("Records Updated");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}