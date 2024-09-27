import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_15 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_15.class.getName());
        LogRecord logRecord = new LogRecord(java.util.logging.Level.SEVERE, "This is a test log message");
        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            logRecord.setThrown(e);
        }
        logger.log(logRecord);
    }
}
