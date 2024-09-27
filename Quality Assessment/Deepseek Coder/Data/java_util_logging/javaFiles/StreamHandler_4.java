import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

public class StreamHandler_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        StreamHandler handler = new StreamHandler();

        try {
            OutputStream out = new FileOutputStream("log.txt");
            handler.setOutputStream(out);
            logger.addHandler(handler);

            logger.info("This is a log message");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
