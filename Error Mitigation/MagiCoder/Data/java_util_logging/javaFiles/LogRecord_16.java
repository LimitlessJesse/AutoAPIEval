import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_16 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_16.class.getName());
        LogRecord logRecord = new LogRecord(java.util.logging.Level.SEVERE, "This is a test log");
        logRecord.setThrown(new Exception("This is an exception"));

        Throwable thrown = logRecord.getThrown();
        if (thrown!= null) {
            logger.log(logRecord);
        }
    }
}
