import java.util.logging.LogRecord;
import java.util.ResourceBundle;

public class LogRecord_20 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        System.out.println(resourceBundle);
    }
}
