import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Handler_1 {
    public static void main(String[] args) {
        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord record) {
                // Implement the logic to publish the log record
                System.out.println("Log message: " + record.getMessage());
            }

            @Override
            public void flush() {
                // Implement the logic to flush any buffered output
            }

            @Override
            public void close() throws SecurityException {
                // Implement the logic to close the handler
            }
        };
        
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        handler.publish(logRecord);
    }
}
