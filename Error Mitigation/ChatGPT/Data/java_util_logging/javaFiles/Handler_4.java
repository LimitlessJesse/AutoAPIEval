import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Handler_4 {
    public static void main(String[] args) {
        Handler handler = new Handler() {
            @Override
            public boolean isLoggable(LogRecord record) {
                if (record == null) {
                    return false;
                }
                // Add your custom logic here to determine if the LogRecord should be logged
                return true;
            }
        };
        
        LogRecord logRecord = new LogRecord(Level.INFO, "Log message");
        boolean result = handler.isLoggable(logRecord);
        System.out.println("Is LogRecord loggable? " + result);
    }
}
