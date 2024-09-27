import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.SAXException;

public class SAXParserFactory_2 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setNamespaceAware(true);
            SAXParser parser = factory.newSAXParser();
            System.out.println("Namespace awareness set to true");
        } catch (Exception e) {
            System.out.println("Error setting namespace awareness: " + e.getMessage());
        }
    }
}
