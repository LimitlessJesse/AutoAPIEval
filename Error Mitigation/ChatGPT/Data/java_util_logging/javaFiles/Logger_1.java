import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_1.class.getName());
        logger.log(Level.INFO, "This is an informational message");
    }
}
