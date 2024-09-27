import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Formatter_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new CustomFormatter());
        logger.addHandler(handler);

        logger.info("This is an informational message");
        logger.warning("This is a warning message");
    }
}
