import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_12 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_12.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        logRecord.setSourceClassName("LogRecord_12");
        logger.log(logRecord);
    }
}
