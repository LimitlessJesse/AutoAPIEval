import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ContentHandler;

public class SAXResult_2 {
    public static void main(String[] args) {
        SAXResult saxResult = new SAXResult();
        ContentHandler contentHandler = saxResult.getHandler();
        // Now you can use the contentHandler for handling SAX events
    }
}
