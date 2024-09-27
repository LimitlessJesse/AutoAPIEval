import java.io.PrintWriter;
import java.sql.DriverManager;

public class DriverManager_3 {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        DriverManager.setLogWriter(writer);
    }
}
