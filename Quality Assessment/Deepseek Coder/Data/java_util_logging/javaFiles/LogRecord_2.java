import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class LogRecord_2 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        logRecord.setMessage("This is a new log message");
        System.out.println(logRecord.getMessage());
    }
}
