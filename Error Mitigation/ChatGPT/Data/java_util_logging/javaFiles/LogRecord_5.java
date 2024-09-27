import java.util.logging.LogRecord;

public class LogRecord_5 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        Throwable throwable = record.getThrown();
        System.out.println("Throwable associated with the log record: " + throwable);
    }
}
