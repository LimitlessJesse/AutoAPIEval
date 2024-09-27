import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Handler_5 {
    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
        
        // Define a custom formatter
        Formatter customFormatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + "\n";
            }
        };
        
        // Set the custom formatter to the handler
        handler.setFormatter(customFormatter);
    }
}
