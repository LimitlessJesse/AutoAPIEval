import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

public class XMLFormatter_3 {
    public static void main(String[] args) {
        XMLFormatter xmlFormatter = new XMLFormatter();
        LogRecord logRecord = new LogRecord(1, "Sample log message");
        String formattedLog = xmlFormatter.format(logRecord);
        System.out.println(formattedLog);
    }
}
