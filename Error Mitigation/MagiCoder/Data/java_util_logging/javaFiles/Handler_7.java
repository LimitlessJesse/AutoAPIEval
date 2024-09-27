import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Handler_7 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.mycompany.myapp");
        Handler handler = new StreamHandler();
        handler.setFormatter(new SimpleFormatter());
        try {
            handler.setEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        logger.addHandler(handler);
        logger.info("This is an information message");
    }
}
