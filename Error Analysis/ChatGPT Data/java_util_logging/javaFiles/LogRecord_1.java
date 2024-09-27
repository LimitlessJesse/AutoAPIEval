import java.util.logging.LogRecord;

public class LogRecord_1 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        String className = record.getSourceClassName();
        System.out.println("Source class name: " + className);
    }
}
