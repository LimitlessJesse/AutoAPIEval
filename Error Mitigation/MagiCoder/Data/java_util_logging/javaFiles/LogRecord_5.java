import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LogRecord_5 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(Level.SEVERE, "This is a severe log message");
        logRecord.setLevel(Level.SEVERE);
    }
}
