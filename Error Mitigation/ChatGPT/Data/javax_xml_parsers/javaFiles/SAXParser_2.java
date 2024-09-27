import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public class SAXParser_2 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            
            saxParser.setProperty("http://javax.xml.XMLConstants/property/accessExternalDTD", "deny");
            saxParser.setProperty("http://javax.xml.XMLConstants/property/accessExternalSchema", "deny");
        } catch (SAXNotRecognizedException | SAXNotSupportedException | Exception e) {
            e.printStackTrace();
        }
    }
}
