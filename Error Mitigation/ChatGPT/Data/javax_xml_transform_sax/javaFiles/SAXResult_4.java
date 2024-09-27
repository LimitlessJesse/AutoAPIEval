import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ContentHandler;

public class SAXResult_4 {
    public static void main(String[] args) {
        SAXResult saxResult = new SAXResult();
        ContentHandler contentHandler = saxResult.getHandler();
        System.out.println("ContentHandler: " + contentHandler);
    }
}
