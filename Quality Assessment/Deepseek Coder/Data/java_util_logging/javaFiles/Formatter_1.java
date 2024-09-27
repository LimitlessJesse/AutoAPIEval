import java.util.logging.*;

public class Formatter_1 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + ": " + record.getMessage() + "\n";
            }
        };
        System.out.println(formatter.format(record));
    }
}
