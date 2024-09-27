import java.util.logging.LogRecord;
import java.util.logging.Level;

public class LogRecord_10 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(Level.SEVERE, "This is a log message");
        Throwable thrown = new Throwable("This is a thrown exception");
        logRecord.setThrown(thrown);

        System.out.println(logRecord.getThrown());
    }
}
