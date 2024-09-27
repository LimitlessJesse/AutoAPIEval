import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LogRecord_5 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        System.out.println("Log level: " + logRecord.getLevel());
    }
}
