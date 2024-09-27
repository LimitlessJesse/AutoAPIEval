import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LogRecord_17 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_17.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        logger.log(logRecord);

        String resourceBundleName = logRecord.getResourceBundleName();
        System.out.println("Resource Bundle Name: " + resourceBundleName);
    }
}
