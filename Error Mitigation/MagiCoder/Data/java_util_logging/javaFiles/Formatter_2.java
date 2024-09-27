import java.util.logging.Formatter;
import java.util.logging.Handler;

public class Formatter_2 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter() {
            @Override
            public String format(java.util.logging.LogRecord record) {
                return null;
            }

            @Override
            public String getHead(Handler h) {
                return super.getHead(h);
            }
        };

        System.out.println(formatter.getHead(null));
    }
}
