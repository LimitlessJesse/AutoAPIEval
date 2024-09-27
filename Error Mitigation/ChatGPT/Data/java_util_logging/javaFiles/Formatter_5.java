import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Formatter_5 {
    public static void main(String[] args) {
        MyFormatter formatter = new MyFormatter();
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        String formattedMessage = formatter.formatMessage(record);
        System.out.println(formattedMessage);
    }
}

class MyFormatter extends Formatter {
    @Override
    public String formatMessage(LogRecord record) {
        String message = record.getMessage();
        // Perform localization and formatting here
        return message.toUpperCase(); // Example: Convert message to uppercase
    }
}
