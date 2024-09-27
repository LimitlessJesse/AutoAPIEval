import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class SimpleFormatter_1 {
    public static void main(String[] args) {
        SimpleFormatter formatter = new SimpleFormatter();
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        String formattedLog = formatter.format(record);
        System.out.println(formattedLog);
    }
}
