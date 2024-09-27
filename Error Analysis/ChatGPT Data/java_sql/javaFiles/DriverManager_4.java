import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManager_4 {
    public static void main(String[] args) {
        int timeoutSeconds = 10;
        try {
            DriverManager.setLoginTimeout(timeoutSeconds);
            System.out.println("Login timeout set to " + timeoutSeconds + " seconds.");
        } catch (SQLException e) {
            System.out.println("Error setting login timeout: " + e.getMessage());
        }
    }
}
