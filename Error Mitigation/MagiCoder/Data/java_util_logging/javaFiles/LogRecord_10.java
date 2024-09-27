import java.util.logging.LogRecord;

public class LogRecord_10 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "Log message");
        logRecord.setSourceClassName("LogRecord_10");
        System.out.println(logRecord.getSourceClassName());
    }
}
