import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class ConsoleHandler_3 {
    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
        LogRecord record = new LogRecord(Level.INFO, "This is a test log message");
        handler.publish(record);
    }
}
