import java.util.logging.LogRecord;

public class LogRecord_4 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a test message");
        System.out.println(logRecord.getMessage());
    }
}
