import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParser_3 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            InputSource inputSource = new InputSource("example.xml");
            DefaultHandler handler = new DefaultHandler();
            
            saxParser.parse(inputSource, handler);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
