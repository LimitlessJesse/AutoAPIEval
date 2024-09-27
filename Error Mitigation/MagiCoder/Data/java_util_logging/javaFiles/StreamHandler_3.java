import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class StreamHandler_3 {
    public static void main(String[] args) {
        StreamHandler streamHandler = new StreamHandler();
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a test log message");
        streamHandler.publish(logRecord);
    }
}
