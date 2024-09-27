import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_7 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_7.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        logRecord.setLoggerName(LogRecord_7.class.getName());
        logger.log(logRecord);
        System.out.println(logRecord.getLoggerName());
    }
}
