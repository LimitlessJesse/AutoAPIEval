import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManager_3 {
    public static void main(String[] args) {
        try {
            int loginTimeout = DriverManager.getLoginTimeout();
            System.out.println("Login timeout: " + loginTimeout);
        } catch (SQLException e) {
            System.err.println("Error fetching login timeout: " + e.getMessage());
        }
    }
}
