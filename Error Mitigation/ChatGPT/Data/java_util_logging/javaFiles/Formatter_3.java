import java.util.logging.Formatter;
import java.util.logging.Handler;

public class Formatter_3 {
    public static void main(String[] args) {
        MyFormatter formatter = new MyFormatter();
        String tail = formatter.getTail(null);
        System.out.println("Tail string: " + tail);
    }

    static class MyFormatter extends Formatter {
        @Override
        public String getTail(Handler h) {
            return "End of log records";
        }
    }
}
