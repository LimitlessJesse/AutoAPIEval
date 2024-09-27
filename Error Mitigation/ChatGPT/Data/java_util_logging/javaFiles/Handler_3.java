import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Handler_3 {
    public static void main(String[] args) {
        Handler handler = new ConsoleHandler();
        Logger logger = Logger.getLogger("Handler_3Logger");
        logger.addHandler(handler);
        
        // Perform logging operations
        
        handler.close();
    }
}
