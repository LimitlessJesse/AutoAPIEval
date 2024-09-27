import java.util.logging.*;

public class MemoryHandler_3 {
    public static void main(String[] args) {
        // Create a logger
        Logger logger = Logger.getLogger(MemoryHandler_3.class.getName());

        // Create a memory handler
        MemoryHandler handler = new MemoryHandler(new ConsoleHandler(), 0, Level.ALL);

        // Set the logger's handler
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);

        // Log a message
        logger.info("This is a test message");

        // Flush the handler
        handler.flush();
    }
}
