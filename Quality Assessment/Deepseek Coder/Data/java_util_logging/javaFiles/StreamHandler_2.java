import java.util.logging.*;

public class StreamHandler_2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(StreamHandler_2.class.getName());
        StreamHandler handler = new StreamHandler(System.out, new SimpleFormatter());
        logger.addHandler(handler);
        logger.info("This is a log message");
        handler.flush(); // This will flush the output stream
    }
}
