import java.util.logging.Logger;
import java.util.logging.Level;

public class Logger_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_5.class.getName());
        logger.setLevel(Level.FINE);
        logger.fine("This is a fine log message");
    }
}
