import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class LogRecord_3 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        long millis = logRecord.getMillis();
        System.out.println(millis);
    }
}
