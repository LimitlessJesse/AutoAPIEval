import java.util.logging.Logger;

public class Logger_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is an information message");
    }
}
