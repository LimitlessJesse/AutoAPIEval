import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
import java.io.InputStream;
import org.xml.sax.SAXException;
import java.io.IOException;

public class SAXParser_1 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            
            InputStream is = Main.class.getResourceAsStream("your_xml_file.xml");
            DefaultHandler handler = new DefaultHandler();
            parser.parse(is, handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
