import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class FileHandler_5 {
    public static void main(String[] args) {
        try {
            Logger logger = Logger.getLogger("MyLogger");
            FileHandler fileHandler = new FileHandler("myLogFile.log");
            logger.addHandler(fileHandler);
            logger.info("This is a test log message");
            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
