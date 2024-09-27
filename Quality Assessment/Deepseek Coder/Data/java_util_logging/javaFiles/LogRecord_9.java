import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LogRecord_9 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogRecord_9.class.getName());

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            LogRecord logRecord = new LogRecord(Level.SEVERE, "An error occurred");
            logRecord.setThrown(e);
            logger.log(logRecord);

            Throwable thrown = logRecord.getThrown();
            if (thrown!= null) {
                thrown.printStackTrace();
            }
        }
    }
}
