import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Handler_2 {
    public static void main(String[] args) {
        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord record) {
                // Implementation not needed for this example
            }

            @Override
            public void flush() {
                // Implementation not needed for this example
            }

            @Override
            public void close() throws SecurityException {
                // Implementation not needed for this example
            }
        };

        handler.flush();
    }
}
