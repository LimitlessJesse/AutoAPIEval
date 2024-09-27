import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Handler_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Handler_1.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        logger.log(Level.INFO, "This is an information message");
        handler.close();
    }
}
