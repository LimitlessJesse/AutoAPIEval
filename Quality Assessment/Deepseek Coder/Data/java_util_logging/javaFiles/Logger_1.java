import java.util.logging.Logger;

public class Logger_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger_1.class.getName());
        logger.severe("This is a severe message");
    }
}
