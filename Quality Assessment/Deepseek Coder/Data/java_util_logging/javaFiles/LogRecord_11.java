import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_11 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_11.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        logger.log(logRecord);

        String sourceClassName = logRecord.getSourceClassName();
        System.out.println("Source Class Name: " + sourceClassName);
    }
}
