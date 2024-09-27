import java.util.logging.Formatter;
import java.util.logging.Handler;

public class Formatter_3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter() {
            @Override
            public String format(java.util.logging.LogRecord record) {
                return null;
            }

            @Override
            public String getTail(Handler h) {
                return super.getTail(h);
            }
        };

        // You can use the formatter here
    }
}
