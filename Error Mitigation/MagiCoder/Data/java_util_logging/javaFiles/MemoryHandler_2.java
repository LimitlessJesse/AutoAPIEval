import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.MemoryHandler;

public class MemoryHandler_2 {
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

        MemoryHandler memoryHandler = new MemoryHandler(handler, 10, Level.ALL);

        memoryHandler.push();
    }
}
