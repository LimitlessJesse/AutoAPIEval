import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_8 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        logger.log(record);
        
        record.setLoggerName("NewLogger");
        Logger newLogger = Logger.getLogger(record.getLoggerName());
        newLogger.log(record);
    }
}
