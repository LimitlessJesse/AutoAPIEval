import java.util.logging.*;

public class SimpleFormatter_1 {
    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "This is a log message");
        SimpleFormatter formatter = new SimpleFormatter();
        String message = formatter.format(record);
        System.out.println(message);
    }
}
