import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class SAXParserFactory_2 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            System.out.println(parser);
        } catch (ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }
}
