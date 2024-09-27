import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.MemoryHandler;

public class MemoryHandler_2 {
    public static void main(String[] args) {
        MemoryHandler handler = new MemoryHandler();
        LogRecord record = new LogRecord(Level.INFO, "Sample log message");
        boolean isLoggable = handler.isLoggable(record);
        System.out.println("Is Log Record Loggable? " + isLoggable);
    }
}
