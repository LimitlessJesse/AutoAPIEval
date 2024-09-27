import java.util.logging.MemoryHandler;
import java.util.logging.LogRecord;

public class MemoryHandler_1 {
    public static void main(String[] args) {
        MemoryHandler handler = new MemoryHandler();
        LogRecord record = new LogRecord(Level.INFO, "Sample log message");
        handler.push(record);
    }
}
