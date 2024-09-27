import java.util.logging.MemoryHandler;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;

public class MemoryHandler_5 {
    public static void main(String[] args) {
        // Create a MemoryHandler with a target ConsoleHandler
        MemoryHandler memoryHandler = new MemoryHandler(new ConsoleHandler(), 1000, Level.FINE);

        // Log some messages
        memoryHandler.publish(memoryHandler.getFormatter().formatMessage(null, "Logging message 1", Level.INFO));
        memoryHandler.publish(memoryHandler.getFormatter().formatMessage(null, "Logging message 2", Level.WARNING));

        System.out.println("Before flushing:");
        System.out.println(memoryHandler.getPushLevel() + " " + memoryHandler.getMemoryUsage());

        // Flush the unsent messages
        memoryHandler.flush();

        System.out.println("After flushing:");
        System.out.println(memoryHandler.getPushLevel() + " " + memoryHandler.getMemoryUsage());
    }
}
