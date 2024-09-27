import java.util.logging.Logger;
import java.util.logging.LogManager;

public class LogManager_1 {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger("myLogger");
        
        if(logger == null) {
            System.out.println("Logger not found");
        } else {
            logger.info("This is a log message");
        }
    }
}
