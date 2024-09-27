import java.util.logging.*;

public class Formatter_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Formatter_2.class.getName());
        Handler handler = new ConsoleHandler();
        Formatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger.addHandler(handler);

        LogRecord logRecord = new LogRecord(Level.INFO, "Log message");
        formatter.getHead(handler);

        logger.log(logRecord);
    }
}
