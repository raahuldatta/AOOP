import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecords {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM Registration";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Program: " + rs.getString("program"));
                System.out.println("---------------------------");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}