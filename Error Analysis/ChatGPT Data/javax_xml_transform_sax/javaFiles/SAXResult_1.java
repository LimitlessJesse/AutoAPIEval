import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ContentHandler;

public class SAXResult_1 {
    public static void main(String[] args) {
        SAXResult result = new SAXResult();
        ContentHandler handler = new ContentHandler() {
            // Override methods from ContentHandler interface
        };
        result.setHandler(handler);
    }
}
