import java.util.logging.Logger;

public class Logger_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_4.class.getName());
        logger.config("This is a config message");
    }
}
