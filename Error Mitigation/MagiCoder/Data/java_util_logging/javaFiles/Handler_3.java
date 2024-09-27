import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Handler_3 {
    public static void main(String[] args) {
        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(record.getMessage());
            }

            @Override
            public void flush() {
            }

            @Override
            public void close() throws SecurityException {
            }
        };

        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a test log message");
        handler.publish(record);
    }
}
