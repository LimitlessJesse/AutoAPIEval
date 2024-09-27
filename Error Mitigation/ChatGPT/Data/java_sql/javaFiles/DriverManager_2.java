import java.sql.DriverManager;
import java.io.PrintWriter;

public class DriverManager_2 {
    public static void main(String[] args) {
        PrintWriter logWriter = DriverManager.getLogWriter();
        System.out.println("Log writer: " + logWriter);
    }
}
