import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Formatter_4 {
    public static void main(String[] args) {
        MyFormatter formatter = new MyFormatter();
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        String formattedMessage = formatter.formatMessage(record);
        System.out.println(formattedMessage);
    }

    static class MyFormatter extends Formatter {
        @Override
        public String formatMessage(LogRecord record) {
            // Localization and formatting logic here
            return "Formatted message: " + record.getMessage();
        }
    }
}
