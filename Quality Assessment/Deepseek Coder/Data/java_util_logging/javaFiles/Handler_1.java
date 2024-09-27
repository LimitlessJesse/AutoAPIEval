import java.util.logging.*;

public class Handler_1 {
    public static void main(String[] args) {
        // Create a Logger
        Logger logger = Logger.getLogger(Handler_1.class.getName());

        // Create a ConsoleHandler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // Create a Formatter
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        // Set the formatter to the consoleHandler
        consoleHandler.setFormatter(simpleFormatter);

        // Add consoleHandler to logger
        logger.addHandler(consoleHandler);

        // Create a LogRecord
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");

        // Publish the logRecord
        logger.publish(logRecord);
    }
}
