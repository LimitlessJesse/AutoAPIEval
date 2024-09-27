import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_2.class.getName());
        Level level = Level.INFO;
        String msg = "Logging message with parameter";
        Object param1 = "Parameter value";
        
        logger.log(level, msg, param1);
    }
}
