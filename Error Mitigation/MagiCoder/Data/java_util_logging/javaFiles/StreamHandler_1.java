import java.util.logging.StreamHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class StreamHandler_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        StreamHandler streamHandler = new StreamHandler();
        streamHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(streamHandler);

        logger.info("This is an information message");

        try {
            streamHandler.close();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
