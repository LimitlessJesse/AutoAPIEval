import java.util.logging.*;

public class Formatter_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Formatter_3.class.getName());
        Handler handler = new ConsoleHandler();
        Formatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger.addHandler(handler);

        logger.info("This is the first log message");
        logger.info("This is the second log message");

        String lastLogMessage = handler.getFormatter().toString();
        System.out.println(lastLogMessage);
    }
}
