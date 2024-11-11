import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");
            String insertSQL = "INSERT INTO Registration (id, name, address, program) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insertSQL);

            stmt.setInt(1, 100);
            stmt.setString(2, "John Doe");
            stmt.setString(3, "123 Main St");
            stmt.setString(4, "Computer Science");
            stmt.executeUpdate();

            stmt.setInt(1, 101);
            stmt.setString(2, "Jane Doe");
            stmt.setString(3, "456 Oak St");
            stmt.setString(4, "Mechanical Engineering");
            stmt.executeUpdate();

            stmt.setInt(1, 102);
            stmt.setString(2, "Alice Smith");
            stmt.setString(3, "789 Pine St");
            stmt.setString(4, "Electrical Engineering");
            stmt.executeUpdate();

            stmt.setInt(1, 103);
            stmt.setString(2, "Bob Brown");
            stmt.setString(3, "101 Maple St");
            stmt.setString(4, "Civil Engineering");
            stmt.executeUpdate();

            System.out.println("Records Inserted");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}