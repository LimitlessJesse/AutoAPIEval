import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_3.class.getName());
        try {
            // some code that may throw an exception
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An error occurred", e);
        }
    }
}
