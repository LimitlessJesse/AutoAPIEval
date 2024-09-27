import java.util.logging.Handler;
import java.util.logging.XMLFormatter;

public class XMLFormatter_3 {
    public static void main(String[] args) {
        Handler handler = null; // You need to provide a handler here
        XMLFormatter xmlFormatter = new XMLFormatter();
        String tail = xmlFormatter.getTail(handler);
        System.out.println(tail);
    }
}
