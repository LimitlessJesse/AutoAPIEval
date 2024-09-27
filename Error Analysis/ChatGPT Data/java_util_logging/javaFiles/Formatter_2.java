import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Formatter_2 {
    
    private static Formatter formatter = new Formatter() {
        @Override
        public String format(LogRecord record) {
            return record.getMessage();
        }

        @Override
        public String getHead(Handler h) {
            return "Log Header: ";
        }
    };
    
    public static void main(String[] args) {
        Handler handler = null; // initialize your handler here
        System.out.println(formatter.getHead(handler));
    }
}
