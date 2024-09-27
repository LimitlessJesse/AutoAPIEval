import java.util.logging.XMLFormatter;
import java.util.logging.Handler;

public class XMLFormatter_1 {
    public static void main(String[] args) {
        XMLFormatter xmlFormatter = new XMLFormatter();
        Handler handler = null; // Initialize your handler here
        String header = xmlFormatter.getHead(handler);
        System.out.println(header);
    }
}
