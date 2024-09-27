import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManager_5 {
    public static void main(String[] args) {
        try {
            int loginTimeout = DriverManager.getLoginTimeout();
            System.out.println("Driver login timeout: " + loginTimeout);
        } catch (SQLException e) {
            System.out.println("Error getting login timeout: " + e.getMessage());
        }
    }
}
