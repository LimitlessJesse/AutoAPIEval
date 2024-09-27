import java.util.logging.LogRecord;

public class LogRecord_2 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        logRecord.setLoggerName("MyLogger");
        System.out.println(logRecord.getLoggerName());
    }
}
