import java.util.logging.Formatter;
import java.util.logging.Handler;

public class Formatter_2 {
    public static void main(String[] args) {
        MyFormatter formatter = new MyFormatter();
        String header = formatter.getHead(null);
        System.out.println("Header: " + header);
    }

    static class MyFormatter extends Formatter {
        @Override
        public String getHead(Handler h) {
            return "=== Log Records Header ===";
        }
    }
}
