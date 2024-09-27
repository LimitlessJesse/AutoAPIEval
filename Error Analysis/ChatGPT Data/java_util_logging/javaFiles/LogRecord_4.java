import java.util.logging.LogRecord;

public class LogRecord_4 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        Throwable throwable = record.getThrown();
        if (throwable != null) {
            throwable.printStackTrace();
        }
    }
}
