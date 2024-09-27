import java.util.logging.*;

public class MemoryHandler_19 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MemoryHandler_19.class.getName());
        MemoryHandler handler = new MemoryHandler(logger, 1, Level.ALL);

        LogRecord record = new LogRecord(Level.INFO, "This is a test log record");
        boolean isLoggable = handler.isLoggable(record);

        System.out.println("Is the log record loggable? " + (isLoggable? "Yes" : "No"));
    }
}
