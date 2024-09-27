import java.util.ResourceBundle;
import java.util.logging.LogRecord;

public class LogRecord_43 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        logRecord.setResourceBundle(bundle);
    }
}
