import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_3.class.getName());
        Level level = Level.INFO;
        String msg = "This is a log message";
        Object[] params = {"param1", "param2"};
        
        logger.log(level, msg, params);
    }
}
