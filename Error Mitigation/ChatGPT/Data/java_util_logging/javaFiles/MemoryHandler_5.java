import java.util.logging.LogRecord;
import java.util.logging.MemoryHandler;

public class MemoryHandler_5 {
    public static void main(String[] args) {
        MemoryHandler memoryHandler = new MemoryHandler();
        LogRecord logRecord = new LogRecord();
        boolean result = memoryHandler.isLoggable(logRecord);
        System.out.println("Is Loggable: " + result);
    }
}
