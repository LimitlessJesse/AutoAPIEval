import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Logger_5Logger");
        
        // Set log level to INFO
        logger.setLevel(Level.INFO);
        
        // Log a message
        logger.info("This is an INFO message");
    }
}
