import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Handler_1 {
    public static void main(String[] args) {
        CustomHandler handler = new CustomHandler();
        LogRecord record = new LogRecord(Level.INFO, "Sample log message");
        handler.publish(record);
    }

    static class CustomHandler extends Handler {
        @Override
        public void publish(LogRecord record) {
            // Custom logic for handling the log record
            System.out.println("Log message: " + record.getMessage());
        }

        @Override
        public void flush() {
            // Method implementation for flushing any buffered output
        }

        @Override
        public void close() throws SecurityException {
            // Method implementation for closing the handler
        }
    }
}
