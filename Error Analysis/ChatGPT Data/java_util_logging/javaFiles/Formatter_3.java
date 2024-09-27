import java.util.logging.Formatter;
import java.util.logging.Handler;

public class Formatter_3 {
    
    public static void main(String[] args) {
        Handler handler = // initialize your Handler instance
        Formatter formatter = // initialize your Formatter instance
        String tail = formatter.getTail(handler);
        
        System.out.println("Tail: " + tail);
    }
}
