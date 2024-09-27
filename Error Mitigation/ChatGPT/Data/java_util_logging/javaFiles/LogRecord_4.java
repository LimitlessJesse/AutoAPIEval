import java.util.logging.LogRecord;

public class LogRecord_4 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord();
        record.setMessage("This is a log message");
        String message = record.getMessage();
        System.out.println("Raw message: " + message);
    }
}
