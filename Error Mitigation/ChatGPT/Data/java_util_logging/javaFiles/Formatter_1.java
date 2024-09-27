import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return formatMessage(record);
    }

    public static void main(String[] args) {
        CustomFormatter customFormatter = new CustomFormatter();
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a log message");
        String formattedLog = customFormatter.format(logRecord);
        System.out.println(formattedLog);
    }
}
