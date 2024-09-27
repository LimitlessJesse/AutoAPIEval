import java.util.logging.*;

public class SocketHandler_3 {
    public static void main(String[] args) {
        // Create a Logger
        Logger logger = Logger.getLogger(SocketHandler_3.class.getName());

        // Create a SocketHandler
        SocketHandler socketHandler = new SocketHandler();

        // Set the formatter for the SocketHandler
        socketHandler.setFormatter(new SimpleFormatter());

        // Add the SocketHandler to the Logger
        logger.addHandler(socketHandler);

        // Create a LogRecord
        LogRecord record = new LogRecord(Level.INFO, "This is a test log message");

        // Publish the LogRecord
        socketHandler.publish(record);
    }
}
