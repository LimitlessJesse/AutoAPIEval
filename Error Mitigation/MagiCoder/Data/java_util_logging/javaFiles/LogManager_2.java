import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogManager_2 {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        try {
            logManager.readConfiguration();
        } catch (Exception e) {
            Logger.getLogger(LogManager_2.class.getName()).severe("Error reading configuration: " + e.getMessage());
        }
    }
}
