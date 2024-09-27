import java.util.logging.*;

public class MemoryHandler_18 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MemoryHandler_18.class.getName());
        Handler handler = new MemoryHandler(new ConsoleHandler(), 0, Level.ALL);
        logger.addHandler(handler);

        logger.setLevel(Level.FINE);
        logger.severe("Severe Log");
        logger.warning("Warning Log");
        logger.info("Info Log");
        logger.config("Config Log");
        logger.fine("Fine Log");
        logger.finer("Finer Log");
        logger.finest("Finest Log");

        Level pushLevel = handler.getPushLevel();
        System.out.println("Push Level: " + pushLevel);
    }
}
