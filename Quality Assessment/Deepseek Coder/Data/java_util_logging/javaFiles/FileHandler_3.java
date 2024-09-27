import java.util.logging.*;

public class FileHandler_3 {
    public static void main(String[] args) {
        try {
            // Create a Logger
            Logger logger = Logger.getLogger(FileHandler_3.class.getName());

            // Create a FileHandler
            FileHandler fh = new FileHandler("logFile.txt");

            // Add FileHandler to Logger
            logger.addHandler(fh);

            // Create a LogRecord
            LogRecord record = new LogRecord(Level.INFO, "This is a log message");

            // Publish the LogRecord
            logger.publish(record);

            // Close the FileHandler
            fh.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
