import java.util.logging.LogRecord;

public class LogRecord_7 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        logRecord.setMillis(System.currentTimeMillis());
        System.out.println("Event time: " + logRecord.getMillis());
    }
}
