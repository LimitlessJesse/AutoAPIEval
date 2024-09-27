import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManager_4 {
    public static void main(String[] args) {
        try {
            DriverManager.setLoginTimeout(10); // Setting login timeout to 10 seconds
            System.out.println("Login timeout set successfully.");
        } catch (SQLException e) {
            System.out.println("Error setting login timeout: " + e.getMessage());
        }
    }
}
