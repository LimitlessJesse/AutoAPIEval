import java.util.logging.LogRecord;

public class LogRecord_58 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(java.util.logging.Level.INFO, "This is a log message");
        logRecord.setParameters(new Object[]{"param1", "param2"});
        Object[] parameters = logRecord.getParameters();
        for (Object param : parameters) {
            System.out.println(param);
        }
    }
}
