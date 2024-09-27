import java.util.logging.*;

public class Handler_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Handler_5.class.getName());
        Handler handler = new ConsoleHandler();
        Formatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger.addHandler(handler);
        logger.info("This is a test log message");
    }
}
