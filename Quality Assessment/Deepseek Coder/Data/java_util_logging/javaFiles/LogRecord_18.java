import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;
import java.util.logging.Logger;

public class LogRecord_18 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_18.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a test log message");
        logRecord.setResourceBundleName("com.example.MyBundle");

        StreamHandler handler = new StreamHandler();
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);

        logger.log(logRecord);
    }
}
