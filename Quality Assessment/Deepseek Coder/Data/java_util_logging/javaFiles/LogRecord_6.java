import java.util.logging.*;

public class LogRecord_6 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_6.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a test log record");
        logger.log(logRecord);

        LogRecord logRecord2 = new LogRecord(Level.WARNING, "This is another test log record");
        logRecord2.setLevel(Level.SEVERE);
        logger.log(logRecord2);
    }
}
