import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class SimpleFormatter_1 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a test log message");
        SimpleFormatter formatter = new SimpleFormatter();
        String formattedMessage = formatter.format(record);
        System.out.println(formattedMessage);
    }
}
