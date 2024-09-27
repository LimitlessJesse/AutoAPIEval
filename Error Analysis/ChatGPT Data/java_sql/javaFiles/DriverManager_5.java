import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManager_5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        
        try {
            Connection connection = DriverManager.getConnection(url, "username", "password");
            System.out.println("Connection established successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}
