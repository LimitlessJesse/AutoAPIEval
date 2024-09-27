import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.LogRecord;

public class FileHandler_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        try {
            FileHandler fileHandler = new FileHandler("myLogFile.log");
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        fileHandler.publish(logRecord);
    }
}
