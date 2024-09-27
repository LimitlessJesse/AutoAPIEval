import java.util.logging.LogRecord;

public class LogRecord_3 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord();
        long millis = record.getMillis();
        System.out.println("Event time in milliseconds since 1970: " + millis);
    }
}
