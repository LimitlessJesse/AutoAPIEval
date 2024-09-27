import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main");
        log(Level.INFO, "This is an info message");
    }

    private static void log(Level level, String msg) {
        Logger.getLogger("Main").log(level, msg);
    }
}
