import java.util.logging.LogRecord;

public class LogRecord_9 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "Log message");
        logRecord.setSourceClassName("LogRecord_9");
        System.out.println("Source Class Name: " + logRecord.getSourceClassName());
    }
}
