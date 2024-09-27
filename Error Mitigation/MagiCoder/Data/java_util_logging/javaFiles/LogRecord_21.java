import java.util.logging.LogRecord;

public class LogRecord_21 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        logRecord.setParameters(new Object[]{"Hello", "World"});
    }
}
