import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManager_2 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        
        try {
            DriverManager.setLogWriter(writer);
            System.out.println("Log writer set successfully.");
        } catch (SQLException e) {
            System.out.println("Error setting log writer: " + e.getMessage());
        }
    }
}
