import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class LogRecord_14 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        logRecord.setSourceClassName(LogRecord_14.class.getName());
        logRecord.setSourceMethodName("main");

        StreamHandler streamHandler = new StreamHandler();
        streamHandler.setFormatter(new SimpleFormatter());

        streamHandler.publish(logRecord);
        streamHandler.flush();
    }
}
