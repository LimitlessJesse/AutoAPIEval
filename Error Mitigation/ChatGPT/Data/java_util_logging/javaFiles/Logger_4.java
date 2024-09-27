import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_4.class.getName());
        
        try {
            throw new NullPointerException("Null Pointer Exception");
        } catch (NullPointerException e) {
            logger.log(Level.SEVERE, "An error occurred", e);
        }
    }
}
