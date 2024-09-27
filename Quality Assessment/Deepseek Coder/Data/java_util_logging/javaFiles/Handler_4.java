import java.util.logging.*;

public class Handler_4 {
    public static void main(String[] args) {
        // Create a logger
        Logger logger = Logger.getLogger(Handler_4.class.getName());

        // Create a console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // Create a simple formatter
        Formatter simpleFormatter = new SimpleFormatter();

        // Set the formatter to the console handler
        consoleHandler.setFormatter(simpleFormatter);

        // Add the console handler to the logger
        logger.addHandler(consoleHandler);

        // Log a message
        logger.info("This is an information message");
    }
}
