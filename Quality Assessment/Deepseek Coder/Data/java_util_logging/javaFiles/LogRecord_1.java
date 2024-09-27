import java.util.logging.*;

public class LogRecord_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_1.class.getName());
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a test message");
        logger.log(logRecord);

        Handler handler = new ConsoleHandler();
        logger.addHandler(handler);

        logger.info("Another test message");

        // Get the message from the log record
        String message = logRecord.getMessage();
        System.out.println(message);
    }
}
