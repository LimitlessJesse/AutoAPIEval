import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_2.class.getName());
        logger.log(Level.INFO, "This is a log message");
    }
}
