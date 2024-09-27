import java.util.logging.*;

public class MemoryHandler_20 {
    public static void main(String[] args) {
        // Create a Logger
        Logger logger = Logger.getLogger(MemoryHandler_20.class.getName());

        // Create a MemoryHandler
        Handler memoryHandler = new MemoryHandler(new ConsoleHandler(), 0, Level.ALL);

        // Add the MemoryHandler to the Logger
        logger.addHandler(memoryHandler);

        // Create a LogRecord
        LogRecord record = new LogRecord(Level.INFO, "This is a test log record");

        // Publish the LogRecord
        memoryHandler.publish(record);
    }
}
