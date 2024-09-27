import java.util.logging.LogRecord;
import java.util.logging.MemoryHandler;

public class MemoryHandler_3 {
    public static void main(String[] args) {
        MemoryHandler memoryHandler = new MemoryHandler();
        LogRecord record = new LogRecord(Level.INFO, "Sample log message");
        memoryHandler.publish(record);
    }
}
