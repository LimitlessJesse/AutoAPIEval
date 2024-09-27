import java.util.logging.LogRecord;

public class LogRecord_2 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        System.out.println(record.getLoggerName()); // Output: null
    }
}
