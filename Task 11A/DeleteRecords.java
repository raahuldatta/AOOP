import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecords {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");
            String deleteSQL = "DELETE FROM Registration WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(deleteSQL);

            stmt.setInt(1, 101);
            stmt.executeUpdate();

            System.out.println("Record Deleted");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}