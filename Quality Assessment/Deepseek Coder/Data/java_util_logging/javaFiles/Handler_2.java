import java.util.logging.*;

public class Handler_2 {
    public static void main(String[] args) {
        // Create a new logger
        Logger logger = Logger.getLogger(Handler_2.class.getName());

        // Create a new handler
        Handler handler = new ConsoleHandler();

        // Add the handler to the logger
        logger.addHandler(handler);

        // Log a message
        logger.info("This is a test message");

        // Flush the handler
        handler.flush();
    }
}
