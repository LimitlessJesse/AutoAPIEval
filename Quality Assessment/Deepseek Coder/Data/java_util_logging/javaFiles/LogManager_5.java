import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogManager_5 {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager_5.class.getName());
        logger.info("This is a sample log message");
    }
}
