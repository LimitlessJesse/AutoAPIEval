import java.util.logging.LogRecord;

public class LogRecord_3 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        logRecord.setMessage("This is a test message");
        System.out.println(logRecord.getMessage());
    }
}
