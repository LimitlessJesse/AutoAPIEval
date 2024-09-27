import java.util.logging.LogRecord;

public class LogRecord_8 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "Log message");
        long millis = logRecord.getMillis();
        System.out.println("Event time in millis since 1970: " + millis);
    }
}
