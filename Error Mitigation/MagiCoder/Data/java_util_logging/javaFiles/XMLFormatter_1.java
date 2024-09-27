import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

public class XMLFormatter_1 {
    public static void main(String[] args) {
        XMLFormatter xmlFormatter = new XMLFormatter();
        LogRecord logRecord = new LogRecord(Level.INFO, "This is a test log message");
        String xml = xmlFormatter.format(logRecord);
        System.out.println(xml);
    }
}
