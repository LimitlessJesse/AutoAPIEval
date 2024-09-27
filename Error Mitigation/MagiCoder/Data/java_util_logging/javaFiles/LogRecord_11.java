import java.util.logging.LogRecord;

public class LogRecord_11 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "Log message");
        logRecord.setSourceMethodName("main");
        System.out.println(logRecord.getSourceMethodName());
    }
}
