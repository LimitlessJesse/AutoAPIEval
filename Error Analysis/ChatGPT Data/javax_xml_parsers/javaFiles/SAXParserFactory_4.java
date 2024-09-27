import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class SAXParserFactory_4 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        
        try {
            // Code to parse XML with the namespace awareness set
        } catch (SAXException e) {
            System.out.println("Error while setting namespace awareness: " + e.getMessage());
        }
    }
}
