import java.util.logging.StreamHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class StreamHandler_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(StreamHandler_2.class.getName());
        StreamHandler handler = new StreamHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.info("This is an info message");
        handler.flush();
    }
}
