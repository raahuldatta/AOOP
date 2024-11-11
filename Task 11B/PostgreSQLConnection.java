import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLConnection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "username", "password");
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } catch (Exception e) {
            System.out.println("Invalid username or password");
            e.printStackTrace();
        }
    }
}