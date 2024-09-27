import java.util.logging.LogManager;

public class LogManager_5 {
    public static void main(String[] args) {
        try {
            LogManager manager = LogManager.getLogManager();
            manager.checkAccess();
            System.out.println("Access checked successfully");
        } catch (SecurityException e) {
            System.out.println("Access check failed: " + e.getMessage());
        }
    }
}
