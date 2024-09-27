import java.util.logging.Handler;
import java.util.logging.XMLFormatter;

public class XMLFormatter_2 {
    public static void main(String[] args) {
        XMLFormatter formatter = new XMLFormatter();
        Handler handler = null; // You need to provide a handler here
        String head = formatter.getHead(handler);
        System.out.println(head);
    }
}
