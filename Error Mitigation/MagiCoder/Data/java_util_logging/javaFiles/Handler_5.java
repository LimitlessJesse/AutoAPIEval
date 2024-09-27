import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Handler_5 {
    public static void main(String[] args) {
        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(record.getMessage());
            }

            @Override
            public void flush() {
            }

            @Override
            public void close() throws SecurityException {
            }
        };

        handler.setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getLevel() == Level.INFO;
            }
        });

        handler.publish(new LogRecord(Level.INFO, "This will be logged"));
        handler.publish(new LogRecord(Level.SEVERE, "This will not be logged"));
    }
}
