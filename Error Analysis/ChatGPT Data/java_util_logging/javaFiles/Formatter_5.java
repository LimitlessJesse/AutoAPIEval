import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Formatter_5 {
    public static void main(String[] args) {
        MyFormatter formatter = new MyFormatter();
        LogRecord record = new LogRecord(Level.INFO, "Sample log message");
        String formattedMessage = formatter.formatMessage(record);
        System.out.println("Formatted message: " + formattedMessage);
    }

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getMessage();
        }
    }
}
