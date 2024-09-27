import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Formatter_1 {
    public static void main(String[] args) {

    }

    public String format(LogRecord record) {
        // Customize the log record formatting here
        return record.getMessage();
    }
}
