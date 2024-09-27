import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class LogRecord_4 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        logRecord.setMillis(System.currentTimeMillis());
        System.out.println(new SimpleFormatter().format(logRecord));
    }
}
