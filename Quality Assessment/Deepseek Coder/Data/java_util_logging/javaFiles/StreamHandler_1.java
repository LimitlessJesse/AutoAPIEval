import java.util.logging.*;

public class StreamHandler_1 {
    public static void main(String[] args) {
        // Create a Logger
        Logger logger = Logger.getLogger(StreamHandler_1.class.getName());

        // Create a StreamHandler
        StreamHandler streamHandler = new StreamHandler();

        // Set the level of the StreamHandler
        streamHandler.setLevel(Level.ALL);

        // Add the StreamHandler to the Logger
        logger.addHandler(streamHandler);

        // Create a LogRecord
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");

        // Publish the LogRecord
        streamHandler.publish(record);

        // Close the StreamHandler
        streamHandler.close();
    }
}
