import java.util.logging.Logger;

public class Logger_2 {
    
    public static void warning(String msg) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.warning(msg);
    }

    public static void main(String[] args) {
        warning("This is a warning message");
    }
}
