import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DriverManager_1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        Properties info = new Properties();
        info.put("user", "username");
        info.put("password", "password");

        try {
            Connection connection = DriverManager.getConnection(url, info);
            System.out.println("Connection established successfully");
            // Use the connection for database operations
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}
