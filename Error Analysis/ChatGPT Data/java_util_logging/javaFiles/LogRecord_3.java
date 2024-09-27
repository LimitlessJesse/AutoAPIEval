import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LogRecord_3 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        Level level = record.getLevel();
        System.out.println("Log level: " + level.getName());
    }
}
