import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Logger_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_4.class.getName());
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        logger.log(record);
    }
}
