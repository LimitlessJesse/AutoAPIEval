import java.util.logging.*;

public class LogRecord_16 {
    public static void main(String[] args) {
        // Create a Logger
        Logger logger = Logger.getLogger(LogRecord_16.class.getName());

        // Create a LogRecord
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");

        // Set the thread ID of the log record
        logRecord.setThreadID(Thread.currentThread().getId());

        // Log the log record
        logger.log(logRecord);
    }
}
