import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "password");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS StudentDB");
            System.out.println("Student Database Created");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}