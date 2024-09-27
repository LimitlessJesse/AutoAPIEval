import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXResult_2 {
    public static void main(String[] args) {
        try {
            SAXTransformerFactory factory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
            TransformerHandler handler = factory.newTransformerHandler();
            ContentHandler contentHandler = new DefaultHandler();
            handler.setResult(new SAXResult(contentHandler));
            handler.setLexicalHandler(new DefaultHandler());
            SAXSource source = new SAXSource(new DefaultHandler());
            handler.transform(source, null);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
