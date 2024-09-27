import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogManager_3 {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger("");
        if (logger!= null) {
            logger.info("Logger found!");
        } else {
            System.out.println("Logger not found!");
        }
    }
}
