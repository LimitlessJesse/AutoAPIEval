import java.util.logging.Level;
import java.util.logging.Logger;

public class Logger_5 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Level level = logger.getLevel();
        System.out.println("Logger Level: " + level);
    }
}
