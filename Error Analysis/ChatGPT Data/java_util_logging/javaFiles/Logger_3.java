import java.util.logging.Logger;

public class Logger_3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.severe("This is a severe error message");
    }
}
