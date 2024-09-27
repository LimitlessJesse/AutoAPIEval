import java.util.logging.LogRecord;

public class LogRecord_2 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord();
        String loggerName = record.getLoggerName();
        System.out.println("Logger Name: " + loggerName);
    }
}
