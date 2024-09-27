import java.util.logging.LogManager;
import java.io.IOException;
import java.util.logging.LoggingPermission;

public class LogManager_3 {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration();
        } catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
