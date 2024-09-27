import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;

public class Handler_6 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Handler_6.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.FINEST);
        logger.severe("Severe message");
        logger.warning("Warning message");
        logger.info("Info message");
        logger.config("Config message");
        logger.fine("Fine message");
        logger.finer("Finer message");
        logger.finest("Finest message");
    }
}
