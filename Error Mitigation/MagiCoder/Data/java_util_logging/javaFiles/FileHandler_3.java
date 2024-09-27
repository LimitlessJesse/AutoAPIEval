import java.util.logging.FileHandler;
import java.util.logging.LogRecord;

public class FileHandler_3 {
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
            fileHandler.publish(logRecord);
            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
